package com.laofaner.springboot.controller.pushgateway.vo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.TreeMap;

@Data
@Accessors(chain = true)
@ToString
public class MetricVO {
    //job名称
    private String job;
    //实例名称
    private String instance;
    //指标名称
    private String name;
    //指标说明
    private String help;
    //指标类型
    private String type;
    //指标值
    private Double value;
    // 标签键值对
    private TreeMap<String, String> labels;
    //标签名称数组
    private String[] labelNames;
    //标签值数组（与标签名称数组长度一致，且一一对应）
    private String[] labelValues;
    //标签键值对序列化字符串
    private String labelString;
}
