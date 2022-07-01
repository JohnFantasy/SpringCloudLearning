package deepintojava.threadSecurity.theBeautyOfJavaConcurrentPrograming.volitil;

/**
 * volatile解决内存可见性问题demo
 */
public class VolatileDemo1 {


}

class ThreadNoSafeInteger{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class ThreadSafeInteger{
    private volatile int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class ThreadSafeIntegerDemo{
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}


