package com.laofaner.dataStructure;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Stack;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-28 16:17
 * @description
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            Student s = new Student().setName("zhangsan" + i).setAge(18);
            studentStack.push(s);
        }
        System.out.println(studentStack);

        // get the first element of the stack and remove it from the stack
        Student pop = studentStack.pop();
        System.out.println(pop.getName());

        // look for the first element of the stack
        Student peek = studentStack.peek();
        System.out.println(peek.getName());

        // test if the stack is empty, true for yes and false for no.
        boolean empty = studentStack.empty();
        System.out.println(studentStack);

        //
        Student student = new Student().setName("zhangsan1");
        System.out.println(studentStack);
        studentStack.push(student);
        studentStack.push(student);
        studentStack.push(student);
        studentStack.push(student);
        studentStack.push(null);
        studentStack.push(null);
        studentStack.push(null);
        studentStack.push(null);
        studentStack.push(null);
        int search = studentStack.search(student);
        System.out.println(search);


    }
}

@Data
@ToString
@Accessors(chain = true)
class Student implements Serializable {
    private String name;

    private Integer gender;

    private Integer height;

    private Integer age;

    private Integer classId;
}
