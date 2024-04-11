package deepintojava.reflection;

import java.lang.reflect.Field;

public class StringTest01 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //此处声明一个字符串变量赋值“abc”,如何在不改变str变量指向的情况下使str输出为“abcd”
        String str = "abc";

        Field value = str.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(str, "abcd".toCharArray());

        System.out.println(str);

    }
}
