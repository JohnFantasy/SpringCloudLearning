package deepintojava.java8NewFeatures.stream;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {


    public static void main(String[] args) {
        List<String> collect1 = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());


        Car car;
        car = new Car().setAge(2).setDescription("first car").setName("benchi").setAge(2);
        Phone phone = new Phone().setBrand("Apple").setVersion("7").setOrderNo(1);
        Phone phone1 = new Phone().setBrand("Apple").setVersion("8").setOrderNo(2);
        Phone phone2 = new Phone().setBrand("Apple").setVersion("9").setOrderNo(3);
        Phone phone3 = new Phone().setBrand("Apple").setVersion("10").setOrderNo(4);
        Phone phone4 = new Phone().setBrand("Apple").setVersion("11").setOrderNo(5);
        Phone phone5 = new Phone().setBrand("Apple").setVersion("12").setOrderNo(6);
        List<Phone> phones = new ArrayList<>();
        phones.add(phone);
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);

        Person person = new Person()
                .setName("zhangsan")
                .setCertId("500222199012122855")
                .setCar(car)
                .setPhones(phones);

        List<Phone> collect = phones.stream()
                .peek(item -> {
                    System.out.println(item.getOrderNo());
                    item.setOrderNo(item.getOrderNo() + 1);
                    System.out.println(item.getOrderNo());
                }).collect(Collectors.toList());

        Map<Integer, Phone> map = phones
                .stream()
                .collect(Collectors.toMap(Phone::getOrderNo, phonexx -> phonexx));
        System.out.println(map);

        System.out.println(phone);
    }
}

@Data
@Accessors(chain = true)
class Car {
    private Integer age;
    private String name;
    private String description;
}

@Getter
@Setter
@Accessors(chain = true)
class Phone {
    private String brand;
    private Integer orderNo;
    private String version;
}

@Data
@Accessors(chain = true)
class Person {
    private String certId;
    private String name;
    private Car car;
    private List<Phone> phones;
}

