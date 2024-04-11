package deepintojava.MultiThread.exchanger;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExchangerTest02 {

    public static ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        Exchanger<List<String>> exchanger = new Exchanger<>();
        Producer producer = new Producer(exchanger);
        Consumer consumer = new Consumer(exchanger);
        threadPool.execute(producer);
        threadPool.execute(consumer);
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadPool.shutdownNow();
    }
}

class Producer implements Runnable {

    private List<String> data = new ArrayList<>();
    private Exchanger<List<String>> exchanger;

    private void putData() {
        for (int i = 0; i < 3; i++) {
            data.add(String.format("String %d", i));
        }
    }

    public Producer(Exchanger<List<String>> exchanger) {
        this.exchanger = exchanger;
    }

    @SneakyThrows
    @Override
    public void run() {
        if (!Thread.interrupted()) {
            if (data.size() < 1) {
                putData();
            }
            data = exchanger.exchange(data);
        }
    }
}

class Consumer implements Runnable {

    private List<String> data = new ArrayList<>();
    private Exchanger<List<String>> exchanger;

    private void getAndPrintData() {
        data.forEach(System.out::println);
    }

    public Consumer(Exchanger<List<String>> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (data.size() == 0) {
                try {
                    data = exchanger.exchange(data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            getAndPrintData();
        }
    }
}