package deepintojava.javaFoundation.JavaBasic.stirngTest;

public class InternTest {

    public static void main(String[] args) {
        String a = "abc";

        String b = new String("abc");

        System.out.println(a == b);

        String c  = b.intern();

        System.out.println(a == c);
        System.out.println(b == c);
    }
}
