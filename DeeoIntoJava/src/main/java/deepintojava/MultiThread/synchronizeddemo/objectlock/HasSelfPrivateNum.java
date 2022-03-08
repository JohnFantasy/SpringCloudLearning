package deepintojava.MultiThread.synchronizeddemo.objectlock;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-23 15:52
 * @description
 */

public class HasSelfPrivateNum {

    private int num;

    synchronized public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + "  num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
