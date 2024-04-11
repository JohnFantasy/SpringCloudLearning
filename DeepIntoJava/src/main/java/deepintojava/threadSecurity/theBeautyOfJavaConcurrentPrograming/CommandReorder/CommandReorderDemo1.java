package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming.CommandReorder;

import jxl.demo.Write;

public class CommandReorderDemo1 {


    private static int num = 0;
    private static boolean ready = false;

    static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (ready) {
                    System.out.println(num + num);
                }
            }
            System.out.println("readThread......");
        }
    }

    static class WriteThread extends Thread {
        @Override
        public void run() {
            num = 2;
            ready = true;
            System.out.println("writeThread set over......");
        }
    }

    public static void main(String[] args) {
        ReadThread rt = new ReadThread();
        rt.start();

        WriteThread wt = new WriteThread();
        wt.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rt.interrupt();
        System.out.println("main exit...");
    }
}

