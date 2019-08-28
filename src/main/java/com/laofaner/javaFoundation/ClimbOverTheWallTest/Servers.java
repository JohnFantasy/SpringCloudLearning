package com.laofaner.javaFoundation.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t139.162.112.34\t35355\taes-256-cfb\tXHAe7NjGB8su\t14:47:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.213.172\t30258\taes-256-cfb\tdP014mYX6Sbh\t14:47:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.201.165\t41354\taes-256-cfb\tSTA0Zv2HJhud\t14:47:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.102.56\t36186\taes-256-cfb\tWcEkhysgjDvu\t14:47:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.33.59.129\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t52.194.230.113\t14157\taes-256-cfb\tGsEQgQpvKN36\t14:47:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.118.71\t42984\taes-256-cfb\t47Gl7tFrl730\t14:47:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.149.56\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:13\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t13.231.195.104\t21816\taes-256-cfb\tD4pzaqXMenNS\t14:47:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.113.4.104\t24192\taes-256-cfb\tgWNGgrIwSgUq\t14:47:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.193.166\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t23.239.20.120\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.120.199\t21856\taes-256-cfb\thOlw1Gviuhsc\t14:47:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.217.183\t9295\taes-256-cfb\tH7oyKSPn6gZT\t14:47:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.74.179\t31662\taes-256-cfb\t3fxOeWftrEX4\t14:47:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.215.166\t11297\taes-256-cfb\tssx.re-17759148\t14:47:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.234.231\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:13\tAU\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.107.69\t15424\taes-256-cfb\tss8.pm-86153041\t14:47:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.198.126\t45635\taes-256-cfb\tEbHpYPoqmwDQ\t14:47:21\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.71.82\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:10\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t54.199.175.227\t41262\taes-256-cfb\thMh2rV6UIyoX\t14:47:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t97.107.142.183\t14260\taes-256-cfb\tf55.fun-23673893\t14:47:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.131.24\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:06\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.69\t443\taes-256-cfb\twww.xbvpn.com\t14:47:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.117.113\t42811\taes-256-cfb\tuuVr1NkUADNn\t14:47:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.22\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t5.101.49.19\t18573\taes-256-cfb\th4z9hVfhkb0W\t14:47:13\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.255.98\t12921\taes-256-cfb\tisx.yt-06640551\t14:47:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.178.58\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.79.91.64\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.152.149\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:06\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.47.67\t19308\taes-256-cfb\tf55.fun-36156550\t14:47:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.15.45\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.205.148\t20811\taes-256-cfb\ttk0DG8obD9Ks\t14:47:10\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.199.186\t2133\taes-256-cfb\tbbaaz\t14:47:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.92.92\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.117.45\t32786\taes-256-cfb\t2kcDsOgaFtQ3\t14:47:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.234.136\t22309\taes-256-cfb\tIbGIgycmJPZV\t14:47:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t23.92.27.200\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t167.71.125.213\t13470\taes-256-cfb\tssx.re-50149045\t14:47:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.56.89.181\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.94.102\t46076\taes-256-cfb\tmMQD5pgsHYik\t14:47:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.164.200\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t14:47:12\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t176.58.97.137\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:06\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.217.183\t11644\taes-256-cfb\tisx.yt-02848692\t14:47:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t103.29.70.219\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t14:47:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.217.74\t45824\taes-256-cfb\tasaU19XOse3u\t14:47:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.113.8.196\t16013\taes-256-cfb\tZ2xL1tAjOUql\t14:47:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.47.186\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t14:47:12\tIN\t\n" +
                "10↑/10↑/10↑/10↑\t103.29.70.102\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t14:47:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t167.71.201.26\t13185\taes-256-cfb\tisx.yt-84101783\t14:47:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.89.20\t43857\taes-256-cfb\tYS67IH4REcS2\t14:47:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.86.60\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.62.144\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:09\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t52.198.243.129\t34375\taes-256-cfb\t9tt8vh9CBVc9\t14:47:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.194.153\t33594\taes-256-cfb\thXVh7fTLJ905\t14:47:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t206.189.115.147\t18942\taes-256-cfb\tss8.pm-43549090\t14:47:05\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.70.233\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:08\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.18\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t14:47:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.59.104\t10842\taes-256-cfb\tisx.yt-74954181\t14:47:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t13.115.199.68\t35190\taes-256-cfb\tLNJwNE8ykyAE\t14:47:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.121.90\t48959\taes-256-cfb\tHNr4nRhh3vk6\t14:47:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.85.200\t17314\taes-256-cfb\tqp7N9wvP5Uny\t14:47:08\tJP\t\n";

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
//             }
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
