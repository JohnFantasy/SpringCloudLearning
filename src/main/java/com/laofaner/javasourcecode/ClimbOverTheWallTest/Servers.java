package com.laofaner.javasourcecode.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t205.185.113.67\t12345\t12345678\taes-256-cfb\t14:07:11\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.109.236\t14964\tssx.re-65510854\taes-256-cfb\t14:07:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t23.106.140.227\t443\tNgLF7wKB\taes-256-cfb\t14:07:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t109.238.6.24\t9452\trqa30WL4DdAvgIFG6Fs3znzTa\taes-256-cfb\t14:07:16\tFR\t\n" +
                "10↑/10↑/10↑/10↑\t45.76.222.9\t1025\tYZcCjQ\trc4-md5\t14:07:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t92.118.47.112\t2333\tqzjmdl2333\taes-256-cfb\t14:07:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t13.114.40.186\t36777\tuser_0731\tchacha20\t14:07:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.118.133.253\t11361\tf55.fun-97816006\taes-256-cfb\t14:07:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t104.167.101.49\t543\thttp://t.cn/RD0D7sx\trc4-md5\t14:07:15\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t45.76.80.221\t443\tVOSCa1ZG\taes-256-cfb\t14:07:11\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t13.251.45.40\t36777\tuser_0731\tchacha20\t14:07:13\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t149.248.63.114\t36777\tuser_0731\tchacha20\t14:07:05\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.48.248\t16159\tssx.re-52104244\taes-256-cfb\t14:07:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t173.255.230.159\t13683\tf55.fun-82585503\taes-256-cfb\t14:07:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.211.238\t18156\tf55.fun-38108327\taes-256-cfb\t14:07:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t157.230.140.151\t36777\tuser_0731\tchacha20\t14:07:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.187.62\t17016\tssx.re-64471350\taes-256-cfb\t14:07:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t213.183.48.10\t11358\tss8.pm-34538443\trc4-md5\t14:07:05\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.233.12\t57206\tnpmTCK\trc4-md5\t14:07:18\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.95.241\t17419\tss8.pm-54935798\taes-256-cfb\t14:07:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t157.230.138.250\t36777\tuser_0731\tchacha20\t14:07:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.221.124\t19642\tss8.pm-72274764\taes-256-cfb\t14:07:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.80.198\t17985\tf55.fun-50654454\taes-256-cfb\t14:07:04\tUS";

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
