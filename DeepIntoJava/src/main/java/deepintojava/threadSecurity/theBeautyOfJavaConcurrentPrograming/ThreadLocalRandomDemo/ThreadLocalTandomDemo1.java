package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming.ThreadLocalRandomDemo;

import java.text.SimpleDateFormat;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalTandomDemo1 {

    ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<>();

    public static void main(String[] args) {

        ThreadLocalRandom random = ThreadLocalRandom.current();
        int i = random.nextInt();
        System.out.println(i);
        for (int i1 = 0; i1 < 100; i1++) {
            new Thread(() -> {
                for (int i2 = 0; i2 < 100; i2++) {
                    System.out.println(random.nextInt(100));
                }
            }).start();
        }
    }
}
