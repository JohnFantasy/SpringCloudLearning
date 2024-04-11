package deepintojava.jvm.classloader;

/**
 * @program: SpringBoot&SpringCloud
 * @description: jvm主动使用和被动使用示例2
 * 加上final和不加final的区别：
 * 常量在编译阶段存入调用这个常量的方法所在的类的常量池中，本质上调用类并没有直接应用到定义常量的类，因此并不会触发定义常量的类的初始化
 * 这里指的是将常量存入到了MyTest2的常量池中，之后MyTest2与MyParent2就没有任何关系了，甚至我们可以将MyParent2的class文件删除也不会影响结果
 * @author: fyz
 * @create: 2019-08-27 11:49
 **/
public class MyTest2 {

    public static void main(String[] args) {

        System.out.println(MyParent2.str);
        System.out.println(MyParent2.a);
        System.out.println(MyParent2.b);
        System.out.println(MyParent2.c);
        System.out.println(MyParent2.d);
        System.out.println(MyParent2.e);
        System.out.println(MyParent2.f);
        System.out.println(MyParent2.g);
        System.out.println(MyParent2.h);
        System.out.println(MyParent2.i);
    }
}


class MyParent2 {
    public static final String str = "hello world";

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = -1;
    public static final int i = 127;
    public static final float h = 0.01f;

    static {
        System.out.println("MyParent2 static block");
    }
}
