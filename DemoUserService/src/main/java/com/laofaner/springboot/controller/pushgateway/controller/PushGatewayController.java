package com.laofaner.springboot.controller.pushgateway.controller;


import com.laofaner.springboot.controller.pushgateway.service.impl.PushGateWayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/metrics")
public class PushGatewayController {

    @Autowired
    private PushGateWayServiceImpl pushGateWayService;

    @RequestMapping(value = "/job/**", method = RequestMethod.PUT)
    public Object push(HttpServletRequest request) {
        return pushGateWayService.push(request);
    }
}