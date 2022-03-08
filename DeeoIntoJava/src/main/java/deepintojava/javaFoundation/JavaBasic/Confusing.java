package deepintojava.javaFoundation.JavaBasic;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 测试
 * @author: fyz
 * @create: 2019-10-16 09:38
 **/
public class Confusing {
//    public Confusing(Object o) {
//        System.out.println("ooooo");
//    }
//
//    public Confusing(double[] d) {
//        System.out.println("dddddd");
//    }
//
//    public Confusing(String h) {
//        System.out.println("dddddd");
//    }
//
//    public static void main(String[] args) {
//        new Confusing((Object)null);
//    }

    static int f(Object... args) { return 1; }
    static Integer f(Integer... args) { return 2; }

    public static void main(String... args) {
        int result = f(1, 2, 3);
        System.out.println("result: " + result);
    }
}
