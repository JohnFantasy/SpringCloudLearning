package deepintojava.javaFoundation.messageFormatTests;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 学习MessageFormat使用
 * @author: fyz
 * @create: 2019-11-19 14:37
 **/
public class MessageFormatTests {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("zhangsan");
        student1.setHobbies("chifan");
        Student student2 = new Student();
        student2.setName("zhangsan");
        student2.setHobbies("chifan");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        Object[] objects = list.toArray();
        MessageFormat mf = new MessageFormat("objects[{0}].getName()");
        for (int i = 0; i < objects.length; i++) {
            String str = mf.format(new Object[i]);
            System.out.println(str);
        }

    }
}

class Student {

    private String name;

    private String hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
