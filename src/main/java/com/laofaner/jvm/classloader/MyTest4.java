package com.laofaner.jvm.classloader;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 主动使用（会导致初始化）
 * 新建一个类的实例回导致该类的初始化
 * 数组创建的本质：JVM在运行期帮助我们创建的
 * 对于数组实例来说，其类型是由JVM在运行期动态生成的，表示为“[Lcom.laofaner.jvm.classloader.MyParent4;”，动态生成的类型，
 * 其夫类型就是Object。
 * 对于数组来说，JavaDoc经常将构成数组的元素成为Component，实际上就是将数组降低一个维度后的类型。
 *
 * 助记符：
 * 1 、 anewarray:表示创建一个引用类型的数组（如类、接口、数组），并将其引用值压入栈顶。
 * 2 、 newarray:表示创建一个制定的原始类型的数组（如int、float、char），并将其引用值压入栈顶。
 * @author: fyz
 * @create: 2019-08-28 18:44
 **/
public class MyTest4 {
    public static void main(String[] args) {
//        MyParent4 myParent4 = new MyParent4();
        MyParent4[] MyParent4s = new MyParent4[4];
        MyParent4[][] MyParent4 = new MyParent4[4][1];
        System.out.println(MyParent4.getClass());
        System.out.println(MyParent4.getClass().getSuperclass());

        int[] arrInt = new int[1];
        System.out.println(arrInt.getClass());
        System.out.println(arrInt.getClass().getSuperclass());
        System.out.println("=========");
        byte[] bytes = new byte[2];
        System.out.println(bytes.getClass());
        System.out.println(bytes.getClass().getSuperclass());
        System.out.println("=========");
        char[] chars = new char[2];
        System.out.println(chars.getClass());
        System.out.println(chars.getClass().getSuperclass());
    }
}


class MyParent4{
    static{
        System.out.println("MyParent4 static block");
    }
}