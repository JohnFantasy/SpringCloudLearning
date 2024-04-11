package deepintojava.xiyue;

import java.util.*;
import java.util.stream.*;

/**
 * @Author fyz
 * @Date 2022/6/15 14:14
 * @Description TODO
 **/
public class StreamTest {

    /**
     * todo 使用Java8的stream针对集合数据做流式处理时，如果将一系列的操作放在一行代码中，易读性会比较差，比较好一点的书写方法可以参考我在下面写的那些代码
     *
     * @param args
     * @return void
     * @author fyz
     * @date 2022/6/16 18:01
     **/
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        int[] arr = {5, 3, 6, 10, 2, 7};


        System.out.println("1.看到上面的arr数组了吗，控制台输出数组每个数字的平方");
        //TODO: 第1题  OK
        Arrays.stream(arr).map(i -> i * i).forEach(System.out::println);
        System.out.println("=====================question 1 ends===========================");
        System.out.println("2.有没有交易员是在米兰工作的？(不用Lambda)");
        //trader 没有写成list，我自己写了一个
        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
        boolean present1 = traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList()).contains("Milan");

        //TODO: 第二题不用自己构造List，使用transactions集合也可以
        boolean milan = transactions.stream()
                .map(Transaction::getTrader)
                .collect(Collectors.toList())
                .stream().map(Trader::getCity)
                .collect(Collectors.toList())
                .contains("Milan");
        System.out.println(milan);
        System.out.println("2.Present or not :" + present1);

        System.out.println("=====================question 2 ends===========================");
        System.out.println("3.有没有交易员是在米兰工作的？");
        boolean present2 = traders.stream().filter(m -> m.getCity().equals("Milan")).findAny().isPresent();
        System.out.println("3.Present or not :" + present2);

        //TODO: 第3题可以用anyMatch
        boolean present22 = traders.stream()
                .anyMatch(m -> m.getCity().equals("Milan"));
        System.out.println("3(fyz).Present or not :" + present22);
        System.out.println("=====================question 3 ends===========================");

        System.out.println("4.找出2011年所有交易 并按照交易额排序（低->高）?");
        //List<Transaction> transactionList =
        transactions.stream().filter(m -> m.getYear() == 2011).sorted((s1, s2) -> s1.getValue() - s2.getValue()).collect(Collectors.toList()).forEach(System.out::println);

        //TODO: 第4题可以用Comparator，写法优雅一点，没事的时候补充一下Java比较器接口Comparator
        transactions.stream()
                .filter(m -> m.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("=======================question 4 ends=========================");

        System.out.println("5.交易员都在哪些不同城市工作过?");
        traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=======================question 5 ends=========================");

        System.out.println("6.查找出来自剑桥的交易员，并按姓名排序?");
        // TODO: 同4
        traders.stream().filter(m -> m.getCity().equals("Cambridge")).sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).forEach(System.out::println);

        System.out.println("========================question 6 ends========================");
        System.out.println("7.打印生活在剑桥的交易员的所有交易额");
        int sum = transactions.stream().filter(m -> m.getTrader().getCity().equals("Cambridge")).mapToInt(m -> m.getValue()).sum();
        System.out.println(sum);
        // TODO: m.getValue可用lambda表达式替换
        int sum7 = transactions.stream()
                .filter(m -> m.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue).sum();
        System.out.println(sum7);
        System.out.println("=======================question 7 ends=========================");
        System.out.println("8.返回所有交易员姓名的字符串，并按字母顺序排序打印");
        traders.stream().map(m -> m.getName()).sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);

        // TODO: 同4、7
        traders.stream().map(Trader::getName)
                .sorted(String::compareTo)
                .forEach(System.out::println);
        System.out.println("========================question 8 ends========================");
        System.out.println("9.所有交易中，最高的交易额是多少");
        transactions.stream().max(Comparator.comparing(m -> m.getValue())).ifPresent(e -> System.out.println("Max: " + e.getValue()));
        //TODO: 同7
        transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .ifPresent(e -> System.out.println("Max: " + e.getValue()));


        System.out.println("========================question 9 ends========================");
        System.out.println("10.找到交易额最小的交易");
        transactions.stream().min(Comparator.comparing(m -> m.getValue())).ifPresent(e -> System.out.println("Min: " + e.getValue()));
        //TODO: 同7
        transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .ifPresent(e -> System.out.println("Min: " + e.getValue()));


        System.out.println("======================question 10 ends==========================");
        System.out.println("11.将上面transactions列表转为key为name，value为交易额的Map并在控制台打印");
        Map<Trader, Integer> map = transactions.stream().collect(Collectors.toMap(Transaction::getTrader, Transaction::getValue, (e1, e2) -> e1 + e2));
        System.out.println(map);
        //TODO:
        transactions.stream()
                .collect(Collectors.toMap(transaction -> transaction.getTrader().getName(), Transaction::getValue, Integer::sum))
                .forEach((k, v) -> {
                    System.out.println("trader name: " + k + ", sales amount: " + v);
                });

        transactions.stream().
                collect(Collectors.groupingBy(item -> item.getTrader().getName()))
                .forEach((k, v) -> System.out.println("trader " + k + ", total sales amount: " + v.stream().mapToInt(Transaction::getValue).sum()));


        System.out.println("====================question 11 ends======================");
    }

}

class Trader {
    //姓名
    private final String name;
    //城市
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Transaction {
    //交易员
    private final Trader trader;
    //年份
    private final int year;
    //交易额
    private final int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getYear() {
        return this.year;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "{" + this.trader + ", " +
                "year: " + this.year + ", " +
                "value:" + this.value + "}";
    }
}
