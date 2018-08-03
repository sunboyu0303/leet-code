package com.leetcode.demo.test;

/**
 * 只出现一次的数字
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
 *
 * @author sunboyu
 * @date 2018/5/4
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] a = {2, 2, 1};
        System.out.println(singleNumber(a));
        int[] b = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(b));
    }

    public static int singleNumber(int[] nums) {
        boolean b;
        for (int i = 0; i < nums.length; i++) {
            b = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    b = false;
                    break;
                }
            }
            if (b) {
                return nums[i];
            }
        }
        return -1;
    }
}
