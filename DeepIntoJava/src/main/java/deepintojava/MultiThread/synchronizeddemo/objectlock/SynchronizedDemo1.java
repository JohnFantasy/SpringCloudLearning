package deepintojava.MultiThread.synchronizeddemo.objectlock;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-23 16:00
 * @description
 */
public class SynchronizedDemo1 {

    public static void main(String[] args) {

        // new 两个对象，则两个对象有两把锁，不会产生同步，两个线程异步执行
        HasSelfPrivateNum hasSelfPrivateNumA = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNumB = new HasSelfPrivateNum();

        //new 一个对象，则两个线程争抢一把锁，产生同步，b线程只有等待a线程释放锁之后才能拿到对象锁，才能执行synchronized代码块
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();

//        ThreadA a = new ThreadA(hasSelfPrivateNumA);
        ThreadA a = new ThreadA(hasSelfPrivateNum);
        a.start();

//        ThreadB b = new ThreadB(hasSelfPrivateNumB);
        ThreadB b = new ThreadB(hasSelfPrivateNum);
        b.start();
    }
}
