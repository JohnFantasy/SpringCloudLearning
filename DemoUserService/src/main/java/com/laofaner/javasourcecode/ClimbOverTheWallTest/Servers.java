package com.laofaner.javasourcecode.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t172.105.213.201\t10456\taes-256-cfb\tfafajofdsgc\t21:37:06\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t173.255.230.159\t16385\taes-256-cfb\tf55.fun-70832860\t21:37:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t185.243.57.221\t80\trc4-md5\tt.me/SSRSUB\t21:37:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.32.152\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t21:37:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.221.124\t10336\taes-256-cfb\tss8.pm-86449834\t21:37:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t54.255.247.167\t37726\taes-256-cfb\tC6BGgGoQknpR\t21:37:25\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t13.209.17.146\t80\taes-128-ctr\txiao\t21:37:11\tKR\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.187.62\t10519\taes-256-cfb\tssx.re-63316244\t21:37:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.80.198\t15997\taes-256-cfb\tf55.fun-40352028\t21:37:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.45.169\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t21:37:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.56.89.49\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t21:37:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.123.158\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t21:37:17\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.217.127\t14541\taes-256-cfb\tTPOYVGxKglpi\t21:37:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.76.222.9\t1025\trc4-md5\tYZcCjQ\t21:37:41\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t66.175.223.22\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t21:37:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.188.241\t19411\taes-256-cfb\tf55.fun-76602072\t21:37:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.254.31\t12652\taes-256-cfb\tss8.pm-33269466\t21:37:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.37.161\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t21:37:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t3.1.80.143\t80\taes-128-ctr\txiao\t21:37:08\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.58.222\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t21:37:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.110.189\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t21:37:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.56.73\t15260\taes-256-cfb\tf55.fun-64104240\t21:37:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.1.34\t15913\taes-256-cfb\tf55.fun-98475083\t21:37:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.48.248\t16491\taes-256-cfb\tssx.re-66511103\t21:37:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t213.183.48.10\t13004\trc4-md5\tss8.pm-11026841\t21:37:06\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.115.215\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t21:37:17\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.0.249.3\t80\taes-128-ctr\txiao\t21:37:16\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.226.191\t12476\taes-256-cfb\tssx.re-41276871\t21:37:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.48.155\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t21:37:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t13.209.97.133\t80\taes-128-ctr\txiao\t21:37:16\tKR\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.69.91\t17302\taes-256-cfb\tf55.fun-85071251\t21:37:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.39.134\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t21:37:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.175.103\t2019\taes-128-ctr\tdoub.io\t21:37:13\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.105.253\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t21:37:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.50.150\t443\taes-256-cfb\t9d6cceaa373bf2c8acb22e60b6a58be6\t21:37:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t185.173.94.244\t2333\taes-128-ctr\tdoub.io\t21:37:24\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t91.188.223.72\t8080\trc4-md5\thttp://t.cn/EGJIyrl\t21:37:16\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t46.29.162.46\t1026\trc4-md5\t91vpn.cf\t21:37:13\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t104.167.97.164\t543\trc4-md5\thttp://t.cn/RD0D7sx\t21:37:21\tCA\t";

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
