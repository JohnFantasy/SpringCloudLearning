package com.laofaner.javaFoundation.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t172.105.199.16\t20216\taes-256-cfb\tjtVEgK4luyiG\t09:12:27\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t69.30.201.82\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t09:12:09\tUS\t\n" +
                "10↑/10↑/10↑/10↑\t138.68.211.190\t11553\taes-256-cfb\tss8.pm-95775044\t09:12:05\tUS\t\n" +
                "10↑/6↓/8↑/10↑\t138.68.217.119\t14312\taes-256-cfb\tisx.yt-38180304\t09:12:05\tUS\t\n" +
                "10↑/9↑/10↑/10↑\t138.68.217.145\t17496\taes-256-cfb\tssx.re-28716057\t09:12:05\tUS\t\n" +
                "10↑/9↑/10↑/10↑\t172.104.93.212\t35808\taes-256-cfb\tXTrWgRs4QUjZ\t09:12:11\tJP\t\n" +
                "3↓/9↑/9↓/9↑\t138.68.217.84\t18194\taes-256-cfb\tisx.yt-65114982\t09:02:04\tUS\t\n" +
                "5↑/10↑/10↑/10↑\t167.71.204.250\t17870\taes-256-cfb\tisx.yt-12672498\t09:12:06\tSG\t\n" +
                "5↑/10↑/10↑/10↑\t157.245.192.82\t18110\taes-256-cfb\tisx.yt-68873058\t09:12:06\tSG\t\n" +
                "9↑/10↑/10↑/10↑\t172.105.192.82\t26856\taes-256-cfb\t10rQMbABljoc\t09:12:34\tJP\t\n" +
                "9↑/9↑/10↑/10↑\t157.245.174.6\t11231\taes-256-cfb\tssx.re-44213453\t09:12:05\tUS\t\n" +
                "9↑/9↑/9↑/9↑\t165.22.245.5\t10204\taes-256-cfb\tssx.re-51009943\t09:12:06\tSG\t\n" +
                "9↓/10↑/10↑/10↑\t157.245.200.87\t15130\taes-256-cfb\tss8.pm-75695249\t09:07:06\tSG";

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
