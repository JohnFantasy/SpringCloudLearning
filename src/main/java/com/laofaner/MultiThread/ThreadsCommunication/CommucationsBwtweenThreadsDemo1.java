package com.laofaner.MultiThread.ThreadsCommunication;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-31 15:01
 * @description
 */
public class CommucationsBwtweenThreadsDemo1 implements Runnable {

    private volatile int i = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (i<101) {
                    System.out.println(Thread.currentThread().getName() + "---->" + i);
                    i++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        CommucationsBwtweenThreadsDemo1 demo1 = new CommucationsBwtweenThreadsDemo1();
        new Thread(demo1, "thread1").start();
        new Thread(demo1, "thread2").start();
    }
}
