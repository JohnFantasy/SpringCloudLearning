package com.laofaner.springboot.controller.demo;

import java.math.BigDecimal;

/**
 * @program: SpringBoot&SpringCloud
 * @description: tedst
 * @author: fyz
 * @create: 2019-09-24 17:24
 **/
public class Student {
    private String name;
    private String sex;
    private Double age;
    private Double height;
    private BigDecimal score;

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
