package deepintojava.threadSecurity.synchronize;

import org.apache.poi.ss.formula.functions.T;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 演示Lock的不可中断和可中断
 */
public class LockUninterruptibalDemo {
    private static Lock lock = new ReentrantLock(false);


    public static void main(String[] args) throws InterruptedException {
//        test01();
        test02();
    }

    //演示Lock的不可中断
    public static void test01() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "获得锁，进入锁执行代码块");
                Thread.sleep(200000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + "释放锁");
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread.sleep(200);

        Thread t2 = new Thread(runnable);
        t2.start();

        System.out.println("停止线程2之前");
        t2.interrupt();
        System.out.println("停止线程2之后");

        Thread.sleep(1000);

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }

    //演示Lock的可中断
    public static void test02() throws InterruptedException {
        Runnable runnable = () -> {
            boolean b = false;
            try {
                b = lock.tryLock(3000, TimeUnit.MILLISECONDS);
                if (b) {
                    System.out.println(Thread.currentThread().getName() + "获得锁，进入锁执行代码块");
                    Thread.sleep(200000);
                } else {
                    System.out.println(Thread.currentThread().getName() + "在指定时间没有得到锁，做其他操作");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (b) {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + "释放锁");
                }
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread.sleep(200);

        Thread t2 = new Thread(runnable);
        t2.start();

//        System.out.println("停止线程2之前");
//        t2.interrupt();
//        System.out.println("停止线程2之后");
//
        Thread.sleep(1000);
//
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }

}
