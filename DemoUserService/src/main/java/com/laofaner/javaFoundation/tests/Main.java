package com.laofaner.javaFoundation.tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        String date = "07";
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        System.out.println(sdf.format(new Date()));
        System.out.println(Calendar.DAY_OF_MONTH == Integer.valueOf(date));
    }
}
