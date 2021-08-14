package com.laofaner.MultiThread.synchronizeddemo.reentrant;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-23 16:50
 * @description
 */
public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

class Foo {
    public int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Son extends Foo {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(1000);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        Son son = new Son();
        son.operateISubMethod();
    }
}
