package com.laofaner.javaFoundation.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t38.240.0.142\t233\taes-128-ctr\t12321\t00:07:12\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.118.71\t42984\taes-256-cfb\t47Gl7tFrl730\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.198.126\t27465\taes-256-cfb\tqYW6vbLIURIX\t00:07:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.213.172\t23834\taes-256-cfb\tXLtWZbqGsDpj\t00:07:08\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t54.65.155.40\t18639\taes-256-cfb\tNBDY5fi0js8J\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.92.92\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.74.179\t19270\taes-256-cfb\tN4zFwgkho84B\t00:07:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.117.45\t23731\taes-256-cfb\tz8uMaZeojIte\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t54.92.86.43\t46730\taes-256-cfb\tZIVBwMWdBjWP\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.59.104\t13972\taes-256-cfb\tisx.yt-12976579\t00:07:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.47.186\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t00:07:14\tIN\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.121.90\t43551\taes-256-cfb\tZysvxJEj778W\t00:07:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.219.84\t10910\trc4-md5\t123456\t00:07:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.149.56\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:14\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t46.29.162.124\t1026\trc4-md5\t91vpn.cf\t00:07:12\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.89.20\t30641\taes-256-cfb\tVV79TYEVBqGU\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.112.46.32\t24303\taes-256-cfb\tnzNBUNLZ5xFc\t00:07:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.178.58\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.131.24\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:08\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.234.136\t34180\taes-256-cfb\tZbem3ercN1eY\t00:07:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t103.29.70.219\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t00:07:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.217.183\t19977\taes-256-cfb\tisx.yt-12792715\t00:07:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.193.166\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.239.252\t25933\taes-256-cfb\tTWRkWINN6qdM\t00:07:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.205.148\t35409\taes-256-cfb\tkckT2XKgZpZT\t00:07:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t46.173.215.146\t48888\taes-128-ctr\tt.me/ssrquiz\t00:07:14\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t52.198.243.129\t46974\taes-256-cfb\tKLRp0nabKpiM\t00:07:43\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.86.60\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t23.92.27.200\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t176.58.97.137\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:07\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t5.189.224.159\t993\tchacha20-ietf\tChup@k@br@\t00:07:13\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.62.144\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:08\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.112.34\t35355\taes-256-cfb\tXHAe7NjGB8su\t00:07:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.120.199\t21856\taes-256-cfb\thOlw1Gviuhsc\t00:07:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.201.165\t22069\taes-256-cfb\tPQUmcZ5YN7rS\t00:07:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.6.200\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t00:07:10\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.69\t443\taes-256-cfb\twww.xbvpn.com\t00:07:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.217.74\t17414\taes-256-cfb\tB7Cu8gQOGTw6\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.255.98\t14254\taes-256-cfb\tisx.yt-78192235\t00:07:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.199.186\t2133\taes-256-cfb\tbbaaz\t00:07:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.79.91.64\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.71.82\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:11\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t103.29.70.102\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t00:07:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.234.231\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t00:07:13\tAU";

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
