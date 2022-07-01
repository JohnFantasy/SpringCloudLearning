package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming.threadLocal;

public class ThreadLoaclTest1 {

    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    static void print(String str) {
        System.out.println(str + ":" + localVariable.get());
//        localVariable.remove();
    }

    public static void main(String[] args) {


        Thread threa1 = new Thread(() -> {
            localVariable.set("thread1");
            print("threadOne");
            System.out.println("Thread1 remove after:" + localVariable.get());
        });


        Thread threa2 = new Thread(() -> {
            localVariable.set("thread2");
            print("threadTwo");
            System.out.println("Thread2 remove after:" + localVariable.get());
        });

        threa1.start();
        threa2.start();
    }
}
