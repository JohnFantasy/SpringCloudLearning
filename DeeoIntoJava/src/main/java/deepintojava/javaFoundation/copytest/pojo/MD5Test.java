package deepintojava.javaFoundation.copytest.pojo;

import cn.hutool.crypto.digest.MD5;
import org.springframework.util.DigestUtils;

public class MD5Test {
    public static void main(String[] args) {
        MD5 md5 = MD5.create();
        String fshihfsioo = md5.digestHex16("fshihfsioo");
        System.out.println(fshihfsioo);
        ClassLoader classLoader = MD5.class.getClassLoader();
        System.out.println(classLoader);

    }
}
