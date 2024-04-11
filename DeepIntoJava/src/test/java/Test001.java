public class Test001 {
    public static void main(String[] args) {
        String s = "h";
        byte[] bytes = hexStr2BinArr(s);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 1) {
                System.out.println(i);
            }
        }
    }

    /**
     * @param hexString
     * @return 将十六进制转换为二进制字节数组   16-2
     */
    public static byte[] hexStr2BinArr(String hexString) {
        //hexString的长度对2取整，作为bytes的长度
        int len = hexString.length() / 2;
        byte[] bytes = new byte[len];
        byte high = 0;//字节高四位
        byte low = 0;//字节低四位
        for (int i = 0; i < len; i++) {
            //右移四位得到高位
            high = (byte) ((hexString.indexOf(hexString.charAt(2 * i))) << 4);
            low = (byte) hexString.indexOf(hexString.charAt(2 * i + 1));
            bytes[i] = (byte) (high | low);//高地位做或运算
        }
        return bytes;
    }

//    /**
//     *
//     * @param hexString
//     * @return 将十六进制转换为二进制字符串   16-2
//     */
//    public static String hexStr2BinStr(String hexString){
//        return bytes2BinStr(hexStr2BinArr(hexString));
//    }
}
