package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming;

import java.util.concurrent.LinkedBlockingDeque;

public class ThreadWaitAndNotifyDemo2 {

    public static final Object resourceA = new Object();
    public static volatile Object resourceB = new Object();

    private static final int MAX_SIZE = 100;


    public static void main(String[] args) {
       Thread threadA =  new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread A get resourceA lock");
                synchronized (resourceB) {
                    System.out.println("Thread A get resourceB lock");
                    System.out.println("Thread A release resourceA lock");
                    try {
                        resourceA.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


       Thread threadB =  new Thread(() -> {
            synchronized (resourceA) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread B get resourceA lock");

                System.out.println("Thread B tries to get resourceB lock");

                synchronized (resourceB) {
                    System.out.println("Thread B get resourceB lock");
                    System.out.println("Thread B release resourceA lock");
                    try {
                        resourceA.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

       threadA.start();
       threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
