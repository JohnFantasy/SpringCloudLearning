package com.laofaner.springboot.controller.demo;

import com.laofaner.commonutils.BeanConvertUtils;
import com.laofaner.commonutils.CoordinateConvertion;
import com.laofaner.commonutils.Word2Pdf;
import com.laofaner.springboot.domain.dto.TestDTO;
import com.laofaner.springboot.domain.entity.TestEntity;
import com.laofaner.springboot.domain.vo.Coornidate;
import com.laofaner.springboot.domain.vo.Student;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
    public String test1(@RequestBody Student student) {
//        System.out.println(list.toString());
        System.out.println(student.toString());
        return student.getName();
    }

    @RequestMapping(value = "coordinateConvert", method = RequestMethod.POST)
    public Coornidate test1(@RequestBody Coornidate coornidate) {
        double longitude = coornidate.getLongitude().setScale(5, RoundingMode.HALF_UP).doubleValue();
        double latitude = coornidate.getLatitude().setScale(5, RoundingMode.HALF_UP).doubleValue();
        System.out.println(longitude);
        String ret = CoordinateConvertion.wgs84togcj02(longitude, latitude);
        BigDecimal lng = new BigDecimal(Double.parseDouble(ret.split(",")[0]));
        BigDecimal lat = new BigDecimal(Double.parseDouble(ret.split(",")[1]));
        coornidate.setLongitude(lng);
        StringBuffer sb = new StringBuffer("");
        sb.reverse();
        coornidate.setLatitude(lat);
        return coornidate;
    }

    /*
    测试spring框架提供的类型转换工具BeanUtils
     */
    @RequestMapping(method = RequestMethod.POST, value = "beanConvertTest")
    public TestDTO beanConvertTest(@RequestBody TestEntity testEntity) {
        return BeanConvertUtils.convertUserEntityToDTO(testEntity);
    }

    @GetMapping("/testWorToPdf")
    public String test() {
        Word2Pdf.word2Pdf();
        return "SUCCESS";
    }
}
