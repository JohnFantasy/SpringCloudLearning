package deepintojava.DesignPatterns.principles.segregation;

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

public class Demo1 {
    public static void main(String[] args) {

    }
}

class B implements Interface1 {
    public void operation1() {
        System.out.println("Class B 实现了operation1");
    }

    public void operation2() {
        System.out.println("Class B 实现了operation2");
    }

    public void operation3() {
        System.out.println("Class B 实现了operation3");
    }

    public void operation4() {
        System.out.println("Class B 实现了operation4");
    }

    public void operation5() {
        System.out.println("Class B 实现了operation5");
    }
}
class D implements Interface1 {
    public void operation1() {
        System.out.println("Class B 实现了operation1");
    }

    public void operation2() {
        System.out.println("Class B 实现了operation2");
    }

    public void operation3() {
        System.out.println("Class B 实现了operation3");
    }

    public void operation4() {
        System.out.println("Class B 实现了operation4");
    }

    public void operation5() {
        System.out.println("Class B 实现了operation5");
    }
}

class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface1 i) {
        i.operation4();
    }

    public void depend5(Interface1 i) {
        i.operation5();
    }
}