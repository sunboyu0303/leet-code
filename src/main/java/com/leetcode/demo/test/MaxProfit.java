package com.leetcode.demo.test;

/**
 * 买卖股票的最佳时机 II
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 *
 * @author sunboyu
 * @date 2018/5/4
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        int[] b = {1, 2, 3, 4, 5};
        int[] c = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(a));
        System.out.println(maxProfit(b));
        System.out.println(maxProfit(c));
    }

    public static int maxProfit(int[] nums) {

        int maxResult = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

            }
        }
        return maxResult;
    }
}
