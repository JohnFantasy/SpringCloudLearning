package deepintojava.xiyue;

public class XiyueThreadTest {

    private volatile int i;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public synchronized void printOdd() throws InterruptedException {
        while (i % 2 == 0) {
            this.wait();
        }
        System.out.println(Thread.currentThread().getName() + " prints : " + i);
        i++;
        Thread.sleep(500);
        this.notify();
    }

    public synchronized void printEven() throws InterruptedException {
        while (i % 2 == 1) {
            this.wait();
        }
        System.out.println(Thread.currentThread().getName() + " prints : " + i);
        i++;
        Thread.sleep(500);
        this.notify();
    }

    public static void main(String[] args) throws InterruptedException {
        XiyueThreadTest q = new XiyueThreadTest();
        q.setI(0);
        Thread th1 = new Thread() {
            public void run() {
                while (q.getI() <= 99) {
                    try {
                        q.printEven();
//                        System.out.println("(one)");
                    } catch (InterruptedException e) {
                        return;
                    }

                }
            }
        };
        Thread th2 = new Thread() {
            public void run() {
                while (q.getI() <= 99) {
                    try {
                        q.printOdd();
//                        System.out.println("(two)");
                    } catch (InterruptedException e) {
                        return;
                    }

                }
            }
        };
        th1.setName("thread one ");
        th2.setName("thread two ");
        th1.start();
        th2.start();

    }
}
