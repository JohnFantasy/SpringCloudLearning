package com.laofaner.MultiThread.countdownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-17 09:35
 * @description
 */
public class CountDownLatchDemo {


    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch startSignal = new CountDownLatch(1);
        //用来表示裁判员需要维护的是6个运动员
        final CountDownLatch endSignal = new CountDownLatch(6);
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 6; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName() + " 运动员等待裁判员响哨！！！");
                        startSignal.await();
                        System.out.println(Thread.currentThread().getName() + "正在全力冲刺");
                        Thread.sleep(new Random().nextInt(1000));
                        System.out.println(Thread.currentThread().getName() + "  到达终点");
                        endSignal.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            executorService.execute(runnable);


            //            executorService.execute(() -> {
//                try {
//                    System.out.println(Thread.currentThread().getName() + " 运动员等待裁判员响哨！！！");
//                    startSignal.await();
//                    Thread.sleep(1000);
//                    endSignal.countDown();
//                    System.out.println(Thread.currentThread().getName() + "正在全力冲刺");
//                    System.out.println(Thread.currentThread().getName() + "  到达终点");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
        }
        Thread.sleep(100);
        startSignal.countDown();
        System.out.println("裁判员发号施令啦！！！");
        endSignal.await();
        System.out.println("所有运动员到达终点，比赛结束！");
        executorService.shutdown();
    }
}
