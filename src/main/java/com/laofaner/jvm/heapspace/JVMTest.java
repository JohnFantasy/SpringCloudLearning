package com.laofaner.jvm.heapspace;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-17 16:56
 * @description
 */
public class JVMTest {
    public static void main(String[] args) throws InterruptedException {

        byte[] bytes = new byte[2 * 1024 * 1024];
        bytes = new byte[2 * 1024 * 1024];
        bytes = new byte[2 * 1024 * 1024];

        byte[] bytes1 = new byte[128 * 1024];
        bytes1 = null;

        byte[] bytes3 = new byte[2 * 1024 * 1024];
        Thread.sleep(10000L);
    }
}
