package com.laofaner.springboot.controller.pushgateway.service.impl;

import com.laofaner.springboot.controller.pushgateway.service.PushGateWayService;
import com.laofaner.springboot.controller.pushgateway.strategy.MetricHandleStrategy;
import com.laofaner.springboot.controller.pushgateway.strategy.MetricHandleStrategyContext;
import com.laofaner.springboot.controller.pushgateway.vo.MetricVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Service
public class PushGateWayServiceImpl implements PushGateWayService {

    private static final String HASHTAG_HELP = "# HELP ";
    private static final String HASHTAG_TYPE = "# TYPE ";
    private static final String INSTANCE = "instance";
    private static final String METRIC_TYPE = "metricType";

//    @Value("${prometheus.pushgateway.url}")
//    private String pushgatewayURL;

    @Autowired
    private MetricHandleStrategyContext metricHandleStrategyContext;

    @Override
    public List<MetricVO> push(HttpServletRequest request) {
        //获取请求URI
        String requestURI = request.getRequestURI();

        //从URL中解析出job标签
        String job = getJobNameFromURI(requestURI);

        //从URL中解析出instance标签
        String instance = getInstanceNameFromURI(requestURI);

        //解析请求体，根据请求体内容解析、处理、推送指标数据
        String body;
        try (ServletInputStream inputStream = request.getInputStream()) {
            body = inputStreamToString(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (StringUtils.isEmpty(body)) {
            throw new RuntimeException("request body cannot be empty");
        }
        //1、指标解析
        List<MetricVO> originalMetrics = parseMetrics(body, job, instance);
        //2、指标处理，附加指标计算
        List<MetricVO> metricsToBePushed = calculateMetrics(originalMetrics);
        //3、指标推送
        assert metricsToBePushed != null;
        pushMetrics(metricsToBePushed);
        return null;
    }

    private String getInstanceNameFromURI(String requestURI) {
        String instance = null;
        String jobSubURI = requestURI.substring(requestURI.indexOf("/job/") + 5);
        if (jobSubURI.contains(INSTANCE)) {
            String instanceSubstring = jobSubURI.substring(jobSubURI.indexOf(INSTANCE) + INSTANCE.length() + 1);
            if (instanceSubstring.contains("/")) {
                instance = instanceSubstring.substring(0, instanceSubstring.indexOf("/"));
            }
        }
        return instance;
    }

    private String getJobNameFromURI(String requestURI) {
        String job;
        String jobSubURI = requestURI.substring(requestURI.indexOf("/job/") + 5);
        if (jobSubURI.contains("/")) {
            job = jobSubURI.substring(0, jobSubURI.indexOf("/"));
        } else {
            job = jobSubURI;
        }
        return job;
    }

    private List<MetricVO> parseMetrics(String standardPushgatewayText, String job, String instance) {

        if (!standardPushgatewayText.contains(HASHTAG_HELP) || !standardPushgatewayText.contains(HASHTAG_TYPE)) {
            throw new RuntimeException("illegal body: for no # HELP or # TYPE presents in the text");
        }
        List<MetricVO> metrics = new ArrayList<>();
        String[] metricArr = standardPushgatewayText.split(HASHTAG_HELP);
        for (int i = 1; i < metricArr.length; i++) {
            String metricDetail = metricArr[i];

            //解析指标名称
            String metricName = metricDetail.substring(0, metricDetail.indexOf(32)).trim();

            //解析 help 内容
            String help = metricDetail.substring(metricDetail.indexOf(metricName) + metricName.length(), metricDetail.indexOf(HASHTAG_TYPE)).trim();
            int typeStartIndex = metricDetail.indexOf(HASHTAG_TYPE + metricName) + (HASHTAG_TYPE + metricName).length();
            String typeSubstring = metricDetail.substring(typeStartIndex).trim();

            //解析 type  (counter/gauge/summary/histogram)
            String type = typeSubstring.substring(0, typeSubstring.indexOf(metricName)).trim();

            // 解析labelNames 和 labelValues
            List<String> labelNameList = new ArrayList<>();
            List<String> labelValueList = new ArrayList<>();
            TreeMap<String, String> labelMap = new TreeMap<>();
            if (metricDetail.contains("{")) {
                String labelsString = typeSubstring.substring(typeSubstring.indexOf(123) + 1, typeSubstring.indexOf(125)).trim();
                String[] labels = labelsString.split(",");
                for (String singleLabelString : labels) {
                    if (StringUtils.isEmpty(singleLabelString) || !singleLabelString.contains("=")) {
                        continue;
                    }
                    String labelName = singleLabelString.substring(0, singleLabelString.indexOf("="));
                    String labelValue = singleLabelString.substring(singleLabelString.indexOf("=") + 1).replace("\"", "");
                    labelNameList.add(labelName);
                    labelValueList.add(labelValue);
                    labelMap.put(labelName, labelValue);
                }
            }
            String[] labelNames = new String[labelNameList.size()];
            labelNameList.toArray(labelNames);
            String[] labelValues = new String[labelValueList.size()];
            labelValueList.toArray(labelValues);

            // 解析指标值
            double metricValue = Double.parseDouble(metricDetail.substring(metricDetail.lastIndexOf(32)).trim());

            //构造metricVO对象并填充属性
            MetricVO metricVO = new MetricVO()
                    .setName(metricName)
                    .setHelp(help)
                    .setJob(job)
                    .setType(type)
                    .setValue(metricValue)
                    .setLabelNames(labelNames)
                    .setLabelValues(labelValues)
                    .setLabels(labelMap);
            metrics.add(metricVO);
        }
        return metrics;
    }

    private List<MetricVO> calculateMetrics(List<MetricVO> metrics) {
        //2、指标加工计算（使用redis存储上一次的指标值）
        // (1)、对于瞬时值，先向pushgateway推送，再计算累计值指标，需要redis存入当日累计值，接到瞬时值就+瞬时值更新redis并向pushgateway推送
        // (2)、对于累计值，先向pushgateway推送，再计算瞬时值指标，需要redis存入上一个累计值，并根据当前值减去上一个累计值，计算瞬时值指标推向pushgateway
        // (3)、对于同一种数据类型且任务名称相同的指标数据，需要做累加操作，多个推送值累加到这一个值上来
        List<MetricVO> metricsToBePushed = new ArrayList<>();
        metrics.forEach(metricVO -> {
            Map<String, String> labels = metricVO.getLabels();
            String metricType = labels.get(METRIC_TYPE);
            //如果metricType不为空，则需要根据不同的metricType进行操作
            if (!StringUtils.isEmpty(metricType)) {
                MetricHandleStrategy handler = metricHandleStrategyContext.getHandler(metricType);
                List<MetricVO> metricVOS = handler.handleMetric(metricVO);
            }

            //redis.get("key",value)
            //redis.set("key",value)

        });
        return null;
    }

    private void pushMetrics(List<MetricVO> metrics) {
        metrics.parallelStream()
                .forEach(metricVO -> {
//                    Gauge
                });
    }

    private String inputStreamToString(InputStream inputStream) throws IOException {
        final StringBuilder out = new StringBuilder();
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        String line;
        while ((line = in.readLine()) != null) {
            out.append(line);
        }
        return out.toString();
    }
}
