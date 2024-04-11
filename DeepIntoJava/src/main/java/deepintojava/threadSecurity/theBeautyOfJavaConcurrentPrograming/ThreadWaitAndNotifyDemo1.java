package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming;

import java.util.concurrent.LinkedBlockingDeque;

public class ThreadWaitAndNotifyDemo1 {

    public static final LinkedBlockingDeque<String> queue = new LinkedBlockingDeque<>();

    private static final int MAX_SIZE = 100;


    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (queue) {
                while (queue.size() == MAX_SIZE) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int i = 0;
                while (i < 100) {
                    queue.add("String" + i);
                    System.out.println("adding element into queue:" + "String" + i);
                    i++;
                }
                queue.notifyAll();
            }
        }).start();


//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        new Thread(() -> {
            synchronized (queue) {
                while (queue.size() == 0) {
                    try {
                        queue.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {
                    int i = 0;
                    while (i < 100) {
                        String take = queue.take();
                        System.out.println("taking element from queue" + take);
                        i++;
                    }
                    queue.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
