package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming.lock;

import java.util.concurrent.locks.LockSupport;

public class LockSupportDemo1 {

    public static void main(String[] args) {

        LockSupport.unpark(Thread.currentThread());
        System.out.println("begin park");
        LockSupport.park();
        System.out.println("end park");
    }
}
