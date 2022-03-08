package deepintojava.stackoverflow;

import java.util.Random;

/**
 * @author fanyuzhuo
 * @createAt 2021-07-01 14:56
 * @description
 */
public class Test1 {
    public static int forceSearch1(String text, String pattern) {
        int patternLength = pattern.length();
        int textLength = text.length();

        for (int i = 0, n = textLength - patternLength; i <= n; i++) {
            int j = 0;
            for (; j < patternLength && text.charAt(i + j) == pattern.charAt(j); j++) {
                ;
            }
            if (j == patternLength) {
                return i;
            }
        }
        return -1;
    }


    public static int forceSearch2(String text, String pattern) {
        int patternLength = pattern.length();
        int textLength = text.length();

        char first = pattern.charAt(0);
        for (int i = 0, n = textLength - patternLength; i <= n; i++) {
            if (text.charAt(i) != first) {
                while (++i <= n && text.charAt(i) != first)
                    ;
            }

            int j = 0;
            for (; j < patternLength && text.charAt(i + j) == pattern.charAt(j); j++) {
                ;
            }
            if (j == patternLength) {
                return i;
            }
        }
        return -1;
    }


    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        String text = getRandomString(5000);
        String text = "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";
        System.out.println(text);
//        String pattern = getRandomString(2);
        String pattern = "y7m7";
        System.out.println(pattern);
        long start = System.currentTimeMillis();
        int i = Test1.forceSearch2(text, pattern);
        System.out.println(i);
        System.out.println("this method took " + (System.currentTimeMillis() - start) + " milliseconds to execute.");
    }

}


