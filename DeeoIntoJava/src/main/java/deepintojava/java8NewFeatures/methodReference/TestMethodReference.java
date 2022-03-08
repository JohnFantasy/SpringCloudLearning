package deepintojava.java8NewFeatures.methodReference;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 * @author fanyuzhuo
 * @createAt 2021-05-05 11:31
 * @description 若lambda体中的内容有方法已经实现了，那么我们可以使用“方法引用”，可以理解为（
 * 方法引用是lambda表达式的另外一种表现形式）
 * 主要有三种语法格式：
 * 对象::实例方法名
 * 类::静态方法名
 * 类::实例方法名
 */
public class TestMethodReference {

    @Test
    public void test1() {
        Consumer<String> com = (x) -> System.out.println("x=" + x);
    }
}
