package com.laofaner.springboot.controller.pushgateway.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MetricHandleStrategyContext {

    @Autowired
    private final Map<String, MetricHandleStrategy> metricHandleMap = new HashMap<>();
    public MetricHandleStrategy getHandler(String metricType) {
        return metricHandleMap.get(metricType);
    }
}
