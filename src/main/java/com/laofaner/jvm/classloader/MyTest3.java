package com.laofaner.jvm.classloader;

import java.util.UUID;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 编译器常量和运行期常量的区别
 * 当一个常量的值并非编译期间可以确定的，那么其值就不会被放到调用方的常量池中，在程序运行时，
 * 会导致程序主动使用这个常量所在的类，显然会导致这个类被初始化
 * @author: fyz
 * @create: 2019-08-28 18:33
 **/
public class MyTest3 {

    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}


class MyParent3 {
    public static final String str = UUID.randomUUID().toString().toUpperCase().replace("-", "");

    static {
        System.out.println("MyParent3 static block");
    }
}