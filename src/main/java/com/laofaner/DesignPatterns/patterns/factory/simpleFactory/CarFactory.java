package com.laofaner.DesignPatterns.patterns.factory.simpleFactory;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author fanyuzhuo
 * @createAt 2021-02-05 11:22
 * @description
 */
public class CarFactory {

    public static Car getCar(String carName) {
        switch (carName) {
            case "五菱宏光":
                return new WuLing();
            case "Tesla":
                return new Tesla();
            default:
                return null;
        }
    }
}
