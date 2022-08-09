package deepintojava.clawler.gif;


import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class MultiThreadDownload {

    //    private static final String url = "https://cl.5252x.xyz/htm_data/2208/7/5216193.html";
    private static final String basePath = "E:\\SoftwareInsatllers\\gifs\\jpgs\\" + "{}" + "\\";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your url:");
        String url = scanner.next();
        System.out.println("enter the target folder name:");
        String folderName = scanner.next();
        ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("download thread %d").build();
        ThreadPoolExecutor pool =
                new ThreadPoolExecutor(12, 12, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(100), factory, new ThreadPoolExecutor.AbortPolicy());

        CatchImage cm = new CatchImage();
        //获得html文本内容
        String HTML = cm.getHTML(url);
        //获取图片标签
        List<String> imgUrl = cm.getImageUrl(HTML);
        //获取图片src地址
        List<String> imgSrc = cm.getImageSrc(imgUrl);
        System.out.println(imgSrc);

        imgSrc.forEach(item -> {
                    DownloadThread downloadThread = new DownloadThread(url, basePath, item, folderName);
                    pool.submit(downloadThread);
                }
        );
        pool.shutdown();
    }
}

class DownloadThread implements Runnable {

    private String url;

    private String basePath;

    private String imgUrl;

    private String folderName;

    public DownloadThread(String url, String basePath, String imgUrl, String folderName) {
        this.url = url;
        this.basePath = basePath;
        this.imgUrl = imgUrl;
        this.folderName = folderName;
    }

    @SneakyThrows
    @Override
    public void run() {
        DownloadPic downloadPic = new DownloadPic();
        downloadPic.downloadPic(imgUrl, basePath, folderName);
    }
}
