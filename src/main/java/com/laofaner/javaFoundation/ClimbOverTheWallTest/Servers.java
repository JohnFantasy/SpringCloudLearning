package com.laofaner.javaFoundation.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t45.88.42.58\t3572\tcht1997...///\trc4-md5\t14:32:11\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t45.151.175.160\t9999\tt.me/SSRSUB\trc4-md5\t14:32:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t38.100.229.84\t39\tbannedbook.org\taes-256-cfb\t14:32:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t206.189.149.132\t10073\tssx.re-90933446\taes-256-cfb\t14:32:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t34.218.41.53\t443\tbbrc173\tchacha20\t14:32:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t173.82.104.199\t3572\tcht1997...///\trc4-md5\t14:32:09\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t13.231.170.111\t26119\tE3nbTDcxCHP3\taes-256-cfb\t14:32:08\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t54.248.71.145\t43444\twbOyGcpJawkm\taes-256-cfb\t14:32:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t18.176.54.219\t23398\tq3etKvgAe7uj\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t34.220.74.172\t443\tbbrc173\tchacha20\t14:32:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t77.244.215.99\t56770\tYSkx9gN02cTL\taes-256-cfb\t14:32:10\tRU\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.212.248\t18663\tisx.yt-05377990\taes-256-cfb\t14:32:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t52.69.248.106\t15370\tLit2dKpDch2M\taes-256-cfb\t14:32:08\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t206.189.145.4\t10569\tisx.yt-38603485\taes-256-cfb\t14:32:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.112.217\t30080\tn2EVmmlPOpux\taes-256-cfb\t14:32:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t192.241.199.224\t11644\tss8.pm-49827998\taes-256-cfb\t14:32:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t13.112.180.153\t37141\txVkmrVEzeAzP\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.220.237\t30087\tMBx8WVPFfAzu\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t211.21.214.234\t21971\tbTuK5IJr9hzl\taes-256-cfb\t14:32:11\tTW\t\n" +
                "10↑/10↑/10↑/10↑\t18.176.55.40\t32147\tVTnashhXK3Ug\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t54.238.255.78\t46219\tlQ8bFmleM0Fn\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.113.24.135\t43195\trDGOE8qlXBGq\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.109.219\t34773\tPks9YWlTsSdo\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.84.1.61\t34567\t57369273\taes-256-cfb\t14:32:06\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t159.203.202.84\t14175\tisx.yt-86289345\taes-256-cfb\t14:32:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.186.145\t15322\tf55.fun-34336431\taes-256-cfb\t14:32:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t13.115.201.54\t15421\t1pW86KmHZNdn\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.215.53\t53133\tytZTU5v7t846\taes-256-cfb\t14:32:09\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.112.61.202\t443\tbbrc173\tchacha20\t14:32:10\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t3.112.217.105\t40676\tGwlN0wz52AYK\taes-256-cfb\t14:32:12\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t92.118.45.209\t3572\tcht1997...///\trc4-md5\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t159.65.6.120\t16846\tisx.yt-46789348\taes-256-cfb\t14:32:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t54.199.166.198\t28779\taIvXrWdtZu1J\taes-256-cfb\t14:32:07\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.105.209.201\t25382\t1x08XhO50qux\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t104.248.173.190\t18035\tss8.pm-03113696\taes-256-cfb\t14:32:05\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.102.87\t19444\truAqdSWKFZbC\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.113.227\t32827\tMyLJci82zHof\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.103.114\t18137\tx1tJ3lcJTTpn\taes-256-cfb\t14:32:09\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t45.146.121.20\t39030\tUqPOPN\taes-256-cfb\t14:32:10\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.96.17\t17677\tssx.re-87570195\taes-256-cfb\t14:32:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t178.128.53.146\t15770\tisx.yt-61670828\taes-256-cfb\t14:32:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t178.128.53.54\t13007\tss8.pm-99886376\taes-256-cfb\t14:32:06\tSG\t\n" +
                "10↑/10↑/10↑/10↑\t167.172.192.31\t17207\tssx.re-34475761\taes-256-cfb\t14:32:05\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.114.192\t12850\t0hroi4YNrgxk\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.113.199\t22050\tbW8sgNj23ez6\taes-256-cfb\t14:32:08\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.84.96\t54778\t8ASDWK5pwKct\taes-256-cfb\t14:32:11\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t198.199.95.180\t17551\tisx.yt-84131734\taes-256-cfb\t14:32:05\tUS";

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
