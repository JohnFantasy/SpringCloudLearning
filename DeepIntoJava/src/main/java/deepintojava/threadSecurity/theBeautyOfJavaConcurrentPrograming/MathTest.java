package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming;

import java.util.Date;

public class MathTest {

    public static final String resourceA = "lockA";
    public static final String resourceB = "lockB";

    public static Integer main(String args) {

        Thread threadA = new Thread(() -> {

            synchronized (resourceA) {
                System.out.println(Thread.currentThread().getName());

                System.out.println("ThreadA get the lock of resourceA");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resourceB) {
                    System.out.println("ThreadA get the lock of resourceB");
                }
            }


        });
        threadA.setName("threadA");


        Thread threadB = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("ThreadB get the lock of resourceB");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourceA) {
                    System.out.println("ThreadB get the lock of resourceA");
                }
            }


        });
        threadB.setName("threadB");


        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 1;
    }

    public static void main(String[] args) {

        //设钟家收入x元，开支y元；曾家收入为钟家的8/7倍，曾家开支为钟家15/13倍;钟家结余800，曾家结余900；
        //按照中国一般家庭户均收入的情况推算，x不超过10W，y不超过10W；
        int i;
        int j;
        for (i = 800; i < 100000; i++) {
            for (j = 0; j < i; j++) {
                if (((i - j) == 800) && ((i * 8 * 13) - (j * 15 * 7)) == 900 * 7 * 13) {
                    System.out.println("钟家收入为：" + i + "元,开支为：" + (i - 800) + "元；曾家收入为：" + (i * 8 / 7) + "元；开支为：" + ((i * 8 / 7) - 900) + "元");
                }
            }
        }


        int o;
        int p;
        int z;
        out:
        for (o = 1; o < 1000; o++) {
            for (p = 1; p < 1000; p++) {
                for (z = 1; z < 1000; z++) {
                    if (o * 48 == p * 32 && p * 32 == z * 28) {
                        System.out.println("三道工序的问题，答案为：" + o + "," + p + "," + z);
                        break out;
                    }
                }
            }
        }

        //设小明有书m本，小东有书n本
        int m;
        int n;
        int x;

        //设小明有书m本
        for (m = 1; m < 199; m++) {
            //设小东有书n本
            for (n = 1; n < 199; n++) {
                for (x = 1; x < n; x++) {
                    if (((m - x) * 7) == ((n + x) * 4) && ((m + x) * 5) == ((n - x) * 8) && (m + n) < 199) {
                        System.out.println("小明有书：" + m + "本,小东有书" + n + "本,x的值为：" + x);
                    }
                }
            }
        }

        Date date = new Date();
        long time = date.getTime();
        long newTime = time + 50 * 365 * 24 * 60 * 60 * 1000L;
        date.setTime(newTime);
        System.out.println(date);


    }
}

class Fraction {
    static int numerator;  // 分子
    static int denominator; // 分母

    public static String getFs(int a, int b) {  // 设置分子和分母
        if (a == 0 || b == 0) {
            numerator = a;
            denominator = b;
        } else {
            int c = f(Math.abs(a), Math.abs(b));         // 计算最大公约数
            numerator = a / c;
            denominator = b / c;
            if (numerator < 0 && denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }
        }
        return numerator + ":" + denominator;
    }

    static int f(int a, int b) {  // 求a和b的最大公约数
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            ;
            r = a % b;
        }
        return b;
    }
}
