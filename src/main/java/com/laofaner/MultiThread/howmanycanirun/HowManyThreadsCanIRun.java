package com.laofaner.MultiThread.howmanycanirun;

import lombok.SneakyThrows;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-09 16:59
 * @description
 */
public class HowManyThreadsCanIRun {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new MyThread());
            thread.start();
            thread.join();
        }
        System.out.println("-------------");
    }
}

class MyThread implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        long time = System.currentTimeMillis();
        while (System.currentTimeMillis() - time < 10000) {

        }
        System.out.println(Thread.currentThread().getName());
    }
}
