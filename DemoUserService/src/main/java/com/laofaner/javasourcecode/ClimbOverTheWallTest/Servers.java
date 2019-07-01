package com.laofaner.javasourcecode.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t165.22.111.211\t18338\tisx.yt-04748344\taes-256-cfb\t09:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t207.148.111.121\t10\tlncn.org n2\trc4\t09:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.25.148\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t09:12:15\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t216.83.57.224\t2333\tdoub.io\taes-256-cfb\t09:12:18\tHK\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.70\t443\twww.xbvpn.com\taes-256-cfb\t09:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.92.92\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t09:12:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t5.181.5.170\t443\twww.xbvpn.com\taes-256-cfb\t09:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.18\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t09:12:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t194.156.120.129\t6767\tQq676762614\taes-256-cfb\t09:13:04\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t104.167.108.88\t48889\thttp://t.cn/RD0D7sx\taes-128-ctr\t09:12:14\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.42\t443\twww.xbvpn.com\taes-256-cfb\t09:12:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t159.65.135.193\t17546\tisx.yt-73046160\taes-256-cfb\t09:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t123.202.111.60\t4131\t7pZo7Jc3h1\tchacha20\t09:12:15\tHK\t\n" +
                "10↑/10↑/10↑/10↑\t46.173.215.146\t48888\thttp://t.cn/EGJIyrl\taes-128-ctr\t09:12:14\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t103.117.103.179\t41087\tLeung！8848.\taes-256-cfb\t09:12:19\tHK\t\n" +
                "10↑/10↑/10↑/10↑\t114.36.121.73\t4131\t7pZo7Jc3h1\tchacha20\t09:12:14\tTW\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.232.121\t18658\tisx.yt-83202889\taes-256-cfb\t09:12:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t23.244.89.184\t2133\twww.eieee.cn\taes-256-cfb\t09:12:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t46.105.247.176\t2133\twww.eieee.cn\taes-256-cfb\t09:12:13\tNL\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.206.14\t17569\tisx.yt-67200442\taes-256-cfb\t09:12:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.126\t443\twww.xbvpn.com\taes-256-cfb\t09:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t206.189.46.48\t16131\tisx.yt-65268444\taes-256-cfb\t09:12:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t162.243.144.103\t11234\tisx.yt-59459743\taes-256-cfb\t09:12:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t23.225.175.197\t2333\tdoub.io\taes-128-ctr\t09:12:11\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t167.179.78.144\t10\tlncn.org n2\trc4\t09:12:10\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.70.233\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t09:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t219.76.161.216\t4131\t7pZo7Jc3h1\tchacha20\t09:12:13\tHK\t\n" +
                "10↑/10↑/10↑/10↑\t198.255.103.62\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t09:12:11\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t188.119.64.20\t48887\tt.me/SSRSUB\taes-128-ctr\t09:12:15\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t139.180.163.118\t80\tqwert\taes-256-cfb\t09:12:16\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t103.90.224.80\t1025\tYZcCjQ\tchacha20-ietf\t09:12:28\tVN\t";

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
