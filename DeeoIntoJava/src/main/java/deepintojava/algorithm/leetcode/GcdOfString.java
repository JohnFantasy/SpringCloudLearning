package deepintojava.algorithm.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @program: SpringBoot&SpringCloud
 * @description: eeee
 * @author: fyz
 * @createAt: 2020-03-12 16:08
 **/
public class GcdOfString {


    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0,gcd(str1.length(),str2.length()));
        }
        return "";
    }

    private int gcd(int a, int b) {
//        if (a < b) {
//            int temp = a;
//            b = temp;
//            a = b;
//        }
        return b == 0 ? a : gcd(b, a % b);
    }

    @Test
    public void test1(){
        GcdOfString gcd = new GcdOfString();
        String str1 = "AAAABBBB";
        String str2 = "AAAABBBBAAAABBBBAAAABBBB";
        String s = gcd.gcdOfStrings(str1, str2);
        System.out.println(s);
    }

}
