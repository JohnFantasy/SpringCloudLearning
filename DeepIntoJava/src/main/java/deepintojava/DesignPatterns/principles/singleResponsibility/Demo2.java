package deepintojava.DesignPatterns.principles.singleResponsibility;

public class Demo2 {
    public static void main(String[] args) {

        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }
}

//交通工具类
//1、这种修改方式没有对原来的类做大的修改，只是增加方法
//2、虽然没有在类的级别上遵守单一职责原则，但是在方法级别上遵守了单一职责原则
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上跑。。。。。。");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上上跑。。。。。。");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上上跑。。。。。。");
    }
}