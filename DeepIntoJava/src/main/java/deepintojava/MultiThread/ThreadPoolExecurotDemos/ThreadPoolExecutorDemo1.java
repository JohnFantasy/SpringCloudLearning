package deepintojava.MultiThread.ThreadPoolExecurotDemos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo1 {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        ExecutorService executorService2 = Executors.newCachedThreadPool();

        long start = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < 100; i++) {
            executorService1.execute(new MyClass(i));
            executorService1.awaitTermination(10L, TimeUnit.MILLISECONDS);
        }
        executorService1.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("=============--->" + (end - start));
    }
}

class MyClass implements Runnable {

    int i = 0;

    public MyClass(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---" + i);
//        try {
////            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
