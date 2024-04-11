package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming.atomic;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicIntegerDemo01 {
    private static final AtomicLong atomicLong = new AtomicLong();
    private static final Integer[] arrayOne = new Integer[]{0, 1, 2, 53, 84, 75, 66, 547, 38, 29, 0};
    private static final Integer[] arrayTwo = new Integer[]{10, 2, 3, 4, 6, 9, 0, 54, 0, 2, 0, 0};

    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            for (Integer integer : arrayOne) {
                if (integer == 0) {
                    atomicLong.incrementAndGet();
                }
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (Integer integer : arrayTwo) {
                if (integer == 0) {
                    atomicLong.incrementAndGet();
                }
            }
        });


        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count 0:" + atomicLong.get());
    }
}
