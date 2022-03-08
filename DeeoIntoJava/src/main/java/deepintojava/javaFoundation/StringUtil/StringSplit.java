package deepintojava.javaFoundation.StringUtil;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.javasourcecode.StringUtil
 * @Author: fanyuzhuo
 * @CreateTime: 2019-05-04 10:43
 * @Description: TODO
 * @Version 1.0
 */
public class StringSplit {

    public static void main(String[] args) {
        String str = "communityId\t\n" +
                "(required)\n" +
                "communityId\n" +
                "\n" +
                "query\tstring\n" +
                "endDate\t\n" +
                "(required)\n" +
                "endDate\n" +
                "\n" +
                "query\tstring\n" +
                "floorNo\t\n" +
                "(required)\n" +
                "floorNo\n" +
                "\n" +
                "query\tstring\n" +
                "houseNo\t\n" +
                "(required)\n" +
                "houseNo\n" +
                "\n" +
                "query\tstring\n" +
                "orgId\t\n" +
                "(required)\n" +
                "orgId\n" +
                "\n" +
                "query\tstring\n" +
                "payMode\t\n" +
                "(required)\n" +
                "payMode\n" +
                "\n" +
                "query\tstring\n" +
                "residentName\t\n" +
                "(required)\n" +
                "residentName\n" +
                "\n" +
                "query\tstring\n" +
                "residentMobile\t\n" +
                "(required)\n" +
                "residentMobile\n" +
                "\n" +
                "query\tstring\n" +
                "roleId\t\n" +
                "(required)\n" +
                "roleId\n" +
                "\n" +
                "query\tstring\n" +
                "startDate\t\n" +
                "(required)\n" +
                "startDate\n" +
                "\n" +
                "query\tstring\n" +
                "unitNo\t\n" +
                "(required)\n" +
                "unitNo\n" +
                "\n" +
                "query\tstring";

        String[] strs = str.split("\n\n");
        for (String s : strs) {
            System.out.println(s);
            System.out.println("$$$$$$$$$$$$$$$");
        }
    }
}
