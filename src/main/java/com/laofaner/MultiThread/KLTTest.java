package com.laofaner.MultiThread;


import java.util.concurrent.*;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-22 11:05
 * @description 测试jvm是使用的用户级线程模型还是内核级线程模型
 */
public class KLTTest {

    public static void main(String[] args) {
//        for (int i = 0; i < 300; i++) {
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            thread.start();
//        }

//        ExecutorService executorService = Executors.newFixedThreadPool(100);
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        final ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 3, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),Executors.defaultThreadFactory());
        for(int i=0;i<10;i++){
            poolExecutor.execute(new Task(i));
        }
        poolExecutor.shutdownNow();
        System.out.println(poolExecutor.isTerminated());


    }

}
