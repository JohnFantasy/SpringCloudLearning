package com.laofaner.threadSecurity.synchronize;

import java.util.ArrayList;

public class SynchronizedTest2 {

    private static int number = 0;
    private static final String lock = "lock";

    public static void main(String[] args) throws InterruptedException {
        Runnable increment = () -> {
            for (int i = 0; i < 1000; i++) {
               synchronized (lock){
                   number++;
               };
            }
        };

        ArrayList<Thread> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(increment);
            t.start();
            list.add(t);
        }
        for (Thread t : list) {
            t.join();
        }
        System.out.println("number = " + number);
    }
}
