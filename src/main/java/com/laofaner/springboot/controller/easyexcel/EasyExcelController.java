package com.laofaner.springboot.controller.easyexcel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.springboot.controller.easyexcel
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-04 23:20
 * @Description: TODO
 * @Version 1.0
 */

@RestController
@RequestMapping(value = "easyexcel")
public class EasyExcelController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String exportOrderData() {


        return "SUCCESS";
    }

}
