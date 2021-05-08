package com.laofaner.java8NewFeatures.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 * @author fanyuzhuo
 * @createAt 2021-05-05 10:42
 * @description java8 4大核心函数式接口：
 * 1、Consumer<T>   消费型接口
 * void accept(T)t;
 * 2、Supplier<T>   供给型接口
 * T get();
 * 3、Function<T,R>  函数型接口
 * R apply(T t);
 * 4、Predicate<T>   断言型接口
 * boolean test(T t);
 */
public class LambdaTest1 {

    public static void main(String[] args) {

    }

    //Consumer<T> 消费型接口
    @Test
    public void test1() {
        happy(10000, (m) -> System.out.println("你们刚哥喜欢大宝剑，每次消费" + m + "元"));
    }

    public void happy(double money, Consumer<Double> com) {
        com.accept(money);

    }
}
