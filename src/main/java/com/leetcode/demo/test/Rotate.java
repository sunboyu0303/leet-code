package com.leetcode.demo.test;

/**
 * 旋转数组
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 * <p>
 *
 * @author sunboyu
 * @date 2018/5/4
 */
public class Rotate {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        rotate(a, 3);
        int[] b = {-1, -100, 3, 99};
        rotate(b, 2);
    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int len = nums.length - 1;
            int idx = len;
            int temp = nums[len];
            while (idx > 0) {
                nums[idx] = nums[idx - 1];
                idx--;
            }
            nums[idx] = temp;
        }
        print(nums);
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
