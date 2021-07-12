package com.laofaner.jvm.tulingBzhan.jvmMemory;

import java.util.ArrayList;

/**
 * @author fanyuzhuo
 * @createAt 2021-07-09 20:54
 * @description
 */
public class HeapTest {

    byte[] a = new byte[1024 * 100];

    public static void main(String[] args) throws InterruptedException {
        ArrayList<HeapTest> heapTests = new ArrayList<>();
        while (true) {
            heapTests.add(new HeapTest());
            Thread.sleep(10);
        }
    }
}
