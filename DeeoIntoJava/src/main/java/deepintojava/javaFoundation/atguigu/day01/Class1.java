package deepintojava.javaFoundation.atguigu.day01;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 文档注释生成测试
 * @author: fyz
 * @createAt: 2019-12-08 00:14
 **/
public class Class1 {

    public static void main(String[] args) {
//        float a = 1;
//        int b = (int) a + 1;
//        System.out.println(b);
//        String[] atrs = new String[]{"", "", ""};
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
//        int a = 10;
//        int b = 10;
//        method(a, b);
//        System.out.println(a);
//        System.out.println(b);
        int[] arr = new int[10];
        char[] arr1 = {'a','b','c'};
//        char[] arr1 = new char[10];
        System.out.println(arr);
        System.out.println(arr1);
    }

    private static void method(int a, int b) {
        a = a * 10;
        b = b * 10;
    }


    /**
     * this is a doc comment block
     */
    public void Test1() {
        System.out.println("jahahahah");
    }
}
