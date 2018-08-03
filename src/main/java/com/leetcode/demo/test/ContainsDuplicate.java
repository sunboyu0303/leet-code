package com.leetcode.demo.test;

/**
 * 存在重复
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
 *
 * @author sunboyu
 * @date 2018/5/4
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        System.out.println(containsDuplicate(a));
        int[] b = {1, 2, 3, 4};
        System.out.println(containsDuplicate(b));
        int[] c = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(c));
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}