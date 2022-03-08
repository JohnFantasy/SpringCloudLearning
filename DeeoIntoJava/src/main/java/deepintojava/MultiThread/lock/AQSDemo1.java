package deepintojava.MultiThread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-31 12:15
 * @description
 */
public class AQSDemo1 {

    public ReentrantLock lock = new ReentrantLock(true);
    private int counter = 0;

    public void modifyResources(String threadName) {
        System.out.println("通知【管理员】线程：-->" + threadName + "准备打水");
        lock.lock();
        System.out.println("线程：---->" + threadName + "第一次加锁");
        counter++;
        System.out.println("线程：---->" + threadName + "打第" + counter + "桶水");
        lock.lock();
        System.out.println("线程：---->" + threadName + "第二次加锁");
        counter++;
        System.out.println("线程：---->" + threadName + "打第" + counter + "桶水");
        lock.unlock();
        System.out.println("线程：---->" + threadName + "第一次解锁");
        lock.unlock();
        System.out.println("线程：---->" + threadName + "第二次解锁");
    }

    public static void main(String[] args) {
        AQSDemo1 demo1 = new AQSDemo1();
        new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            demo1.modifyResources(threadName);
        }, "thread-fyz").start();
        System.out.println(demo1);
    }
}
