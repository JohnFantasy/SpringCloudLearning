package deepintojava.juc.deadlock;

/**
 * @Author fyz
 * @Date 2022/6/23 19:13
 * @Description TODO
 **/
public class Main {
    public static void main(String[] args) {
        Chopstick cs0 = new Chopstick();
        Chopstick cs1 = new Chopstick();
        Chopstick cs2 = new Chopstick();
        Chopstick cs3 = new Chopstick();
        Chopstick cs4 = new Chopstick();

        Philosopher p0 = new Philosopher("p0",0,cs0,cs1);
        Philosopher p1 = new Philosopher("p1",1,cs1,cs2);
        Philosopher p2 = new Philosopher("p2",2,cs2,cs3);
        Philosopher p3 = new Philosopher("p3",3,cs3,cs4);
        Philosopher p4 = new Philosopher("p4",4,cs4,cs0);
        p0.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }

}
