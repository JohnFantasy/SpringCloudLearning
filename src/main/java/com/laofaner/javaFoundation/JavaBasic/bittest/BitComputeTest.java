package com.laofaner.javaFoundation.JavaBasic.bittest;

import java.util.HashMap;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-11 14:09
 * @description
 */
public class BitComputeTest {

    public static void main(String[] args) {
        int a = 54;
        System.out.println(a>>64);
        System.out.println(a>>32);
        System.out.println(Integer.toBinaryString(a));
        new HashMap<>();
    }
}
