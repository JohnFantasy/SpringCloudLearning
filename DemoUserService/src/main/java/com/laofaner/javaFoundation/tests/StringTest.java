package com.laofaner.javaFoundation.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest {

    public static void main(String[] args) {
//        String str = "vjnfuidshuivbfd";
//
//        String[] strs = str.split("\n");
//        for (int i =0;i<strs.length;i++) {
//            System.out.println("\'"+strs[i]+"\',");
//        }D

        String now = "";
        String[] strings = now.split("\n");
        for (String str: strings
             ) {
            System.out.println(str.replace("|!","\t"));
        }

        StringTest stringTest = new StringTest();
        Date date = new Date();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            date = sdf.parse("2019-01-21 01:16:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());





    }


    /**
     * 时间戳转时间(10位时间戳)
     * @param time
     * @return
//     */
//    public  String timestampToDate(long time) {
//        String dateTime;
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_SEC_FULL);
//        long timeLong = Long.valueOf(time);
//        dateTime = simpleDateFormat.format(new Date(timeLong * 1000L));
//        return dateTime;
//    }
}
