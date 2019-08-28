package com.laofaner.DesignPatterns.principles.dependencyInversion.improve;

//定义接口
interface IReciever {
    String getInfo();
}

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        // 客户端无需改变
        person.recieve(new Email());
        person.recieve(new Weixin());
    }
}

class Email implements IReciever {
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}

class Weixin implements IReciever {
    public String getInfo() {
        return "Hello Weixin";
    }
}

// 完成一个person接收消息的功能
// 方式2
class Person {
    public void recieve(IReciever reciever) {
        System.out.println(reciever.getInfo());
    }
}
