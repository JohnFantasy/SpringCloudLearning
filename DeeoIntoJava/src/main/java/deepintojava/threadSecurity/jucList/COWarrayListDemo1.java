package deepintojava.threadSecurity.jucList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWarrayListDemo1 {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("hello");
        arrayList.add("alibaba");
        arrayList.add("welcome");
        arrayList.add("to");
        arrayList.add("hangzhou");

        Thread threadOne = new Thread(() -> {
            arrayList.set(1, "baba");
            arrayList.remove(2);
            arrayList.remove(3);
        });

        Iterator<String> iterator = arrayList.iterator();

        threadOne.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
