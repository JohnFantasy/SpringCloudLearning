package deepintojava.MultiThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-21 12:20
 * @description
 */
public class ABADemoCAS {

    public static AtomicInteger a = new AtomicInteger(1);

    public static void main(String[] args) {
        Thread main = new Thread(() -> {
            System.out.println("operating thread:" + Thread.currentThread().getName() + ",initial value is :" + a.get());
            try {
                int expectNo = a.get();
                int newNum = expectNo + 1;
                Thread.sleep(1000);
                boolean isCasSuccess = a.compareAndSet(expectNo, newNum);
                System.out.println("operating thread " + Thread.currentThread().getName() + ",CAS 操作 :" + isCasSuccess);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "main thread");

        Thread botherThread = new Thread(() -> {
            try {
                Thread.sleep(20);
                a.incrementAndGet();
                System.out.println("operating thread " + Thread.currentThread().getName() + "【increment】 操作 :" + a.get());
                a.decrementAndGet();
                System.out.println("operating thread " + Thread.currentThread().getName() + "【de    crement】 操作 :" + a.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "bothering thread");

        main.start();
        botherThread.start();
    }
}
