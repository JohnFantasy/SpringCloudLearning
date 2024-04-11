package deepintojava.MultiThread.completable_future.bilibili1.future_vs_completablefutre;

import deepintojava.MultiThread.completable_future.bilibili1.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CompletableFuture<String[]> completableFuture = CompletableFuture.supplyAsync(() -> {
            String sensitiveWords = CommonUtils.readFile("E:\\Github\\SpringCloudLearning\\DeepIntoJava\\src\\main\\java\\deepintojava\\MultiThread\\completable_future\\bilibili1\\future_vs_completablefutre\\sensitiveWords.txt");
            return sensitiveWords.split(",");
        }, executorService);
        try {
            String[] strings = completableFuture.get();
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
