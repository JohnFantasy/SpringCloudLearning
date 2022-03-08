package deepintojava.threadSecurity.synchronize;


import java.util.ArrayList;
import java.util.List;

/**
 * 演示原子性问题：在一次或多次操作中，要么所有操作都执行并且不受其他操作的中断，要么全部都不执行
 * 1、定义一个共享变量 number
 * 2、对number进行1000次 ++ 操作
 * 3、使用5个线程来进行
 */
public class AtomicityTest01 {

    private static int number = 0;

    private static final Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (obj) {
                    number++;
                }
            }
        };
//        for (int i = 0; i < 5; i++) {
//            new Thread(runnable).start();
//        }

        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(runnable);
            t.start();
            list.add(t);
        }
        for (Thread t : list) {
            t.join();
        }
        System.out.println(number);
    }
}
