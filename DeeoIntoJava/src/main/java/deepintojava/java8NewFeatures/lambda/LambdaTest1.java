package deepintojava.java8NewFeatures.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

    /**
     * 消费型接口：有参无返回值
     */
    @Test
    public void consumerTest(){
        consumption(2000, (x) -> System.out.println("今天去逛商场，消费了"+x+"元。"));
    }

    /**
     * @param money 消费的金额
     * @param consumer 消费的项目，这里暂时还不知道具体是什么项目
     */
    public void consumption(double money, Consumer<Double> consumer){
        consumer.accept(money);

    }


    /**
     * 生产型接口：无参数有返回值
     */
    @Test
    public void SupplierTest(){
        List<Integer> list = getNumbers(5, () -> (int) (Math.random() * 20));
        for (Integer n : list ) {
            System.out.println(n);
        }
    }

    /**
     * 随机生成指定数量的整数
     * @param num 指定生成的数量
     * @param supplier 生成什么样的整数，有可能是10以内，也有可能是100以内的
     * @return 装有生产好的整数的集合
     */
    public List<Integer> getNumbers(int num, Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer integer = supplier.get();
            list.add(integer);
        }
        return list;
    }


    /**
     * 函数型接口：有参数有返回值
     * 这里截取出“热爱”两个字
     */
    @Test
    public void functionTest(){
        String str = strHandler("又是热爱学习的一天！", (x) -> x.substring(2, 4));
        System.out.println(str);
    }


    /**
     * 处理指定字符串
     * @param str 指定需要被处理的字符串
     * @param fun 处理办法，可以是截取，可以是拼接，现在暂时不用管。
     * @return 处理好的字符串
     */
    public String strHandler(String str, Function<String, String> fun){
        return fun.apply(str);
    }


    /**
     * 断言型接口：有参数也有返回值
     * 过滤大于50的整数
     */
    @Test
    public void predicateTest(){
        List<Integer> list = Arrays.asList(23, 45, 78, 99, 64);
        List<Integer> nums = filterNum(list, (x) -> x > 50);
        for (Integer num: nums) {
            System.out.println(num);
        }
    }

    /**
     * 将指定整数集合进行过滤，挑选出满足条件的，放入集合并返回
     * @param nums 待过滤的指定整数集合
     * @param predicate 过滤规则
     * @return 过滤完后的整数集合
     */
    public List<Integer> filterNum(List<Integer> nums, Predicate<Integer> predicate){
        List<Integer> list = new ArrayList<>();
        for (Integer n: nums) {
            if(predicate.test(n)){
                list.add(n);
            }
        }
        return list;
    }


}
