package com.laofaner.algorithm.leetcode;

import java.util.Arrays;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。  你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * @author: fyz
 * @createAt: 2020-03-13 11:53
 **/
public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int max = 0;
        int result = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int iNums = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    iNums++;
                }
            }
            if (iNums > max) {
                max = iNums;
                index = i;
            }
        }
        if (max > nums.length / 2) {
            result = nums[index];
        }
        return result;
    }

    public static int majorityElement1(int[] nums) {

        int count = 1;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (result == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    result = nums[i];
                    count = 1;
                }
            }
        }
        return result;
    }


    public static int majorityElement2(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int i = MajorityElement.majorityElement1(new int[]{6, 5, 5});
        System.out.println(i);
    }
}
