package deepintojava.DesignPatterns.principles.liskov;

public class Liskov {
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.func1(11,3));
        System.out.println(a.func1(1,8));

        B b = new B();
        System.out.println(b.func1(11,3));
        System.out.println(b.func1(1,8));
        System.out.println(b.func2(1,8));
    }
}

class A {
    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends A {
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
