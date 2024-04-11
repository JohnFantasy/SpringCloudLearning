package deepintojava.javaFoundation.StringUtil;

public class SichuanTest {
    public static void main(String[] args) {
        String str = "";
        String[] split = str.split("、");
        for (String s : split) {
            System.out.println(s);
        }
    }
}