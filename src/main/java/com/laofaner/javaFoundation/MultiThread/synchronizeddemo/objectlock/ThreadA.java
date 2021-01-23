package com.laofaner.javaFoundation.MultiThread.synchronizeddemo.objectlock;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-23 15:57
 * @description
 */
public class ThreadA extends Thread{

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;

    }
    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
