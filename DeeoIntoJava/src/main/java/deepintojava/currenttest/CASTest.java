package deepintojava.currenttest;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author fanyuzhuo
 * @createAt 2021-07-18 15:18
 * @description
 */
public class CASTest {

    public static void main(String[] args) {
        AtomicInteger atomicInteger  = new AtomicInteger();
        System.out.println(atomicInteger.get());

        AtomicStampedReference atomicStampedReference = new AtomicStampedReference(new Object(),0);

    }
}
