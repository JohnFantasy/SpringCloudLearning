package deepintojava.juc.deadlock;

import java.util.concurrent.TimeUnit;

/**
 * @Author fyz
 * @Date 2022/6/23 19:12
 * @Description TODO
 **/
public class Philosopher extends Thread {
    private Integer index;
    private Chopstick left;
    private Chopstick right;

    public Philosopher(String name, Integer index, Chopstick left, Chopstick right) {
        this.setName(name);
        this.index = index;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {

        if (index %2 == 1) {
            synchronized (right) {
                try {
                    Thread.sleep((1 + index) * 1000L);
                    synchronized (left) {
                        Thread.sleep(1000L);
                        System.out.println(index + " 号哲学家已经吃完");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            synchronized (left) {
                try {
                    Thread.sleep((1 + index) * 1000L);
                    synchronized (right) {
                        Thread.sleep(1000L);
                        System.out.println(index + " 号哲学家已经吃完");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
