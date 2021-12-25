package com.laofaner.MultiThread.ThreadsCommunication;


public class CommunicationBetweenThreadsTests {

    private static final String LOCK = "lock";

    private static volatile int i = 0;

    public static void main(String[] args) {
        new Thread(new ThreadA()).start();
        new Thread(new ThreadB()).start();
    }

    static class ThreadA implements Runnable {

        @Override
        public void run() {

            while (i < 100) {

//                try {
//                    LOCK.notify();
//                    LOCK.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                if (i % 2 == 0) {
                    System.out.println("ThreadA--->" + i);
                    synchronized (this) {
                        i++;
                    }
                }
            }
        }
    }

    static class ThreadB implements Runnable {

        @Override
        public void run() {
            while (i < 100) {

//                try {
//                    LOCK.notify();
//                    LOCK.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                if (i % 2 == 1) {
                    System.out.println("ThreadB--->" + i);
                    synchronized (this) {
                        i++;
                    }
                }

            }
        }
    }
}
