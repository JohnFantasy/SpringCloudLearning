package com.laofaner.javasourcecode.JavaBasic;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.javasourcecode.JavaBasic
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-04 12:55
 * @Description: TODO
 * @Version 1.0
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[][] coordinate = new int[][]{};
        int firstRow = 0;
        int lastRow = 0;
        for (int i = 0; i < 10; i++) {
            firstRow = lastRow + 1;
            lastRow += i;
            System.out.println(firstRow + "l" + lastRow);
        }
    }
}
