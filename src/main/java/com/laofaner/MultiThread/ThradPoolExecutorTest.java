package com.laofaner.MultiThread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.util.concurrent.DefaultThreadFactory;

import java.lang.reflect.Field;
import java.util.concurrent.*;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

/**
 * 演示ThreadPoolExecutor的拒绝策略
 */
public class ThradPoolExecutorTest {

    private static final int THREADS_SIZE = 1;
    private static final int CAPACITY = 1;

    public static void main(String[] args) throws Exception {

        // 创建线程池。线程池的"最大池大小"和"核心池大小"都为1(THREADS_SIZE)，"线程池"的阻塞队列容量为1(CAPACITY)。
        ThreadPoolExecutor pool = new ThreadPoolExecutor(THREADS_SIZE, THREADS_SIZE, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(CAPACITY));
        // 设置线程池的拒绝策略为"丢弃"
        pool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("my-thread-pool-%d").build();
        pool.setThreadFactory(factory);

        // 新建10个任务，并将它们添加到线程池中。
        for (int i = 0; i < 10; i++) {
            Runnable myrun = new MyRunnable("task-" + i);
            //设置睡眠时间，如果此睡眠时间大于任务执行时间，则提交的任务都会被执行；反之，则会触发拒绝策略
            Thread.sleep(100);
            BlockingQueue<Runnable> queue = pool.getQueue();
            System.out.println(queue.toString());
            pool.execute(myrun);
        }
        // 关闭线程池
        pool.shutdown();
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "-----" + this.name + " is running.");
            Thread.sleep(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
