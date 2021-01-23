package com.laofaner.javaFoundation.MultiThread;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-22 12:14
 * @description
 */
public class Task implements Runnable {

    private int nov;

    public Task(int i) {
        this.nov = i;
    }

    @Override
    public void run() {
        System.out.println("执行当前任务的线程是："+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是任务："+nov+",我在执行。。。。。。");
    }
}
