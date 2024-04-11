package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming.lock;

import java.util.concurrent.locks.LockSupport;

public class LockSupportDemo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("child thread begin park");

            LockSupport.park();

            System.out.println("child thread end park");
        });

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread begin unpark");

//        LockSupport.unpark(thread);

        thread.interrupt();
    }
}
