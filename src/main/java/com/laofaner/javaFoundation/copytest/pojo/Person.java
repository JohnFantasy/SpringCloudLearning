package com.laofaner.javaFoundation.copytest.pojo;

import lombok.Data;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-09 15:43
 * @description
 */
@Data
public class Person implements Cloneable{
    private String name;

    private Integer gender;

    private Car myCar;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
