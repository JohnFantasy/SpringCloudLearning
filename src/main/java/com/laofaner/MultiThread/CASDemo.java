package com.laofaner.MultiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-2111:04
 * @description
 */
public class CASDemo {


    static int count;

    public static void request() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(5);
        /*
            Q:分析一下问题出在哪里？
            A:count++是非原子操作，实际上是由3步完成的
            1、获取count值，记作a： a=count
            2、a值+1，得到b： b= a +1
            3、将b赋值给count

            多线程情况下，多个线程同时执行到上面3步中的第一步，它们得到的count值是一样的，就会丢掉count++的操作值
            多个线程运算出同一个值

            Q:怎么解决问题？
            A:对count++操作的时候，让多个线程排队处理，多个线程同时到达request()方法时
            ，只允许一个线程可以去操作，其他线程在外面等待，等里面的线程处理完毕以后，外面
            等着的线程再进去一个，这样操作的count++就是排队进行的，结果一定是正确的

            Q：怎么实现排队效果呢？
            A：Java中的synchronized关键字和ReentrantLock都可以实现对资源加锁，保证并发正确性
            多线程情况下可以保证被锁住的资源被“串行”访问
         */
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int threadSize = 100;
        CountDownLatch countDownLatch = new CountDownLatch(threadSize);

        for (int i = 0; i < threadSize; i++) {
            Thread thread = new Thread(() -> {
                try {
                    for (int j = 0; j < 10; j++) {
                        request();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            });
            thread.start();
        }
        //怎么保证100个线程执行结束后再执行后面的代码
        countDownLatch.await();

        System.out.println(Thread.currentThread().getName() + "耗时：" + (System.currentTimeMillis() - startTime) + ",count=" + count);
    }
}
