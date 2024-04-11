package deepintojava.jvm.classloader;

import java.util.Random;

interface MyParent5 {
    public static final int a = 5;
}

interface MyChild5 extends MyParent5 {
    public static final int b = new Random().nextInt();
}

/**
 * @program: SpringBoot&SpringCloud
 * @description: 类的初始化的重要意义
 * 当一个接口在初始化时，并不要求其父接口都完成了初始化
 * 只有在真正使用父接口时（如引用父接口中的常量）才会初始化
 * @author: fyz
 * @create: 2019-08-28 19:12
 **/
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}
