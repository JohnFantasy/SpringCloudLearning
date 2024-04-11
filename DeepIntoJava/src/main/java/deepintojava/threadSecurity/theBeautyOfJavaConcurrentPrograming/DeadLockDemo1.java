package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming;

public class DeadLockDemo1 {

    public static final Object resourceA = new Object();
    public static final Object resourceB = new Object();

    public static void main(String[] args) {

        Thread threadA = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("threadA get resourceA lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ThreadA tries to get resourceB lock");
                synchronized (resourceB) {
                    System.out.println("ThreadA get resourceB lock");
                }
            }
        });


        Thread threadB = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("threadB get resourceB lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ThreadB tries to get resourceA lock");
                synchronized (resourceA) {
                    System.out.println("ThreadA get resourceB lock");
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
