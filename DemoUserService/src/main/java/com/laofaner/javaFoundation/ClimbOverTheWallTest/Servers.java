package com.laofaner.javaFoundation.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t172.105.229.23\t28767\taes-256-cfb\tYtQIumMghM8I\t16:12:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.6.200\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t16:12:09\tCA\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.149.56\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:13\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.234.231\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:12\tAU\t\n" +
                "10↑/10↑/10↑/10↑\t3.113.4.104\t49251\taes-256-cfb\tnHDqOVTXMAje\t16:12:17\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.89.20\t31036\taes-256-cfb\tlmXBVP4jtqjV\t16:12:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.180.175\t34771\taes-256-cfb\tuncPOY4w69QF\t16:12:12\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t167.71.201.26\t17983\taes-256-cfb\tisx.yt-10365774\t16:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.25.148\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:13\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.18\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:09\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t54.248.40.96\t14671\taes-256-cfb\trkgk1L3QFL2I\t16:12:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.178.58\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:10\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t46.173.215.146\t48888\taes-128-ctr\tt.me/ssrquiz\t16:12:13\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t13.115.220.222\t27589\taes-256-cfb\txRgdWwi64elp\t16:12:10\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.198.126\t21674\taes-256-cfb\t5e9KRVCkISnx\t16:12:18\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.114.11\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.8\t443\taes-256-cfb\twww.xbvpn.com\t16:12:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t5.101.49.19\t18573\taes-256-cfb\th4z9hVfhkb0W\t16:12:13\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t23.225.175.197\t2333\taes-128-ctr\tdoub.io\t16:12:09\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t103.29.70.219\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t16:12:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.118.71\t25648\taes-256-cfb\tJG2OxO1ATRgk\t16:12:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t23.239.20.120\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t52.194.229.149\t37259\taes-256-cfb\t8GmvCDkoGKy6\t16:12:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.22\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:10\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.109.104\t14545\taes-256-cfb\tisx.yt-79216084\t16:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t3.113.8.196\t12491\taes-256-cfb\tlWOr1Vu2BNzW\t16:12:20\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.131.24\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:06\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.120.199\t28852\taes-256-cfb\tcvWaW6nrynKb\t16:12:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.199.186\t2133\taes-256-cfb\tbbaaz\t16:12:11\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.92.92\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.77.248\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t52.198.243.129\t47157\taes-256-cfb\tZdEq07sA8yvr\t16:12:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.201.165\t13864\taes-256-cfb\tGu5ouA9cC28j\t16:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.6.191\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t16:12:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.71.82\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:08\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.94.102\t22625\taes-256-cfb\tmgmtxmXU2fX1\t16:12:18\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.180.229\t31304\taes-256-cfb\teh7IM71nvoOv\t16:12:13\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t45.56.89.181\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.255.98\t14644\taes-256-cfb\tisx.yt-87858113\t16:12:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t103.29.70.102\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t16:12:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.112.46.32\t20066\taes-256-cfb\tXGXqbdMh9nEg\t16:12:20\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t23.92.27.200\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.47.186\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t16:12:12\tIN\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.86.60\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.164.200\t32206\taes-256-cfb\t271ed59da9a79a5b7f1dcc8cd7a0e6b2\t16:12:11\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.193.166\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.15.45\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:12\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.188.68\t38323\taes-256-cfb\tRq8JOweVvqRn\t16:12:12\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t54.65.155.40\t9756\taes-256-cfb\tMTGEthl5xG3x\t16:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.152.149\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:07\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t54.199.175.227\t18589\taes-256-cfb\tiU806H2pe4jo\t16:12:10\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t134.209.188.44\t39727\taes-256-cfb\tZ6BCZKEVz6zQ\t16:12:13\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.70.233\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.192.135\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.56.80.191\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t16:12:16\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.217.183\t31449\taes-256-cfb\t6fkElPXRCjMn\t16:12:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t13.231.195.104\t24560\taes-256-cfb\tZhX3sgM9ZNtk\t16:12:14\tJP\t";

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
