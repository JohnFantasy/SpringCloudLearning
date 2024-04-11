package deepintojava.javaFoundation.StringUtil;

/**
 * @BelongsProject: SpringBoot&SpringCloud
 * @BelongsPackage: com.laofaner.javasourcecode.StringUtil
 * @Author: fanyuzhuo
 * @CreateTime: 2019-04-23 15:26
 * @Description: TODO
 * @Version 1.0
 */
public class StringUtilToDealWith {

    public static void main(String[] args) {
        String interfaces = "POST /bill/add\n" +
                "新增账单，暂时没用\n" +
                "\n" +
                "POST /bill/createBill\n" +
                "批量新增账单\n" +
                "\n" +
                "GET /bill/downLoadExcel\n" +
                "下载账单导入模板\n" +
                "\n" +
                "POST /bill/edit\n" +
                "商户端编辑账单\n" +
                "\n" +
                "POST /bill/export\n" +
                "商户端导出账单\n" +
                "\n" +
                "POST /bill/finish\n" +
                "线下收款完成账单\n" +
                "\n" +
                "POST /bill/importExcel\n" +
                "导入账单信息\n" +
                "\n" +
                "POST /bill/list\n" +
                "微信端显示账单列表\n" +
                "\n" +
                "GET /bill/noPayList\n" +
                "微信端查看未支付账单\n" +
                "\n" +
                "POST /bill/offLinePay\n" +
                "线下收款联动预存余额\n" +
                "\n" +
                "POST /bill/ownerBills\n" +
                "检索账单，暂时没用\n" +
                "\n" +
                "POST /bill/payDownLine\n" +
                "线下收款，用于手动调用来处理大量线下收款的情况\n" +
                "\n" +
                "POST /bill/remove\n" +
                "商户端删除账单\n" +
                "\n" +
                "POST /bill/removeList\n" +
                "商户端批量删除账单\n" +
                "\n" +
                "POST /bill/webList\n" +
                "物业端显示账单列表\n" +
                "\n" +
                "POST /bill/webListExport\n" +
                "物业端账单详情导出\n" +
                "\n";

        String[] interfacesAndDesc = interfaces.split("\n\n");
        for(String interface1 : interfacesAndDesc){
            String[] strs = interface1.split("\n");
            String sss = "/bill";
            int length = sss.length();
//            System.out.println(strs[0]);
//            System.out.println(strs[1]);
            System.out.println(strs[0].substring(strs[0].indexOf(sss)+length)+"\t"+strs[1]+"\t"+strs[0].substring(0,strs[0].indexOf(sss)));
//            System.out.println(interface1+"\n");
        }
    }
}
