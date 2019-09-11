package com.laofaner.jvm.classloader;

import java.util.Random;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 子类和父类相关
 * @author: fyz
 * @create: 2019-09-11 11:26
 **/
public class MyTest9 {

    static {
        System.out.println("MyTest9 static block");
    }

    public static void main(String[] args) {
        System.out.println(Child.b);
    }
}

class Parent {
    public static final int a = 3;

    static {
        System.out.println("Parent static block");
    }
}

/*
对于子类的静态常量，若是编译期可以确定的值，则JVM类加载器在加载子类的时候，不会对其父类做初始化
若是编译期不能确定其值，则仍会先初始化其父类
 */
class Child extends Parent {
    public static final int b = new Random().nextInt();

    static {
        System.out.println("Child static block");
    }
}
