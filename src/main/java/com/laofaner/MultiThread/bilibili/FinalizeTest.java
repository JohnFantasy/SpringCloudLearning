package com.laofaner.MultiThread.bilibili;

/**
 * @author fanyuzhuo
 * @createAt 2021-10-04 09:31
 * @description
 */
public class FinalizeTest {

    public static FinalizeTest instance = null;

    public void isAlive() {
        System.out.println("I am still alive!");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize() method executed!");
        FinalizeTest.instance = this;
    }

    public static void main(String[] args) throws InterruptedException {
        instance = new FinalizeTest();

        //第一次将对象置空并手动调用gc()方法触发垃圾回收
        instance = null;
        System.gc();
        Thread.sleep(1000);
        if (instance != null) {
            instance.isAlive();
        } else {
            System.out.println("I am dead!");
        }


        //第二次将对象置空并手动调用gc()方法触发垃圾回收
        //本次手动触发，发现instance对象已经死亡，说明finalize()方法只能被执行一次
        //结论：不要重写并使用使用finalize()方法
        instance = null;
        System.gc();
        Thread.sleep(1000);
        if (instance != null) {
            instance.isAlive();
        } else {
            System.out.println("I am dead!");
        }
    }
}
