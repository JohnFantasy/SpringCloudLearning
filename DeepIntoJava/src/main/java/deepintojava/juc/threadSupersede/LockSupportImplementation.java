package deepintojava.juc.threadSupersede;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author fyz
 * @Date 2022/6/23 19:46
 * @Description TODO
 **/
public class LockSupportImplementation {

    static Thread t1;
    static Thread t2;

    public static void main(String[] args) {

        char[] c1 = {'1', '2', '3', '4', '5', '6'};
        char[] c2 = {'A', 'B', 'C', 'D', 'E', 'F'};


        t1 = new Thread(() -> {
            for (char c : c1) {
                System.out.println(c);
                LockSupport.park();
                LockSupport.unpark(t2);
            }
        }, "t1");
        t2 = new Thread(() -> {
            for (char c : c2) {
                LockSupport.park();
                System.out.println(c);
                LockSupport.unpark(t1);
            }
        }, "t1");

        t1.start();
        t2.start();
    }
}
