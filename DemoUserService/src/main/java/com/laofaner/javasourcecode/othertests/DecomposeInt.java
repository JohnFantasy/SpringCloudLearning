package com.laofaner.javasourcecode.othertests;

import java.util.Scanner;

/**
 * @author LilyLee
 * @date 2017年4月25日
 * @time 下午10:24:10
 * @Version 1.0
 * @email lilylee_1213@foxmail.com
 */
public class DecomposeInt {
    //定义正整数的最大值
    /**
     *
     */
    private static int LEN = 1000;
    private int[] result = new int[LEN];
    private int x = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecomposeInt di = new DecomposeInt();
        System.out.println("input number");
        int num = sc.nextInt();
        di.dispose(num);
        String ss = "";
        for (int i = 0; i < di.result.length; i++) {
            if (di.result[i] > 0) {
                ss += di.result[i] + "*";
            }
        }
        System.out.println(num + "=" + ss.substring(0, ss.length() - 1));
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] minPrime(int n) {
        int[] prime = new int[LEN];
        int a = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                prime[a++] = i;
            }
        }
        return prime;
    }

    public void dispose(int n) {

        int[] min = DecomposeInt.minPrime(n);
        int j = 0;
        for (j = 0; j < min.length; j++) {
            if (n % min[j] == 0) {
                this.result[x++] = min[j];
                if (n == min[j]) {
                    return;
                }
                break;
            }

        }
        this.dispose(n / min[j]);
    }


}
