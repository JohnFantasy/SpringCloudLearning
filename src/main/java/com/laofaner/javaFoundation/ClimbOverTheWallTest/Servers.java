package com.laofaner.javaFoundation.ClimbOverTheWallTest;

public class Servers {
    public static void main(String[] args) {
        String serversStr = "10↑/10↑/10↑/10↑\t45.77.58.5\t31820\tchacha20-ietf-poly1305\tZsOUjNLy\t13:37:05\tGB\t\n" +
                "10↑/10↑/10↑/10↑\t136.244.86.108\t32991\tchacha20-ietf-poly1305\tiuO08Mir\t13:37:05\tDE\t\n" +
                "10↑/10↑/10↑/10↑\t45.32.42.19\t80\trc4\tdongtaiwang.com\t13:37:06\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t139.162.67.40\t8097\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t13:37:14\tJP\t\n" +
                "10↑/10↑/10↑/10↑\t172.104.99.75\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t13:37:13\tJP\t\n" +
                "10↑/10↑/10↑/9↑\t149.28.66.98\t35438\tchacha20-ietf-poly1305\tPIICkklQ\t13:37:05\tUS\t\n" +
                "10↑/10↑/10↑/9↓\t45.79.111.160\t8099\taes-256-cfb\teIW0Dnk69454e6nSwuspv9DmS201tQ0D\t13:37:07\tUS";

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
                    "      \"password\": \"" +password  + "\",\n" +
                    "      \"method\": \"" + method + "\",\n" +
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
