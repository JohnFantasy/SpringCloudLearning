package com.laofaner.javaFoundation.tests;

import com.alibaba.fastjson.JSONObject;
import com.laofaner.utils.CoordinateTransfer;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.parser.Parser;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Main
 * @Description TODO
 * @Author fyz
 * @Date 1/2/2019 18:54 PM
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        int a = 1;
//
        //
//        System.out.println(a++ * 6 + a++);
////        System.out.println(a++ * a++ * a++ * ++a);
//        BigDecimal x = new BigDecimal("1.88");
//        System.out.println(x.multiply(new BigDecimal("100")));
//        String date = "07";
//        SimpleDateFormat sdf = new SimpleDateFormat("dd");
//        System.out.println(sdf.format(new Date()));
//        System.out.println(Calendar.DAY_OF_MONTH == Integer.valueOf(date));
//
//        System.out.println((date).length());

//
//        JSONObject jsonObject = JSONObject.parseObject("{\"name\":\"张三\"}");
//        Object name = jsonObject.get("name");
//        System.out.println(name.toString());
//        Student student = new Student();
//        student.setName("zhangsanh");
//        Main main = new Main();
//        System.out.println(main.getName(student));
        double x = 1298765;
        double y = 10647362;
        BigDecimal bg = new BigDecimal(x);
        System.out.println(bg.divide(new BigDecimal(100000)));
        System.out.println(x / 100000);
        System.out.println(y / 100000);
        double[] ret = CoordinateTransfer.wgs2gcj(106.51397,29.59631);
        System.out.println(ret[0]);
        System.out.println(ret[1]);

    }

    public String getName(Student student) {
        return student.getName();
    }
}
