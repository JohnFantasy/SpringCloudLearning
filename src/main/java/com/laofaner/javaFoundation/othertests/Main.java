package com.laofaner.javaFoundation.othertests;

/**
 * @program: SpringBoot&SpringCloud
 * @description: test
 * @author: fyz
 * @create: 2019-10-12 16:38
 **/
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getValue());
    }


    public String getValue() {
        String a = "";
        try {
            a = "test1";
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            a = "test2";
            return "xxx";
        }

    }

}


