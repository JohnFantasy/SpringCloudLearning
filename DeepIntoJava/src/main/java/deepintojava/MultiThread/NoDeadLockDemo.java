package deepintojava.MultiThread;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 手动制造一个死锁案例
 * @author: fyz
 * @date: 2020-03-22 10:52
 **/


public class NoDeadLockDemo {
    public static final String obj1 = "obj1";
    public static final String obj2 = "obj2";

    public static void main(String[] args) {
        Thread a = new Thread(new Lock1());
        //Thread b = new Thread(new Lock2());
        a.start();
        //b.start();
    }
}

class Lock1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Lock1 running");
            while (true) {
                synchronized (NoDeadLockDemo.obj1) {
                    System.out.println("Lock1 lock obj1");
                    Thread.sleep(3000);
                    synchronized (NoDeadLockDemo.obj2) {
                        System.out.println("Lock1 lock obj2");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Lock2 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Lock2 running");
            while (true) {
                synchronized (NoDeadLockDemo.obj2) {
                    System.out.println("Lock2 lock obj2");
                    Thread.sleep(3000);
                    synchronized (NoDeadLockDemo.obj1) {
                        System.out.println("Lock2 lock obj1");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

