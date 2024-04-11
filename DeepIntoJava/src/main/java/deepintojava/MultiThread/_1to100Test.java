package deepintojava.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanyuzhuo
 * @createAt 2021-02-02 21:57
 * @description
 */
public class _1to100Test implements Runnable {
    static int i = 1;

    public static ReentrantLock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();


    public static void main(String[] args) {
        _1to100Test test = new _1to100Test();
//        new Thread(test).start();
//        new Thread(test).start();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        while (i < 101) {
            executorService.execute(test);
        }
    }

    @Override
    public void run() {
        while (i <= 100) {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "-------->" + i++);
                condition.signal();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
