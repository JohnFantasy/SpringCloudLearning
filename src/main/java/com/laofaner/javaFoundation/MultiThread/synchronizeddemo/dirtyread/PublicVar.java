package com.laofaner.javaFoundation.MultiThread.synchronizeddemo.dirtyread;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-23 16:14
 * @description
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName() + " username="
                    + username + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //该方法前加上synchronized关键字就同步了
    public void getValue() {
        System.out.println("getValue method thread name="
                + Thread.currentThread().getName() + " username=" + username
                + " password=" + password);
    }
}
