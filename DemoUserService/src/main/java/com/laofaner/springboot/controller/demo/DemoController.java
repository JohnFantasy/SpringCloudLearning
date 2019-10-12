package com.laofaner.springboot.controller.demo;

import com.laofaner.commonutils.CoordinateConvertion;
import com.laofaner.springboot.domain.vo.Coornidate;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    @RequestMapping(value = "test", method = RequestMethod.POST)
    @ResponseBody
    public String test1(@RequestBody Student student) {
//        System.out.println(list.toString());
        System.out.println(student.toString());
        return student.getName();
    }

    @RequestMapping(value = "coordinateConvert", method = RequestMethod.POST)
    @ResponseBody
    public Coornidate test1(@RequestBody Coornidate coornidate) {
        double longitude = coornidate.getLongitude().setScale(5, RoundingMode.HALF_UP).doubleValue();
        double latitude = coornidate.getLatitude().setScale(5, RoundingMode.HALF_UP).doubleValue();
        System.out.println(longitude);
        String ret = CoordinateConvertion.wgs84togcj02(longitude,latitude);
        BigDecimal lng = new BigDecimal(Double.parseDouble(ret.split(",")[0]));
        BigDecimal lat = new BigDecimal(Double.parseDouble(ret.split(",")[1]));
        coornidate.setLongitude(lng);
        coornidate.setLatitude(lat);
        return coornidate;
    }
}
