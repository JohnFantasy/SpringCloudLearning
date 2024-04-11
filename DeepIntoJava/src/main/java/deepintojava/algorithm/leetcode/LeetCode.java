package deepintojava.algorithm.leetcode;

import java.util.HashMap;

/**
 * @program: SpringBoot&SpringCloud
 * @description: leetcode每日一题
 * @author: fyz
 * @createAt: 2020-03-19 14:13
 **/
public class LeetCode {

    public static void main(String[] args) {
        LeetCode leetCode = new LeetCode();
        int abccccdd = leetCode.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
        System.out.println(abccccdd);
        String x = "rtgtrsgrtgr";
        System.out.println(x.substring(x.length()-4 ));
    }

    /**
     * @param s
     * @return int
     * @date 2020-03-19
     * @description: 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
     * <p>
     * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
     * <p>
     * 注意:
     * 假设字符串的长度不会超过 1010。
     */
    public int longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap();
        for (char c : chars) {
            map.merge(c, 1, Integer::sum);
        }
        int length = 0;
        int max = 0;
        for (int value : map.values()) {
            if (value % 2 == 0) {
                length += value;
            } else {
                if (value > max) {
                    max = value;
                }
            }
        }
        return length += max;
    }
}
