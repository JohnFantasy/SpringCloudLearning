package deepintojava.algorithm;


import java.util.Scanner;

public class Recursion {

    /**
     * @Description: 使用递归算法计算一个整数的阶乘
     * @Param:
     * @return:
     * @Author: fyz
     * @Date: +++
     */
    public static void main(String[] args) {

        long i;
        while (true) {
            System.out.println("请输入一个正整数：");
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            System.out.println(i + "的阶乘为：" + test(i));
        }

    }


    /**
     * @Description: TODO
     * @Param: int a , int b
     * @return: String
     * @Author: fyz
     * @Date: 2019-08-08
     */
    public static long test(long a) {
        if (a == 0 || a == 1) {
            return 1;
        } else if (a > 1) {
            long result = a * test(a - 1);
            return result;
        } else {
            return 1;
        }
    }
}



