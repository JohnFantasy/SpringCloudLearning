package com.laofaner.javasourcecode.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t149.28.176.168\t5678\twww.sphard.com\taes-256-cfb\t08:57:14\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t27.122.57.73\t80\t112233\tchacha20\t08:57:18\tCN\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.211.238\t17521\tf55.fun-71226377\taes-256-cfb\t08:57:04\tUS\t\n" +
                "8↑/9↑/9↑/9↑\t198.199.109.236\t14804\tssx.re-44124344\taes-256-cfb\t08:57:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t173.193.85.131\t30587\tjaz\taes-256-cfb\t08:57:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.209.198\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.62.233.234\t8080\tt.cn/EGJIyrl\trc4-md5\t08:57:12\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t147.135.118.155\t80\t2546\tchacha20\t08:57:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.51.39\t15410\tf55.fun-01775973\taes-256-cfb\t08:57:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.76.191.52\t3344\twww.darrenliuwei.com\taes-256-cfb\t08:57:16\tAU\t\n" +
                "10↑/10↑/10↑/10↑\t103.129.197.228\t999\tlcshare\taes-256-cfb\t08:57:12\tCN\t\n" +
                "9↑/9↑/9↑/9↑\t46.17.43.2\t22100\twGQ4vA7D\taes-256-gcm\t08:57:10\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.215.24\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:11\tUS\t\n" +
                "9↑/10↑/10↑/7↓\t185.173.92.181\t443\tsssru.icu\trc4-md5\t08:57:17\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.80.198\t15121\tf55.fun-48185620\taes-256-cfb\t08:57:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t198.255.103.62\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t08:57:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.217.138\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.49.207\t15276\tf55.fun-06892021\taes-256-cfb\t08:57:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t68.183.237.182\t14572\tisx.yt-94196593\taes-256-cfb\t08:57:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.203.127\t2333\tliangshanbo\tchacha20\t08:57:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.97.51\t14603\tisx.yt-44064347\taes-256-cfb\t08:57:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.143.68\t11000\tss8.pm-40482741\taes-256-cfb\t08:57:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.18.60\t6688\twww.darrenliuwei.com\taes-256-cfb\t08:57:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t173.255.230.159\t16813\tf55.fun-02691027\taes-256-cfb\t08:57:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.218.230\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t46.29.162.52\t1026\t91vpn.cf\trc4-md5\t08:57:16\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.218.41\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:15\tUS\t\n" +
                "9↑/10↑/10↑/10↑\t198.74.58.40\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t162.243.147.10\t14638\tisx.yt-37394875\taes-256-cfb\t08:57:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.46.121\t18532\tf55.fun-73091809\taes-256-cfb\t08:57:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.31.152\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t104.248.152.162\t16131\tisx.yt-60394237\taes-256-cfb\t08:57:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.221.124\t12954\tss8.pm-22766705\taes-256-cfb\t08:57:05\tUS\t\n" +
                "10↑/10↑/10↑/8↑\t109.238.6.24\t9452\trqa30WL4DdAvgIFG6Fs3znzTa\taes-256-cfb\t08:57:16\tFR\t\n" +
                "8↑/9↑/9↑/9↑\t128.199.167.40\t19378\tssx.re-36335302\taes-256-cfb\t08:57:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.24.21\t443\t9d6cceaa373bf2c8acb22e60b6a58be6\taes-256-cfb\t08:57:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t13.125.224.213\t47669\tapext2019001\tchacha20\t08:57:16\tKR\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.168.84\t16432\tisx.yt-18327519\taes-256-cfb\t08:57:05\tSG\t\n" +
                "8↑/9↑/9↑/9↑\t134.209.48.248\t18633\tssx.re-45565210\taes-256-cfb\t08:57:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t162.243.134.30\t14686\tisx.yt-90190160\taes-256-cfb\t08:57:04\tUS\t\n" +
                "8↑/9↑/9↑/9↑\t213.183.48.10\t18298\tss8.pm-79052451\trc4-md5\t08:57:05\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t91.188.223.72\t8080\thttp://t.cn/EGJIyrl\trc4-md5\t08:57:17\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t103.102.160.252\t1234\t1234\trc4-md5\t08:57:19\tJP";

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
