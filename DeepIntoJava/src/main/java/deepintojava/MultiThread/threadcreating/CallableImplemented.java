package deepintojava.MultiThread.threadcreating;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-30 13:56
 * @description
 */
public class CallableImplemented implements Callable<String> {


//    public static void main(String[] args) {
////        FutureTask<String> future = new Future<String>((Callable < String >) () -> {
////            return "thread-callable";
////        });
////        FutureTask<Integer> task =  new FutureTask<>((Callable<Integer>)()->{
////            int i = 0;
////            for(;i < 50;i++) {
////                System.out.println(Thread.currentThread().getName() +
////                        "  的线程执行体内的循环变量i的值为：" + i);
////            }
////            //call()方法的返回值
////            return i;
////        });
//
//    }

    @Override
    public String call() throws Exception {
        return "String ---- callable";
    }

    public static void main(String[] args) {
//        FutureTask<String> task = new FutureTask<>(new CallableImplemented() {
//            @Override
//            public String call() throws Exception {
//                System.out.println("callable-thread");
//                return "string=call";
//            }
//        });
//        new Thread(task).start();
//        System.out.println(task.get());

        FutureTask<String> task = new FutureTask<>((Callable<String>) () -> {
            int i = 0;
            for (int j = 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName() + "======" + j);
                i++;
            }
            return String.valueOf(i);
        });

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-------" + i);
            if (i == 5) {
                new Thread(task).start();
            }
        }
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
