package deepintojava.threadSecurity.volatil;


import lombok.SneakyThrows;

/**
 * 目标：研究多线程环境下共享变量不可见的现象
 * <p>
 * 准备内容：
 * 1.准备两个线程
 * 2.定义一个成员变量
 * 3.开启两个线程，一个线程修改，另一个线程读取
 */

public class VisibilityDemo01 {

    // main方法，作为主线程
    public static void main(String[] args) {
        // a.开启一个子线程
        MyThread t1 = new MyThread();
        t1.start();
        // b.主线程执行
        while (true) {
            if (t1.isFlag()) {
                System.out.println("Main thread executes");
            }
        }
    }
}

class MyThread extends Thread {

    private volatile boolean flag = false;

    @SneakyThrows
    @Override
    public void run() {

        Thread.sleep(1000);

        flag = true;
        System.out.println("flag == " + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
