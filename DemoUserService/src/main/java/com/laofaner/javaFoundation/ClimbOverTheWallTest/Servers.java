package com.laofaner.javaFoundation.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t172.105.198.126\t27745\tB4D7TBVGZ49o\taes-256-cfb\t15:02:18\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t54.248.40.96\t46070\tXcVfbiNiUfF7\taes-256-cfb\t15:02:05\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.38.42\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.13\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.71.82\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:10\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t213.52.128.192\t32206\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\taes-256-cfb\t15:02:11\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t103.29.70.219\t32206\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\taes-256-cfb\t15:02:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t5.101.49.19\t18573\th4z9hVfhkb0W\taes-256-cfb\t15:02:12\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.86.60\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.115.99\t18619\tf55.fun-07429550\taes-256-cfb\t15:02:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t23.225.175.197\t2333\tdoub.io\taes-128-ctr\t15:02:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.180.175\t42047\tVVVzgSQ3CVZ2\taes-256-cfb\t15:02:12\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.199.186\t2133\tbbaaz\taes-256-cfb\t15:02:11\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.201.165\t30939\tAJhuPRhJSxGa\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t178.79.147.199\t32206\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\taes-256-cfb\t15:02:08\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.89.20\t17973\tqybtUKY1NS7c\taes-256-cfb\t15:02:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t13.231.195.104\t14054\ttkC0V4U6IwQ1\taes-256-cfb\t15:02:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t54.92.86.43\t19343\to2jYLGJtwrf6\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.180.224\t9265\trK0S2uL5RIdE\taes-256-cfb\t15:02:14\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t23.92.27.200\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.22\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t23.239.20.120\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.178.58\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.120.199\t15468\tVO47g7IuAA2U\taes-256-cfb\t15:02:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.74.19\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.112.254\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:15\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t178.79.186.42\t32206\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\taes-256-cfb\t15:02:10\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.149.56\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:12\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.215.95\t12977\tssx.re-38150777\taes-256-cfb\t15:02:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.59.37\t17228\tf55.fun-55628319\taes-256-cfb\t15:02:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t54.65.155.40\t41018\tF6ysVrAGFc7m\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.61.44\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:18\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t167.71.219.77\t13874\tssx.re-00668489\taes-256-cfb\t15:02:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.77.248\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:08\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.112.249.231\t46307\tAmFszHdQKn0r\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.108.170\t11731\tisx.yt-70258609\taes-256-cfb\t15:02:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.118.71\t21981\tX826fPTzApnY\taes-256-cfb\t15:02:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.217.183\t36074\t55UAXYempypa\taes-256-cfb\t15:02:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.112.34\t19585\tmi6iTSIl0lLi\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t52.194.230.113\t25332\tTfT2VjtZhuvF\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.18\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.92.92\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.67.40\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:10\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.193.166\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t178.79.177.152\t32206\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\taes-256-cfb\t15:02:11\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t3.113.4.104\t43987\tLfPhgR7PVgjD\taes-256-cfb\t15:02:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t54.199.175.227\t20295\tHgjT6Q7bhVoU\taes-256-cfb\t15:02:06\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.236.79\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:10\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t97.107.142.183\t13114\tf55.fun-69706184\taes-256-cfb\t15:02:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.224.199\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.70.233\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.48.44\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:10\tAU\t\n" +
                "10↑/10↑/10↑/10↑\t18.179.7.182\t23981\tFr2biqbGpAvF\taes-256-cfb\t15:02:23\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t167.71.198.193\t15695\tisx.yt-06637161\taes-256-cfb\t15:02:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.192.135\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.114.11\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:13\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t54.65.244.39\t42584\t3dfQSA5LyrzV\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.188.68\t13485\t5PXzKa1blU0V\taes-256-cfb\t15:02:12\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t3.113.8.196\t30258\t9LY46CDokRH3\taes-256-cfb\t15:02:17\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.56.89.181\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:11\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.205.148\t32241\tEkX7lzjsciom\taes-256-cfb\t15:02:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.152.149\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:05\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.15.45\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.229.23\t13992\tFwQMXRJXWbbI\taes-256-cfb\t15:02:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.174.7\t11805\tisx.yt-51733240\taes-256-cfb\t15:02:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.131.24\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:05\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.94.102\t27135\tlK5MheBuO6Sc\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t88.80.187.117\t32206\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\taes-256-cfb\t15:02:11\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.62.144\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t13.115.220.222\t28964\tPFeCz1Ds5hwz\taes-256-cfb\t15:02:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t85.159.208.194\t32206\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\taes-256-cfb\t15:02:10\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.234.231\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:11\tAU\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.180.229\t31304\teh7IM71nvoOv\taes-256-cfb\t15:02:13\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t176.58.97.137\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:07\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t45.79.91.64\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t46.101.38.131\t11333\tss8.pm-50687273\taes-256-cfb\t15:02:04\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.108.176\t17464\tss8.pm-53978439\taes-256-cfb\t15:02:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.56.83.105\t8099\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t15:02:06\tUS";

        String json = "    {\n" +
                "      \"server\": \"45.77.254.220\",\n" +
                "      \"server_port\": 5678,\n" +
                "      \"password\": \"www.darrenliuwei.com\",\n" +
                "      \"method\": \"aes-256-cfb\",\n" +
                "      \"plugin\": \"\",\n" +
                "      \"plugin_opts\": \"\",\n" +
                "      \"plugin_args\": \"\",\n" +
                "      \"remarks\": \"\",\n" +
                "      \"timeout\": 5\n" +
                "    },";
        String[] servers = serversStr.split("\n");
        System.out.println(servers.length);
        for (String server : servers) {
            String[] serverIps = server.split("\t");
//            for (int i = 0; i < serverIps.length; i++) {
//                System.out.println("第" + i + "个元素为" + serverIps[i]);
//            }
            String speed = serverIps[0];
            String ip = serverIps[1];
            String port = serverIps[2];
            String password = serverIps[3];
            String method = serverIps[4];
            if (speed.equals("10↑/10↑/10↑/10↑")) {
                System.out.println("    {\n" +
                        "      \"server\": \"" + ip + "\",\n" +
                        "      \"server_port\": " + port + ",\n" +
                        "      \"password\": \"" + password + "\",\n" +
                        "      \"method\": \"" + method + "\",\n" +
                        "      \"plugin\": \"\",\n" +
                        "      \"plugin_opts\": \"\",\n" +
                        "      \"plugin_args\": \"\",\n" +
                        "      \"remarks\": \"\",\n" +
                        "      \"timeout\": 5\n" +
                        "    },");
            }
        }

    }
}
