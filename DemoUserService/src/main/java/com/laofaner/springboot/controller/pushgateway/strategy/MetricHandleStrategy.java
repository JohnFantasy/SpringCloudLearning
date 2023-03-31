package com.laofaner.springboot.controller.pushgateway.strategy;

import com.laofaner.springboot.controller.pushgateway.vo.MetricVO;

import java.util.List;

/**
 * 指标处理策略类接口
 * 输入：业务系统推送过来的原始指标对象
 * 输出：原始指标对象+附加指标对象（由瞬时值计算累加值，或有累加值计算瞬时值）
 */
public interface MetricHandleStrategy {
    List<MetricVO> handleMetric(MetricVO metricVO);
}
