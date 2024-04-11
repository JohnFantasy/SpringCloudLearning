package deepintojava.utils;

/**
 * @author fanyuzhuo
 * @createAt 2021-02-28 18:27
 * @description
 */
public class SSQTest {

    public static void main(String[] args) throws Exception {
        String s = HttpUtil.get("http://182.92.109.149/getData/ssq.TXT");
        System.out.println(s);
    }
}
