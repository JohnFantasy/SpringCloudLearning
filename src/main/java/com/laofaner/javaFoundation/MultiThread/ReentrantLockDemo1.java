package com.laofaner.javaFoundation.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-25 18:50
 * @description
 */
public class ReentrantLockDemo1 {


    private final Lock lock = new ReentrantLock();

    private Integer tickets = 1000;


    public void lockMethod1() {

//        try {
//            lock.lock();
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第:" + tickets-- + "张票");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
        synchronized (this) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第:" + tickets-- + "张票");
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo1 demo1 = new ReentrantLockDemo1();


        ExecutorService executorService = Executors.newCachedThreadPool();

//        List<Future<?>> futures = new ArrayList<>();

//        for (int i = 0; i < 10; i++) {
//            Future<Callable<>> future = executorService.submit(demo1::lockMethod1);
//            futures.add(future);
        while (demo1.tickets > 0) {
            executorService.execute(demo1::lockMethod1);
        }
        System.out.println(demo1.tickets);
//        }
        executorService.shutdownNow();
        System.out.println(executorService.isTerminated());
//        executorService.invokeAll(futures);
    }

}
