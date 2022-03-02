package com.laofaner.springboot.controller.poi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @program: SpringBoot&SpringCloud
 * @description: ceshidaochuexcel
 * @author: fyz
 * @createAt: 2020-02-18 15:54
 **/
@RestController("poiExcel")
public class TestExcelController {


    @RequestMapping("export")
    public void export(HttpServletResponse response){



    }
}
