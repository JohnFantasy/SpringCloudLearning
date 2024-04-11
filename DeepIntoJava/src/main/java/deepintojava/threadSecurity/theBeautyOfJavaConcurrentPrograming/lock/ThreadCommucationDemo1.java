package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming.lock;

import io.netty.util.concurrent.DefaultThreadFactory;

import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCommucationDemo1 implements Runnable {

    public ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();
    private static volatile int i = 1;

    @Override
    public void run() {
        while (i < 101) {
            try {
                reentrantLock.lock();
//                notify();
                System.out.println(Thread.currentThread().getName() + "---->:" + i++);
                try {
                    condition.signal();
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    private static final String LOCK = "lock";

    private static volatile boolean FLAG = true;

    public static void main(String[] args) throws InterruptedException {
//        ThreadCommucationDemo1 demo1 = new ThreadCommucationDemo1();
//        demo1.print();
        Thread thread = new Thread(new ThreadCommucationDemo1());

        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(2);

        ThreadPoolExecutor pool =
                new ThreadPoolExecutor(2, 2, 10,
                        TimeUnit.SECONDS, queue, new DefaultThreadFactory("testPool"), new ThreadPoolExecutor.DiscardPolicy());
        while (i < 101) {
            pool.submit(thread);
        }
        System.out.println("main thread ends");
        pool.shutdown();
    }

    public void print() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (this) {
                int i = 1;
                while (i < 101) {
                    notify();
                    if (i % 2 == 1) {
                        System.out.println("thread1 prints : " + i);
                    }
                    i++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                int i = 1;
//                while (i < 101) {
//                    notify();
//                    if (FLAG) {
//                        System.out.println("thread1 prints :" + i);
//                        i+=2;
//                        FLAG = false;
//                        try {
//                            wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }

            }
        });

        Thread thread2 = new Thread(() -> {

            synchronized (this) {
                int i = 1;
                while (i < 101) {
                    notify();
                    if (i % 2 == 0) {
                        System.out.println("thread2 prints : " + i);
                    }
                    i++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
//                int i =2;
//                while (i < 101) {
//                    notify();
//                    if (!FLAG) {
//                        System.out.println("thread2 prints :" + i);
//                        FLAG = true;
//                        i+=2;
//                        try {
//                            wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }

            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
