package com.laofaner.jvm.classloader;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 双亲委派机制
 * @author: fyz
 * @create: 2019-09-11 10:45
 **/
public class MyTest7 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            System.out.println(clazz.getClassLoader());

            //系统类加载器（应用类加载器）AppClassLoader
            clazz = Class.forName("com.laofaner.jvm.classloader.C");
            System.out.println(clazz.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


class C{

}