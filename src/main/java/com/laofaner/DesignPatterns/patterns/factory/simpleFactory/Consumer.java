package com.laofaner.DesignPatterns.patterns.factory.simpleFactory;

/**
 * @author fanyuzhuo
 * @createAt 2021-02-05 11:20
 * @description
 */
public class Consumer {

    public static void main(String[] args) {
//        Car car = new WuLing();
//        Car car1 = new Tesla();
//
//        car.name();
//        car1.name();

        Car tesla = CarFactory.getCar("Teslaa");
        assert tesla != null;
        tesla.name();
    }
}
