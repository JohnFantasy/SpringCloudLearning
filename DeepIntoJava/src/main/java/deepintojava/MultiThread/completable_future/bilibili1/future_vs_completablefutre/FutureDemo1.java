package deepintojava.MultiThread.completable_future.bilibili1.future_vs_completablefutre;

import deepintojava.MultiThread.completable_future.bilibili1.utils.CommonUtils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //读取敏感词 --thread1
        Future<String[]> sensitiveWordsFuture = executorService.submit(() -> {
            String sensitiveWords = CommonUtils.readFile("E:\\Github\\SpringCloudLearning\\DeepIntoJava\\src\\main\\java\\deepintojava\\MultiThread\\completable_future\\bilibili1\\future_vs_completablefutre\\sensitiveWords.txt");
            return sensitiveWords.split(",");
        });
        //读取新闻稿 --thread2
        Future<String> newsFuture = executorService.submit(() -> CommonUtils.readFile("E:\\Github\\SpringCloudLearning\\DeepIntoJava\\src\\main\\java\\deepintojava\\MultiThread\\completable_future\\bilibili1\\future_vs_completablefutre\\news.txt"));

        //替换操作 --thread3
        Future<String> filteredNewsFuture = executorService.submit(() -> {
            String[] sensitiveWords;
            String news;
            try {
                sensitiveWords = sensitiveWordsFuture.get();
                news = newsFuture.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            for (String word : sensitiveWords) {
                if (news.contains(word)) {
                    news = news.replace(word, "**");
                }
            }
            return news;
        });

        //输出  --thread4
        try {
            String filteredNews = filteredNewsFuture.get();
            System.out.println(filteredNews);
            String filteredNewsPath = "E:\\Github\\SpringCloudLearning\\DeepIntoJava\\src\\main\\java\\deepintojava\\MultiThread\\completable_future\\bilibili1\\future_vs_completablefutre\\filteredNews.txt";
            CommonUtils.writeTxtFile(filteredNewsPath, filteredNews);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
