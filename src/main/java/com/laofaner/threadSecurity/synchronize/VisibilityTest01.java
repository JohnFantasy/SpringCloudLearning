package com.laofaner.threadSecurity.synchronize;


/**
 * 演示可见性问题
 * 1、创建一个共享变量
 * 2、创建多条线程：其中一条线程不断读取变量值
 * 3、创建另一条线程修改变量值
 */
public class VisibilityTest01 {

    private static boolean flag = true;

    private static final Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                synchronized (obj){

                }
//                System.out.println("Thread 1 read the value: " + flag);
            }
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            flag = false;
            System.out.println("Thread 2 changed the value to false");
        }).start();
    }
}
