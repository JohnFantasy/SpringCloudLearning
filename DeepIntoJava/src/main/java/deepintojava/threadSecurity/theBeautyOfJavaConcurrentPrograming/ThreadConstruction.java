package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadConstruction {


    //线程创建的第一种方式：集成Thread类并重写run()方法

    /**
     * 缺点：
     * 1、限于Java单继承的规定，一个类继承了Thread就无法再继承其他类
     * 2、任务和代码没有分开，当多个线程执行同一个任务时，需要分多份任务代码
     * 3、没有返回值
     */
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("I am a child thread...");
        }
    }

    /**
     * 线程创建的第二种方式：实现Runnable接口，使用Thread的new Thread(Runnable runnable)构造方法创建线程
     * 缺点：
     * 无返回值
     */
    public static class RunnableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("I am a runnable task...");
        }
    }


    /**
     * 创建线程的第三种方式： FutureTask
     */
    public static class CallerTask implements Callable<String> {

        @Override
        public String call() throws Exception {


            return "exception";
        }
    }


    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();

//        new Thread(new RunnableTask()).start();
//        new Thread(new RunnableTask()).start();
//        new Thread(new RunnableTask()).start();

        FutureTask<String> futureTask = new FutureTask<>(() -> "null");
        new Thread(futureTask).start();
        try {
            String s = futureTask.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
