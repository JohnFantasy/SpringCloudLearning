package deepintojava.xiyue;

import java.util.Scanner;

public class Calculator {
    public static class AddCalculator {
        private static int A;
        private static int B;

        public void setA(int A) {
            AddCalculator.A = A;
        }

        public int getA() {
            return A;
        }

        public void setB(int B) {
            AddCalculator.B = B;
        }

        public int getB() {
            return B;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        AddCalculator age = new AddCalculator();
        System.out.println("请输入第一个值");
        age.setA(scan.nextInt());
        System.out.println("请输入第二个值");
        age.setB(scan.nextInt());
        int C = age.getA() + age.getB();
        System.out.println("相加结果为：" + C);
    }
}
