package com.laofaner.javasourcecode.tests;

/**
 * @ClassName YearAndMonthTest
 * @Description TODO
 * @Author fyz
 * @Date 3/12/2019 17:28 PM
 * @Version 1.0
 */
public class YearAndMonthTest {

    public static void main(String[] args) {


        for (int g = 1; g < 13; g++) {
            String tail = "0";
            if (String.valueOf(g).length() < 2) {
                tail = tail + g;
            }
            for (int i = 2175; i < 2225; i++) {
                System.out.println(String.valueOf(i) + tail);
            }
        }
    }
}
