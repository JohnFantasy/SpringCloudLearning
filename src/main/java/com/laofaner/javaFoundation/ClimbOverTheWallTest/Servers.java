package com.laofaner.javaFoundation.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t198.199.95.180\t13433\tisx.yt-65423210\taes-256-cfb\t10:42:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.41.165\t12856\tf55.fun-11319807\taes-256-cfb\t10:42:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t206.189.149.132\t10793\tssx.re-45325756\taes-256-cfb\t10:42:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t91.188.223.35\t80\t12345\trc4-md5\t10:42:08\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.209.132\t10767\tisx.yt-20288928\taes-256-cfb\t10:42:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t205.185.123.165\t9999\tt.me/SSRSUB\trc4-md5\t10:42:11\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t159.65.6.120\t13398\tisx.yt-01639509\taes-256-cfb\t10:42:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t54.169.133.81\t443\tbbrc173\tchacha20\t10:42:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t52.221.230.248\t443\tbbrc173\tchacha20\t10:42:08\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.199.224\t15131\tss8.pm-17069625\taes-256-cfb\t10:42:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.84.1.61\t34567\t83411131\taes-256-cfb\t10:42:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t38.100.229.84\t39\tbannedbook.org\taes-256-cfb\t10:42:07\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t92.223.59.42\t57589\tNtya8Q\trc4-md5\t10:42:11\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t34.220.74.172\t443\tbbrc173\tchacha20\t10:42:22\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t13.231.170.111\t26119\tE3nbTDcxCHP3\taes-256-cfb\t10:42:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.88.42.58\t3572\tcht1997...///\trc4-md5\t10:42:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t178.128.53.54\t15516\tss8.pm-62123833\taes-256-cfb\t10:42:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t178.128.53.146\t13715\tisx.yt-97114188\taes-256-cfb\t10:42:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t104.248.173.190\t18934\tss8.pm-37075945\taes-256-cfb\t10:42:04\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t45.63.28.224\t13393\taph8bh\taes-256-cfb\t10:42:09\tAU\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.211.201\t18961\tisx.yt-52372012\taes-256-cfb\t10:42:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t18.179.49.72\t443\tbbrc173\tchacha20\t10:42:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t167.172.192.31\t12572\tssx.re-78207137\taes-256-cfb\t10:42:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t5.34.176.104\t9999\tt.me/SSRSUB\trc4-md5\t10:42:10\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.96.17\t11516\tssx.re-86226766\taes-256-cfb\t10:42:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t114.38.89.115\t3572\tcht1997...///\trc4-md5\t10:42:09\tTW";

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
            String speed = serverIps[0];
            String ip = serverIps[1];
            String port = serverIps[2];
            String password = serverIps[4];
            String method = serverIps[3];
//            if (speed.equals("10↑/10↑/10↑/10↑")) {
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
//            }
        }

    }
}
