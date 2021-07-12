package com.laofaner.javaFoundation.copytest.pojo;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-09 15:44
 * @description
 */
public class CopyTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car();
        car.setBrand("benz");
        car.setType("home");
        Person person = new Person();
        person.setGender(1);
        person.setName("fanyuzhuo");
        person.setMyCar(car);

        Person person1 = (Person) person.clone();
        System.out.println(person1.getName());
        System.out.println(person1.getMyCar());


    }
}
