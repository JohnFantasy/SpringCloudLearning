package com.laofaner.algorithm;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 题目：判断101-200之间有多少个素数，并输出所有素数。 1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。
 * @author: fyz
 * @create: 2019-10-18 10:44
 **/
public class Primes {

    public static void main(String[] args) {

        for(int x = 101;x<201;x++){
            System.out.println("数字"+x+(isPrime(x)?"是":"不是")+"素数");
        }
    }

    public static boolean isPrime(int destination) {
        for (int i = 2; i < destination / 2; i++) {
            if (destination % i == 0) {
                return false;
            }
        }
        return true;
    }
}
