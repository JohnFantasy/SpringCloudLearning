package com.laofaner.springboot.controller.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SpringBoot&SpringCloud
 * @description: ceshi
 * @author: fyz
 * @create: 2019-08-15 10:54
 **/

@RestController
@RequestMapping(value = "demo1")
public class DemoController {

    @RequestMapping(value = "test")
    public String test1(@RequestBody List<String> list) {
        System.out.println(list.toString());
        return "SUCESS";
    }
}
