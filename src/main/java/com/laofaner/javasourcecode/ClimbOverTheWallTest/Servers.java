package com.laofaner.javasourcecode.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t104.248.152.162\t17110\tisx.yt-58701145\taes-256-cfb\t08:57:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t46.17.43.2\t22100\twGQ4vA7D\taes-256-gcm\t08:57:11\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.46.121\t18680\tf55.fun-45913685\taes-256-cfb\t08:57:06\tSG\t\n" +
                "10↑/10↑/10↑/9↑\t139.162.185.76\t9140\tlikky1415\taes-256-cfb\t08:57:14\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.31.152\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:14\tUS\t\n" +
                "10↑/10↑/10↑/9↑\t128.199.221.150\t13560\tisx.yt-33760671\taes-256-cfb\t08:57:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t109.238.6.24\t9452\trqa30WL4DdAvgIFG6Fs3znzTa\taes-256-cfb\t08:57:16\tFR\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.203.127\t2333\tliangshanbo\tchacha20\t08:57:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.233.12\t57206\tnpmTCK\trc4-md5\t08:57:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.217.138\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:13\tUS\t" +
                "10↑/10↑/10↑/10↑\t139.162.51.39\t10238\tf55.fun-67101162\taes-256-cfb\t08:57:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.218.41\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:15\tUS\t\n" +
                "7↑/10↑/10↑/10↑\t139.162.123.96\t9140\tlikky1415\taes-256-cfb\t08:57:05\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t198.74.58.40\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.62.233.234\t8080\tt.cn/EGJIyrl\trc4-md5\t08:57:11\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t198.255.103.62\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t08:57:12\tUS\t\n" +
                "8↑/8↑/8↑/8↑\t45.33.80.198\t10472\tf55.fun-86726551\taes-256-cfb\t08:57:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.97.51\t13559\tisx.yt-44394689\taes-256-cfb\t08:57:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.76.162.14\t333\tssrfree.tk\trc4\t08:57:16\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.168.84\t19504\tisx.yt-41592631\taes-256-cfb\t08:57:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.143.68\t14484\tss8.pm-93895061\taes-256-cfb\t08:57:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.209.198\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.215.24\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t162.243.151.85\t19215\tisx.yt-09944441\taes-256-cfb\t08:57:04\tUS\t\n" +
                "10↑/10↑/10↑/8↑\t172.104.218.230\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:15\tUS\t\n" +
                "8↑/8↑/8↑/8↑\t172.104.211.238\t14878\tf55.fun-61310549\taes-256-cfb\t08:57:04\tUS\t\n" +
                "8↑/8↑/8↑/8↑\t198.199.109.236\t10978\tssx.re-46778181\taes-256-cfb\t08:57:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t91.188.223.72\t8080\thttp://t.cn/EGJIyrl\trc4-md5\t08:57:16\tRU\t\n" +
                "10↑/10↑/10↑/9↑\t185.173.92.181\t443\tsssru.icu\trc4-md5\t08:57:28\tRU";

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
        for(String server : servers){
            String[] serverIps = server.split("\t");
//            for(int i =0;i<serverIps.length;i++){
//                System.out.println("第"+i+"个元素为"+serverIps[i]);
//            }
            String ip = serverIps[1];
            String port = serverIps[2];
            String password = serverIps[3];
            String method = serverIps[4];
            System.out.println("    {\n" +
                    "      \"server\": \""+ip+"\",\n" +
                    "      \"server_port\": "+port+",\n" +
                    "      \"password\": \""+password+"\",\n" +
                    "      \"method\": \""+method+"\",\n" +
                    "      \"plugin\": \"\",\n" +
                    "      \"plugin_opts\": \"\",\n" +
                    "      \"plugin_args\": \"\",\n" +
                    "      \"remarks\": \"\",\n" +
                    "      \"timeout\": 5\n" +
                    "    },");

        }
    }
}
