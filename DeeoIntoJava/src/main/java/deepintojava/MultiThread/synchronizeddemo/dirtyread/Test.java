package deepintojava.MultiThread.synchronizeddemo.dirtyread;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-23 16:14
 * @description
 */
public class Test {
    public static void main(String[] args) {
        PublicVar publicVar = new PublicVar();

        try {
            ThreadA a = new ThreadA(publicVar);
            a.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
