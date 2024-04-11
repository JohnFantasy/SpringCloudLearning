package deepintojava.javaFoundation.JavaBasic.stirngTest;

public class StringBuilderBufferTest {
    public static void main(String[] args) {

        String str = "abc";
        str.replace("a","x");
        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
        sb.append("str");
        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer(sb);
        stringBuffer.append("str2");

        System.out.println(stringBuffer);

    }
}
