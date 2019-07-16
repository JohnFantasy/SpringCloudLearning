package com.laofaner.javasourcecode.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "V/T/U/M\tAddress\tPort\tPassword\tMethod\t\t\t\n" +
                "10↑/10↑/10↑/10↑\t45.79.91.64\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t198.255.103.62\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.70\t443\twww.xbvpn.com\taes-256-cfb\t10:42:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.117.57\t17278\tss8.pm-92170916\taes-256-cfb\t10:42:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t104.237.139.138\t30073\tVuegPWzbc9vR\taes-256-cfb\t10:42:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t193.110.203.217\t41087\tLeung！8848.\taes-256-cfb\t10:42:21\tHK\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.113.18\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:18\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.70.233\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:17\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t23.92.22.120\t11610\tf55.fun-98747184\taes-256-cfb\t10:42:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t52.199.152.115\t31919\tfuhQLRvdwLPa\taes-256-cfb\t10:42:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t103.29.70.67\t21073\tjPo3pkwzcMna\taes-256-cfb\t10:42:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.79.79.207\t15903\ty14LYUcqafoY\taes-256-cfb\t10:42:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.84.243\t13715\tT2ld7C6KFLog\taes-256-cfb\t10:42:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.206.14\t19011\tisx.yt-20891381\taes-256-cfb\t10:42:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.117.27\t30361\tPbvNPG0bypRA\taes-256-cfb\t10:42:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t5.101.49.19\t11841\tNsG9q7334w58\taes-256-cfb\t10:42:16\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.76.77\t21212\tZQQH9woMF00H\taes-256-cfb\t10:42:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.126\t443\twww.xbvpn.com\taes-256-cfb\t10:42:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t46.17.45.105\t45671\tpennygoget\taes-256-cfb\t10:42:15\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t5.181.5.170\t443\twww.xbvpn.com\taes-256-cfb\t10:42:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t142.91.170.107\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:12\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.79.94.17\t20156\teJ2hl4GXWsfb\taes-256-cfb\t10:42:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t45.79.107.223\t18185\tsJpoCnPS7dIf\taes-256-cfb\t10:42:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t59.115.97.146\t45377\tvideo.gh\trc4-md5\t10:42:15\tTW\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.92.92\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.1.198\t12279\tf55.fun-30983340\taes-256-cfb\t10:42:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t103.90.224.80\t1025\tYZcCjQ\tchacha20-ietf\t10:42:26\tVN\t\n" +
                "10↑/10↑/10↑/10↑\t23.225.175.197\t2333\tdoub.io\taes-128-ctr\t10:42:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t46.29.162.124\t1026\t91vpn.cf\trc4-md5\t10:42:13\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t206.189.46.48\t13566\tisx.yt-48572633\taes-256-cfb\t10:42:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.25.148\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:14\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.108.176\t14035\tss8.pm-76288425\taes-256-cfb\t10:42:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.106.149\t22173\tTi3cHqWhNAdp\taes-256-cfb\t10:42:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t46.173.215.146\t48888\thttp://t.cn/EGJIyrl\taes-128-ctr\t10:42:15\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.107.62\t18700\tssx.re-81050006\taes-256-cfb\t10:42:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.232.121\t12181\tisx.yt-28926238\taes-256-cfb\t10:42:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.105.178\t25253\twjwOaCGIPgDd\taes-256-cfb\t10:42:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.79\t443\twww.xbvpn.com\taes-256-cfb\t10:42:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t206.189.164.117\t10719\tssx.re-69241804\taes-256-cfb\t10:42:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.193.166\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t211.75.79.233\t16505\tQozzuzLs2W32\taes-256-cfb\t10:42:12\tTW\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.79.36\t45054\tYp9qBTw5yVXi\taes-256-cfb\t10:42:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.116.180\t17433\t9W7EpHIv9u54\taes-256-cfb\t10:42:16\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.77.199.186\t2133\tbbaaz\taes-256-cfb\t10:42:13\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t206.189.83.144\t14701\tisx.yt-83030561\taes-256-cfb\t10:42:05\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.197.230\t38483\tIbvB9tq0cfFi\taes-256-cfb\t10:42:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t5.183.177.42\t443\twww.xbvpn.com\taes-256-cfb\t10:42:15\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.56.90.88\t46012\tb91iEL1m0cjD\taes-256-cfb\t10:42:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t213.168.249.12\t35763\tuIGHkg7We4Lc\taes-256-cfb\t10:42:15\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t128.199.219.149\t12708\tssx.re-67645910\taes-256-cfb\t10:42:07\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.93.246\t31728\tRFblPh7H4JHd\taes-256-cfb\t10:42:13\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t162.243.144.103\t15739\tisx.yt-66530684\taes-256-cfb\t10:42:04\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t188.119.64.20\t48887\tt.me/SSRSUB\taes-128-ctr\t10:42:16\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t46.101.38.131\t18649\tss8.pm-05088024\taes-256-cfb\t10:42:05\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t45.79.100.97\t29642\t7injRxH4S8LR\taes-256-cfb\t10:42:15\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t23.239.20.120\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:14\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.16.172\t18939\tf55.fun-42006728\taes-256-cfb\t10:42:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.62.144\t8097\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\taes-256-cfb\t10:42:19\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t165.22.101.210\t15863\tisx.yt-39954300\taes-256-cfb\t10:42:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t66.175.219.126\t44190\tQMVLC2HTtsNJ\taes-256-cfb\t10:42:12\tUS\t";

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
