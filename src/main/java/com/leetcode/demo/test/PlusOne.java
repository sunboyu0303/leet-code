package com.leetcode.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 加一
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 * <p>
 *
 * @author sunboyu
 * @date 2018/5/4
 */
public class PlusOne {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        print(plusOne(a));
        int[] b = {4, 3, 2, 1};
        print(plusOne(b));
        int[] c = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        print(plusOne(c));
        int[] d = {9, 9};
        print(plusOne(d));
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList();
        int len = digits.length;
        int up = 0;
        int temp = 0;
        for (int i = len - 1; i >= 0; i--) {

            if (i == len - 1) {
                temp = digits[i] + 1;
            } else {
                temp = digits[i] + up;
            }
            if (temp >= 10) {
                up = 1;
            } else {
                up = 0;
            }
            list.add(temp % 10);
        }
        if (up == 1) {
            list.add(1);
        }
        int[] a = new int[list.size()];

        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            a[j] = list.get(i);
        }
        return a;
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
