package com.laofaner.springboot.controller.pushgateway.strategy;

import com.laofaner.springboot.controller.pushgateway.vo.MetricVO;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("instant")
public class InstantMetricHandleStrategy implements MetricHandleStrategy{
    @Override
    public List<MetricVO> handleMetric(MetricVO metricVO) {
        return null;
    }
}
