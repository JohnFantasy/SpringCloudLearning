package com.laofaner.jvm.classloader;

import java.util.Random;

/**
 * @program: SpringBoot&SpringCloud
 * @description: final加深理解
 * @author: fyz
 * @create: 2019-09-11 11:16
 **/
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

class FinalTest {
    public static final int x = new Random().nextInt();

    static {
        System.out.println("FinalTest static block");
    }
}
