package com.laofaner.threadSecurity.synchronize;

public class SynchronizedTest {

    private static boolean run = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (run) {
                System.out.println("thread1 running");
            }
        });

        thread1.start();

        Thread thread2 = new Thread(() -> {
            run = false;
            System.out.println("时间到，线程2设置为false");
        });
        thread2.start();
    }
}
