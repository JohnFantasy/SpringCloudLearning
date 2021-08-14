package com.laofaner.MultiThread.synchronizeddemo.dirtyread;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-23 16:14
 * @description
 */
public class ThreadA extends Thread {

    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
