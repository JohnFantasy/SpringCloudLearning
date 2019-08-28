package com.laofaner.jvm.classloader;

/**
 * @program: SpringBoot&SpringCloud
 * @description: jvm主动使用和被动使用
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化
 * 初始化一个类的子类的时候该类也会被主动使用
 * 当一个类在初始化时，要求其所有父类都已经被初始化了
 * -XX:+TraceClassLoading,用于追踪类的加载信息并打印出来
 * @author: fyz
 * @create: 2019-08-27 11:22
 **/
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
    }
}

class MyParent1 {
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1 {

    public static String str2 = "welcome";

    static {
        System.out.println("MyChild1 static block");
    }
}