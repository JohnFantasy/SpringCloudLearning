package com.laofaner.javaFoundation.MultiThread.synchronizeddemo;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-23 15:59
 * @description
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;

    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
