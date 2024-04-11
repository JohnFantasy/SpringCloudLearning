package deepintojava.MultiThread.completable_future.bilibili1.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;

public class CommonUtils {

    public static String readFile(String path) {
        try {
            List<String> strings = Files.readAllLines(Paths.get(path));
            return String.join("\n", strings);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeTxtFile(String path, String content) {
        try {
            Files.write(Paths.get(path), content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sleepMillis(Long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sleepSeconds(Long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printThreadLog(String message) {
        String result = new StringJoiner("|")
                .add(String.valueOf(System.currentTimeMillis()))
                .add(String.format("%2d", Thread.currentThread().getId()))
                .add(String.valueOf(Thread.currentThread().getName()))
                .add(message)
                .toString();
        System.out.println(result);
    }
}
