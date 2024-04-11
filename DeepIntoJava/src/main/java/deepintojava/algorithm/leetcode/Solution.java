package deepintojava.algorithm.leetcode;

/**
 * @program: SpringBoot&SpringCloud
 * @description: leetcode每日一题:股票最大收益问题
 * @author: fyz
 * @createAt: 2020-03-09 11:17
 **/
public class Solution {

    public static void main(String[] args) {
        int[] prices = {2, 1, 4};
        int a = maxProfit(prices);
        System.out.println(a);
        int b = maxProfit2(prices);
        System.out.println(b);
    }


    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length <= 1) {
            return 0;
        }
        int length = prices.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}

