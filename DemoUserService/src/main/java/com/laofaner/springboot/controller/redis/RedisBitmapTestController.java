package com.laofaner.springboot.controller.redis;

import com.laofaner.springboot.common.ReturnModel;
import com.laofaner.springboot.controller.pushgateway.vo.MetricVO;
import com.laofaner.springboot.util.JedisUtil;
import com.laofaner.springboot.util.RedisKeyHandleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.*;

@RestController
@RequestMapping("redis")
public class RedisBitmapTestController {
    @Autowired
    private JedisUtil jedisUtil;

    @GetMapping("redisTest")
    public ReturnModel redisTest() {

        byte[] redisBitmapData = jedisUtil.get("key1".getBytes());

//        BitSet bitSet2 = new BitSet();
        BitSet bitSet = RedisKeyHandleUtil.convertRedisBitmapToJava(redisBitmapData);
//        bitSet.and(bitSet2);
        int[] ints = bitSet.stream().toArray();
        for (int i = 0; i < bitSet.length(); i++) {
            boolean b = bitSet.get(i);
            System.out.println("第" + i + "位的值为：" + b);
        }

//        redisTemplate.opsForValue()
        Object test_bitmap = jedisUtil.get("key1");
        byte[] bytes = test_bitmap.toString().getBytes(StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            byte aByte = bytes[i];
            sb.append(Integer.toBinaryString((aByte & 0xFF) + 0x100).substring(1));
        }
        System.out.println(sb);
        String testBitmap = test_bitmap.toString();
        String hexString = RedisKeyHandleUtil.toHex(testBitmap);
        String binaryString = RedisKeyHandleUtil.hex2bin(hexString);
        System.out.println(binaryString);
        return new ReturnModel();
    }

    @RequestMapping("/insert")
    public void insertIntoDb() {

        // 定时任务中执行数据库插入及redis维护标签组和标签关系的动作
        MetricVO metricVO = new MetricVO()
                .setLabels(null)
                .setName("metricName")
                .setValue(10000D)
                .setType("type")
                .setHelp("help is not important")
                .setLabelString("labelString")
                .setLabels(new TreeMap<>())
                .setLabelNames(new String[]{"label1", "label2"})
                .setLabelValues(new String[]{"value1", "value2"});
        //1、指标数据解析
        //2、入库Java对象构造（指标对象、标签组对象、标签对象）
        // 指标表  指标标签组表  指标标签组和标签对应表
        String labelString = metricVO.getLabelString();
        //如果已有group，则直接插入数据库
//        LabelGroupEntity labelGroup = labelGroupMapper.selectByLabelString(labelString);
        if ("labelGroup" != null) {
            //构造metricEntity对象并入库
        } else {
            TreeMap<String, String> labels = metricVO.getLabels();
            Set<Map.Entry<String, String>> entries = labels.entrySet();
            entries.forEach(label -> {
                String labelName = label.getKey();
                String labelValue = label.getValue();
                //从redis中查，看是否已经有此标签的key value，若有，则表示此标签已经入过库，否则需要执行入库、入缓存的操作
                String s = jedisUtil.get("CSP-MONITOR-LABEL" + labelName + labelValue);
                if (s == null) {

//                    jedisUtil.set("CSP-MONITOR-LABEL" + labelName + labelValue,)
                } else {

                }
            });
        }

        //metricLabelGroupMapper.getByLabelString(labelString);
        // MetricMapper.insert(metricEntity);
        //如果没有group，则先插入group表，并且检查所有标签是否在数据库中存在，然后在redis中维护group与标签的关系，再将指标数据插入数据库
        // labelGroup
        // RedisUtil.setbit();
        //3、入库
        //4、redis维护标签和标签组关系
    }

    @RequestMapping("/query")
    public void insertIntoDb(String metricName, MetricLabel... metricLabels) {
        Arrays.stream(metricLabels).forEach(metricLabel -> {

        });
        // 定时任务中执行数据库插入及redis维护标签组和标签关系的动作
        //1、指标数据解析
        //2、入库Java对象构造（指标对象、标签组对象、标签对象）
        //3、入库
        //4、redis维护标签和标签组关系
    }
}
