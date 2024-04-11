package deepintojava.jvm.classloader;

/**
 * @program: SpringBoot&SpringCloud
 * @description: singleton
 * @author: fyz
 * @create: 2019-08-28 19:30
 **/
public class MyTest6 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("counter1:" + Singleton.counter1);
        System.out.println("counter2:" + Singleton.counter2);
    }
}


class Singleton {

    //    public static int counter1;
    public static int counter1 = 1;
    //此处注意：
    // 类加载之后先执行连接阶段的验证、准备（为类的静态变量赋初值）、解析，之后初始化，初始化的顺序即是代码顺序执行
//    public static int counter2 = 0;


    public static Singleton singleton = new Singleton();
    public static int counter2 = 0;

    private Singleton() {
        counter1++;
        counter2++;//准备阶段的重要意义
    }

    public static Singleton getInstance() {
        return singleton;
    }
}