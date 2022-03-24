package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming;

public class ThreadWaitAndNotifyDemo3 {

    public static volatile Object resourceA = new Object();


    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread A get resourceA lock");
                try {
                    System.out.println("ThreadA begin waiting");
                    resourceA.wait();
                    System.out.println("ThreadA ends waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("ThreadB get resourceA lock");
                try {
                    System.out.println("ThreadB begin waiting");
                    resourceA.wait();
                    System.out.println("ThreadB ends waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadC = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("ThreadC begins notifying");
                resourceA.notify();
            }
        });


        threadA.start();
        threadB.start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadC.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
