package com.laofaner.MultiThread;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-21 12:20
 * @description
 */
public class ABADemoCAS02 {

    public static AtomicStampedReference<Integer> a = new AtomicStampedReference<>(new Integer(1), 1);

    public static void main(String[] args) {
        Thread main = new Thread(() -> {
            System.out.println("operating thread:" + Thread.currentThread().getName() + ",initial value is :" + a.getReference());
            try {
                Integer expectReference = a.getReference();
                Integer newReference = expectReference + 1;
                Integer expectStamp = a.getStamp();
                Integer newStamp = expectStamp + 1;
                Thread.sleep(1000);
                boolean isCasSuccess = a.compareAndSet(expectReference, newReference, expectStamp, newStamp);
                System.out.println("operating thread " + Thread.currentThread().getName() + ",CAS 操作 :" + isCasSuccess);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "main thread");

        Thread botherThread = new Thread(() -> {
            try {
                Thread.sleep(20);
                a.compareAndSet(a.getReference(), (a.getReference() + 1), a.getStamp(), a.getStamp() + 1);
                System.out.println("operating thread " + Thread.currentThread().getName() + "【getReference】 操作 :" + a.getReference());
                a.compareAndSet(a.getReference(), (a.getReference() - 1), a.getStamp(), a.getStamp() + 1);
                System.out.println("operating thread " + Thread.currentThread().getName() + "【getReference】 操作 :" + a.getReference());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "bothering thread");

        main.start();
        botherThread.start();
    }
}
