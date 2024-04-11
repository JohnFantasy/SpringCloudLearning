package deepintojava;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能：爬取某姐的小视频
 *
 * @author cxd
 */
public class WebSpiderDemo1 {

    public static void main(String[] args) throws Exception {

        String source = "https://www.seselah.com";
        String destDir = "D:/rob/";

        List<String> videoPageUrls = getUrlInSource(source);
//        System.out.println(videoPageUrls);

        System.out.println(videoPageUrls.get(0));

//        String videoPage = HttpUtil.get(videoPageUrls.get(0));
//        System.out.println(videoPage);
        List<String> videos = getUrlInSourceOfVideoUrl(videoPageUrls.get(0));
        System.out.println(videos.get(0));
//        for (String videoPageUrl : videoPageUrls) {
////            System.out.println(videoPageUrl);
//            List<String> videos = getUrlInSourceOfVideoUrl(videoPageUrl);
//            for(String videoUrl : videos){
//                System.out.println(videoUrl);
//            }
////            File destFile = new File(destDir + title + ".mp4");
////            download(url, destFile);
//        }
    }

    /**
     * 通过视频的URL下载该视频并存入本地
     *
     * @param url      视频的URL
     * @param destFile 视频存入的位置
     * @throws IOException
     */
    public static void download(String url, File destFile) throws IOException {
        URL videoUrl = new URL(url);

        InputStream is = videoUrl.openStream();
        FileOutputStream fos = new FileOutputStream(destFile);

        int len = 0;
        byte[] buffer = new byte[1024];
        while ((-1) != (len = is.read(buffer))) {
            fos.write(buffer, 0, len);
        }
        fos.flush();

        if (null != fos) {
            fos.close();
        }

        if (null != is) {
            is.close();
        }
    }

    /**
     * 获取视频的URL地址和视频名称存入hashMap
     *
     * @param source
     * @return
     * @throws IOException
     */
    public static List<String>  getUrlInSource(String source) throws IOException {

        Map<String, String> hashMap = new HashMap<>();
        List<String> videoPageUrls = new ArrayList<>();

        for (int index = 1; index <= 1; index++) { // 页数最大为50，自己玩嘛，就只爬取了一页。
            String pageUrl = source + "/?&sort=2&duration=1&page="+index;
            URL url = new URL(pageUrl);
//            InputStream is = url.openStream();

//			若遇到反爬机制则使用该方法将程序伪装为浏览器进行访问
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("user-agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

//            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

            String info = null;
            String title = null;
            // 此处不要用==null进行判断，因为网页中有很多行都是null，否则会报java.lang.NullPointerException。
            for (int i = 0; i < 10000; i++) {
                info = br.readLine();
//                System.out.println(info);

                if (null != info) {
                    String urlRegex = "<a href=\"\"(.*?\")";

                    if (!info.contains("<a href=") || !info.contains("data-id")) {
                        continue;
//                        title = info;
                    }
                    String videoPageUrl = "https://www.seselah.com/"+info.substring(info.indexOf("<a href=")+9,info.indexOf("data-id")-2);
//                    System.out.println("hhhhhhh-------"+videoPageUrl);
                    videoPageUrls.add(videoPageUrl);

//                    Pattern pattern = Pattern.compile(urlRegex);
//                    Matcher matcher = pattern.matcher(info);
//                    if (matcher.find()) {
//                        for (int j = 0; j <= matcher.groupCount(); j++) {
//                            String tmp = matcher.group(j);
//                            if (!tmp.startsWith("data-mp4=")) {
//                                String videoTitle = getTitle(title.trim());
//                                hashMap.put(videoTitle, tmp);
//                            }
//                        }
//                    }
                }
            }
        }
        return videoPageUrls;
    }

    /**
     * 清洗整理titile字符串，
     *
     * @param info
     * @return
     */
    private static String getTitle(String info) {

        int len = info.length();
        String title = info.substring(12, len - 1);
        return title;
    }

    public static List<String>  getUrlInSourceOfVideoUrl(String source) throws IOException {

        Map<String, String> hashMap = new HashMap<>();
        List<String> videoPageUrls = new ArrayList<>();

        for (int index = 1; index <= 1; index++) { // 页数最大为50，自己玩嘛，就只爬取了一页。
//            String pageUrl = source + "/?&sort=2&duration=1&page="+index;
            URL url = new URL(source);
//            InputStream is = url.openStream();

//			若遇到反爬机制则使用该方法将程序伪装为浏览器进行访问
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("user-agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

//            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

            String info = null;
            String title = null;
            // 此处不要用==null进行判断，因为网页中有很多行都是null，否则会报java.lang.NullPointerException。
            for (int i = 0; i < 10000; i++) {
                info = br.readLine();
//                System.out.println(info);

                if (null != info) {
                    String urlRegex = "<a href=\"\"(.*?\")";

                    if (info.contains("type=\"video/mp4\"")) {
                        System.out.println("hhhhhhh-------"+info);


//                        title = info;
                    }else{
                        continue;
                    }
//                    String videoPageUrl = info.substring(info.indexOf("<source src=")+9,info.indexOf("type=\"video/mp4\"")-2);
//                    System.out.println("hhhhhhh-------"+videoPageUrl);
//                    videoPageUrls.add(videoPageUrl);

//                    Pattern pattern = Pattern.compile(urlRegex);
//                    Matcher matcher = pattern.matcher(info);
//                    if (matcher.find()) {
//                        for (int j = 0; j <= matcher.groupCount(); j++) {
//                            String tmp = matcher.group(j);
//                            if (!tmp.startsWith("data-mp4=")) {
//                                String videoTitle = getTitle(title.trim());
//                                hashMap.put(videoTitle, tmp);
//                            }
//                        }
//                    }
                }
            }
        }
        return videoPageUrls;
    }
}
