package com.laofaner.javasourcecode.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t172.105.203.127\t2333\tchacha20\tliangshanbo\t10:37:11\tJP\t\n" +
                "6↑/10↑/10↑/10↑\t172.104.218.41\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t10:37:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.49.207\t11194\taes-256-cfb\tf55.fun-87849957\t10:37:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.62.233.234\t8080\trc4-md5\tt.cn/EGJIyrl\t10:37:11\tCA\t\n" +
                "9↓/10↑/10↑/9↑\t172.104.31.152\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t10:32:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.108.194\t21943\taes-256-cfb\tLFaD86SBq2lY\t10:37:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.211.238\t12229\taes-256-cfb\tf55.fun-52020362\t10:37:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t139.59.70.64\t34696\tchacha20\tzjOusn\t10:37:17\tIN\t\n" +
                "10↑/10↑/10↑/10↑\t139.59.0.7\t34696\tchacha20\tzjOusn\t10:37:16\tIN\t\n" +
                "10↑/10↑/10↑/10↑\t178.128.108.168\t15586\taes-256-cfb\tss8.pm-12681004\t10:37:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.214.146\t19350\taes-256-cfb\tisx.yt-56203261\t10:37:05\tUS\t\n" +
                "9↑/9↑/10↑/10↑\t172.104.24.21\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t10:37:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.167.40\t13904\taes-256-cfb\tssx.re-52335495\t10:37:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t173.255.230.159\t16648\taes-256-cfb\tf55.fun-92736246\t10:37:04\tUS\t\n" +
                "7↓/10↑/10↑/10↑\t139.162.185.76\t9140\taes-256-cfb\tlikky1415\t10:32:13\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t162.243.151.85\t19347\taes-256-cfb\tisx.yt-39444935\t10:37:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t50.116.4.203\t21035\taes-256-cfb\twPaU6jde4NZT\t10:37:05\tUS\t\n" +
                "3↑/5↑/4↓/5↑\t155.138.225.144\t45135\trc4-md5\tKSS18l\t10:37:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t178.128.106.9\t46152\taes-256-cfb\tsfVGsT4OMxHC\t10:37:15\tSG\t\n" +
                "7↓/10↑/10↑/10↑\t172.104.218.230\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t10:32:16\tUS\t\n" +
                "6↓/10↑/10↑/10↑\t139.162.123.96\t9140\taes-256-cfb\tlikky1415\t10:32:05\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.173.36\t19121\taes-256-cfb\tf55.fun-05780553\t10:37:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.109.236\t10500\taes-256-cfb\tssx.re-69798607\t10:37:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t198.255.103.62\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t10:37:11\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.76.222.9\t1025\trc4-md5\tYZcCjQ\t10:37:18\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.221.124\t19498\taes-256-cfb\tss8.pm-30379392\t10:37:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t68.183.38.80\t45894\taes-256-cfb\tfW5GPC82Z97G\t10:37:10\tGB\t\n" +
                "8↓/10↑/10↑/10↑\t172.104.215.24\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t10:32:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t109.238.6.24\t9452\taes-256-cfb\trqa30WL4DdAvgIFG6Fs3znzTa\t10:37:16\tFR\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.48.248\t12129\taes-256-cfb\tssx.re-73822117\t10:37:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.233.12\t57206\trc4-md5\tnpmTCK\t10:37:15\tUS\t\n" +
                "7↑/10↑/10↑/9↑\t198.74.58.40\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t10:37:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.51.39\t18679\taes-256-cfb\tf55.fun-07457025\t10:37:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t213.183.48.10\t10845\trc4-md5\tss8.pm-94375071\t10:37:05\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t185.173.92.181\t443\trc4-md5\tsssru.icu\t10:37:14\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.209.198\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t10:37:15\tUS\t\n" +
                "6↑/10↑/10↑/10↑\t172.104.217.138\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t10:37:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t91.188.223.72\t8080\trc4-md5\thttp://t.cn/EGJIyrl\t10:37:15\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.80.198\t16273\taes-256-cfb\tf55.fun-58920091\t10:37:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t142.93.32.82\t15310\taes-256-cfb\tyEyceR8X2EVd\t10:37:05\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.231.130\t30248\taes-256-cfb\tZz5H1nlGGKHx\t10:37:16\tJP";

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
                        "      \"password\": \"" + method + "\",\n" +
                        "      \"method\": \"" + password + "\",\n" +
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
