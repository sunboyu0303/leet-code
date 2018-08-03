package com.leetcode.demo.test;

/**
 * 从排序数组中删除重复项
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 *
 * @author sunboyu
 * @date 2018/5/4
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        int[] b = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        print(a, removeDuplicates(a));
        print(b, removeDuplicates(b));
    }

    public static int removeDuplicates(int[] nums) {

        int maxLen = nums.length;
        int index = 0;
        while (index < maxLen - 1) {
            int a = nums[index];
            int b = nums[index + 1];
            if (a == b) {
                int i = index;
                int temp = nums[i];
                while ((i + 1) < maxLen) {
                    nums[i] = nums[i + 1];
                    i++;
                }
                nums[i] = temp;
                maxLen--;
//                print(nums);
            } else {
                index++;
            }
        }
        return index + 1;
    }

    private static void print(int[] nums) {
        print(nums, nums.length);
    }

    private static void print(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
