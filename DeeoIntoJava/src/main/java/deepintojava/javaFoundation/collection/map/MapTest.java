package deepintojava.javaFoundation.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author fyz
 * @Date 2/26/2019 18:22 PM
 * @Version 1.0
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("a", "b");
        map.put("v", "");
        map.put("z", null);
        System.out.println(map.get("v") == null);

        List<Long> list = new ArrayList<>();
        list.add(902201002193426347L);
        Long a = 902201002193426347L;
        System.out.println(list.contains(a));

        System.out.println(a.equals(902201002193426347L));

        // 验证map中的value为引用类型时，若对对象进行修改，则map中的元素随之改变
        Map<String, Student> map2 = new HashMap<>();
        Student aaa = new Student("张三");
        map2.put("a", aaa);
        aaa.setName("李四");
        System.out.println(map2.toString());


        int n = tableSizeFor(10);
        System.out.println(n);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(2<<31-1);


        System.out.println("----"+(1 << 31));


    }

    static int tableSizeFor(int cap) {
        int n = cap - 1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n >>> 1));
        n |= n >>> 1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n >>> 2));

        n |= n >>> 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n >>> 4));

        n |= n >>> 4;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n >>> 8));

        n |= n >>> 8;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n >>> 16));

        n |= n >>> 16;
        System.out.println(Integer.toBinaryString(n));


        return (n < 0) ? 1 : (n >= 10000) ? 10000 : n + 1;

    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}