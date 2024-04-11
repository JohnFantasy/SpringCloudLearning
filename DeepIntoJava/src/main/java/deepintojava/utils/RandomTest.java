package deepintojava.utils;

import java.util.Random;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-17 12:59
 * @description
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(1000));

        }
    }
}
