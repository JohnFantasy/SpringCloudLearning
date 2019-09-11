package com.laofaner.javaFoundation.MultiThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: SpringBoot&SpringCloud
 * @description: java原生线程池学习
 * @author: fyz
 * @create: 2019-09-10 15:50
 **/
public class ExecutorDemo {

    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                10, 50, 10, TimeUnit.DAYS, queue, new ThreadPoolExecutor.CallerRunsPolicy());

        AtomicInteger count = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    count.getAndIncrement();
                }
            });

        }

        threadPoolExecutor.shutdownNow();


        while (Thread.activeCount() > 2) {
//            System.out.println(Thread.activeCount());
//            System.out.println(Thread.currentThread().getName());
        }

        System.out.println(count.get());
    }

}
