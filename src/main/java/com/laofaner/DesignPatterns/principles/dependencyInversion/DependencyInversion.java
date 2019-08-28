package com.laofaner.DesignPatterns.principles.dependencyInversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.recieve(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}

// 完成一个person接收消息的功能
// 方式一分析：
// 1、好处： 简单、容易想到此方案
// 2、问题： 如果我们获取的消息是微信、短信等等，则改动成本非常大：要新增类，同时Person类要增加相应的接收方法。
// 3、解决思路： 引入一个抽象接口IReciever,表示接收者，这样Person类与接口发生依赖
// 因为Email、微信等信息都属于接收的范畴，他们各自实现IReciever接口就可以了
// 这样即符合了依赖倒转原则
class Person {
    public void recieve(Email email) {
        System.out.println(email.getInfo());
    }
}
