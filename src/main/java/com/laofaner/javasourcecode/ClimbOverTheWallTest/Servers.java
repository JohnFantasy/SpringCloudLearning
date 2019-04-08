package com.laofaner.javasourcecode.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "4↓/10↑/10↑/10↑\t172.104.217.138\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t22:07:12\tUS\t\n" +
                "7↑/9↑/9↑/9↑\t172.104.215.24\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t22:12:10\tUS\t\n" +
                "4↓/10↑/10↑/10↑\t198.74.58.40\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t22:07:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t109.238.6.24\t9452\taes-256-cfb\trqa30WL4DdAvgIFG6Fs3znzTa\t22:12:16\tFR\t\n" +
                "9↓/10↑/10↑/10↑\t172.104.24.21\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t22:07:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.221.150\t15332\taes-256-cfb\tisx.yt-59801351\t22:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.62.233.234\t8080\trc4-md5\tt.cn/EGJIyrl\t22:12:11\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t46.29.162.52\t1026\trc4-md5\t91vpn.cf\t22:12:16\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.214.146\t15803\taes-256-cfb\tisx.yt-65528356\t22:12:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.76.222.9\t1025\trc4-md5\tYZcCjQ\t22:12:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t104.248.152.162\t16488\taes-256-cfb\tisx.yt-85769451\t22:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t185.173.92.181\t443\trc4-md5\tsssru.icu\t22:12:14\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t173.255.230.159\t11302\taes-256-cfb\tf55.fun-28114209\t22:12:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.49.207\t11686\taes-256-cfb\tf55.fun-23572783\t22:12:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t91.188.223.72\t8080\trc4-md5\thttp://t.cn/EGJIyrl\t22:12:15\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.203.127\t2333\tchacha20\tliangshanbo\t22:12:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.211.238\t17394\taes-256-cfb\tf55.fun-61332422\t22:12:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.233.12\t57206\trc4-md5\tnpmTCK\t22:12:20\tUS\t\n" +
                "6↑/9↑/9↑/8↑\t139.162.185.76\t9140\taes-256-cfb\tlikky1415\t22:12:14\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.109.236\t16294\taes-256-cfb\tssx.re-49249273\t22:12:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t213.183.48.10\t18245\trc4-md5\tss8.pm-66393929\t22:12:05\tRU\t\n" +
                "7↑/9↓/10↑/10↑\t172.104.31.152\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t22:12:14\tUS\t\n" +
                "5↓/10↑/10↑/10↑\t172.104.218.230\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t21:52:13\tUS\t\n" +
                "1↓/9↑/8↑/9↑\t139.162.123.96\t9140\taes-256-cfb\tlikky1415\t22:07:05\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.48.248\t19951\taes-256-cfb\tssx.re-32012772\t22:12:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.33.9\t14258\taes-256-cfb\tf55.fun-84028814\t22:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.51.39\t17343\taes-256-cfb\tf55.fun-55982409\t22:12:06\tSG\t\n" +
                "6↑/10↑/10↑/10↑\t172.104.218.41\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t22:12:14\tUS\t\n" +
                "5↓/10↑/10↑/10↑\t172.104.209.198\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t22:07:14\tUS\t\n" +
                "10↑/10↑/10↑/9↑\t198.255.103.62\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t22:12:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.221.124\t10222\taes-256-cfb\tss8.pm-71123856\t22:12:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.80.198\t15975\taes-256-cfb\tf55.fun-00246123\t22:12:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t162.243.151.85\t12727\taes-256-cfb\tisx.yt-96567464\t22:12:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.168.84\t14793\taes-256-cfb\tisx.yt-77473407\t22:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.167.40\t16776\taes-256-cfb\tssx.re-06109794\t22:12:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.143.68\t15007\taes-256-cfb\tss8.pm-07458525\t22:12:07\tSG";

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
            String password = serverIps[4];
            String method = serverIps[3];
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
