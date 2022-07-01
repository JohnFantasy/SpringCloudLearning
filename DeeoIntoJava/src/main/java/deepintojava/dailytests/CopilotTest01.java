package deepintojava.dailytests;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * this is a test for Copilot
 */
public class CopilotTest01 implements Runnable {
    private final ReentrantLock lock = new ReentrantLock();

    private final Condition condition = lock.newCondition();

    private boolean flag = false;

    public void run() {
        lock.lock();
        try {
            while (!flag) {
                condition.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void setFlag() {
        lock.lock();
        try {
            flag = true;
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        String s = "tehteh";
        System.out.println(s.hashCode());
        System.out.println(Integer.MAX_VALUE);
    }
}
