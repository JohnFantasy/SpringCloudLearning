package com.laofaner.threadSecurity.synchronize;

import org.apache.poi.ss.formula.functions.T;

/**
 * 演示synchronized不可中断特性
 * 1.定义Runnable
 * 2.在runnable中定义同步代码块
 * 3.先开启一个线程执行同步代码块，保证不退出同步代码块
 * 4.后开启一个线程来执行同步代码块（阻塞状态）
 * 5.强行停止第二个线程
 */
public class Uninterruptible {
    private static final Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        //1.定义Runnable
        Runnable runnable = () -> {
            //2.在runnable中定义同步代码块
            synchronized (obj) {
                String name = Thread.currentThread().getName();
                System.out.println(name + "进入了同步代码块");
                try {
                    // 3.先开启一个线程执行同步代码块，保证不退出同步代码块
                    Thread.sleep(99999);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
        Thread.sleep(1000);
        //4.后开启一个线程来执行同步代码块（阻塞状态）
        Thread t2 = new Thread(runnable);
        t2.start();
        System.out.println("线程停止前");
        t2.interrupt();
        System.out.println("线程停止后");
        Thread.State t1State = t1.getState();
        Thread.State t2State = t2.getState();
        System.out.println(t1State + "----" + t2State);
    }
}
