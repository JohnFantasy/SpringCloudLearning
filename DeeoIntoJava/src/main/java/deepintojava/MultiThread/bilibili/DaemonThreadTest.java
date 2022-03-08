package deepintojava.MultiThread.bilibili;

/**
 * @author fanyuzhuo
 * @createAt 2021-10-04 11:39
 * @description
 */
public class DaemonThreadTest extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "I extends from Thread...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("...............finally");
        }
    }

    static {
        DaemonThreadTest daemonThreadTest = new DaemonThreadTest();
        daemonThreadTest.setDaemon(true);
        daemonThreadTest.start();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
    }
}

