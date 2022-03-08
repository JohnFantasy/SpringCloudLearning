package deepintojava.javaFoundation.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.javasourcecode.collection.list
 * @Author: fanyuzhuo
 * @CreateTime: 2019-05-05 23:30
 * @Description: TODO
 * @Version 1.0
 */
public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
//        if(list.contains(new String("aaa"))){
//            System.out.println(true);
//        }

        String a = new String("aaa");
        System.out.println("aaa"==a);
        System.out.println(list.contains(a));
    }
}
