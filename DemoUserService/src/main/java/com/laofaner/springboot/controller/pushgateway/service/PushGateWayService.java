package com.laofaner.springboot.controller.pushgateway.service;

import com.laofaner.springboot.controller.pushgateway.vo.MetricVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface PushGateWayService {

    List<MetricVO> push(HttpServletRequest request);
}
