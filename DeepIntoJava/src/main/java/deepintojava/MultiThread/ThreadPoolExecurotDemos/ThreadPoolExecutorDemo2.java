package deepintojava.MultiThread.ThreadPoolExecurotDemos;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo2 {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                9,
                10,
                1L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100000),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 100000; i++) {
            int finalI = i;
            poolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + ":" + finalI));
        }
    }
}
