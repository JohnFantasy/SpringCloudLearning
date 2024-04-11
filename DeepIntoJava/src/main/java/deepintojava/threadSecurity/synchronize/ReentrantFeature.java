package deepintojava.threadSecurity.synchronize;


/**
 * 演示synchronized可重入特性
 * 1、自定义线程类
 * 2、在线程类run方法中使用嵌套的同步代码块
 * 3、使用两个线程来执行
 */
public class ReentrantFeature {

    public static void main(String[] args) {
        Thread t1 = new MyClass();
        Thread t2 = new MyClass();
        t1.start();
        t2.start();
    }
}

class MyClass extends Thread {
    @Override
    public void run() {
        synchronized (MyClass.class) {
            System.out.println(getName() + "进入了同步代码块1");
            synchronized (MyClass.class) {
                System.out.println(getName() + "进入了同步代码块2");
            }
        }
    }
}
