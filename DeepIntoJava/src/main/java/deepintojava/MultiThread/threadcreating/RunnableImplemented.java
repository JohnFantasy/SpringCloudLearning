package deepintojava.MultiThread.threadcreating;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-30 13:56
 * @description 第二种创建线程的方法：实现Runnable接口并用Thread的构造方法Thread(Runnable runnable)创建线程
 */
public class RunnableImplemented implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---------" + i);

        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "==========" + i);
            if (i == 10) {
                new Thread(new RunnableImplemented(), "thread-runnable1").start();
                new Thread(new RunnableImplemented(), "thread-runnable2").start();
                new Thread(new RunnableImplemented(), "thread-runnable3").start();
            }
        }


    }
}
