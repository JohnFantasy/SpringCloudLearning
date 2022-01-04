package com.laofaner.threadSecurity.synchronize;

/**
 * jsvap反汇编学习synchronized原理
 */
public class JavapSynchronizedTheory {
    private static Object obj = new Object();

    public static void main(String[] args) {
        synchronized (obj){
            System.out.println("1");
        }
    }

    public synchronized void test01(){
        System.out.println("a");
    }
}

