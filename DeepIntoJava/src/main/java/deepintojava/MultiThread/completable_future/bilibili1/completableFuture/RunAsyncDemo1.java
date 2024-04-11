package deepintojava.MultiThread.completable_future.bilibili1.completableFuture;

import deepintojava.MultiThread.completable_future.bilibili1.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;

public class RunAsyncDemo1 {
    public static void main(String[] args) {
        CommonUtils.printThreadLog("main starts");
        CompletableFuture.runAsync(() -> {
            CommonUtils.printThreadLog("reading file starts---");
            String s = CommonUtils.readFile("E:\\Github\\SpringCloudLearning\\DeepIntoJava\\src\\main\\java\\deepintojava\\MultiThread\\completable_future\\bilibili1\\future_vs_completablefutre\\filteredNews.txt");
            System.out.println(s);
            CommonUtils.sleepSeconds(2L);
            CommonUtils.printThreadLog("reading file ends---");
        });
        CommonUtils.printThreadLog("here are not blocked, main continues");
        CommonUtils.sleepSeconds(4L);
        CommonUtils.printThreadLog("main ends");
    }
}
