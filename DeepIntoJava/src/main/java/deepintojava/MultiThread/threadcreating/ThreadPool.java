package deepintojava.MultiThread.threadcreating;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-30 13:57
 * @description
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        for(int i =0;i<10;i++){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(() -> System.out.println(Thread.currentThread().getName()));
        }
        executorService.shutdownNow();

    }
}
