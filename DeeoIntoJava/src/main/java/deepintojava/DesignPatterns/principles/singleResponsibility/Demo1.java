package deepintojava.DesignPatterns.principles.singleResponsibility;

public class Demo1 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }
}

//交通工具类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上跑。。。。。。");
    }
}
