package com.laofaner.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanyuzhuo
 * @createAt 2021-02-02 21:57
 * @description
 */
public class _1to100Test_synchronized implements Runnable {
    static int i = 1;

    public static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();


    public static void main(String[] args) {
        _1to100Test_synchronized test = new _1to100Test_synchronized();
//        new Thread(test).start();
//        new Thread(test).start();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        while (i < 101) {
            executorService.execute(test);
        }
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (i < 101) {
                    System.out.println(Thread.currentThread().getName() + "-------->" + i++);
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

