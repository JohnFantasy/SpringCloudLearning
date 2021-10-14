package com.laofaner.MultiThread.bilibili;

/**
 * @author fanyuzhuo
 * @createAt 2021-09-30 15:40
 * @description
 */
public class StackOverFlowErrorTest {

    static Integer count = 0;

    public void king() {
        count++;
        king();
    }

    public static void main(String[] args) {
        StackOverFlowErrorTest test = new StackOverFlowErrorTest();
        try {
            test.king();
            System.out.println("count ::  " + count);
        } catch (Exception e) {
            System.out.println("count ::  " + count);
            e.printStackTrace();
        }
    }
}
