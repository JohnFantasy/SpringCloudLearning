package com.laofaner.MultiThread.threadcreating;

import java.util.concurrent.TimeUnit;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-30 13:56
 * @description 第一种创建线程的方法：继承Thread类并重写其run方法
 */
public class ThreadExtended extends Thread {

    public ThreadExtended(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--------" + i);
        }
    }

    public static void main(String[] args) {

        for (int j = 0; j < 20; j++) {
            System.out.println(Thread.currentThread().getName() + "=======" + j);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (j == 10) {
                new ThreadExtended("thread-1").start();
                new ThreadExtended("thread-2").start();
            }
        }
    }
}
