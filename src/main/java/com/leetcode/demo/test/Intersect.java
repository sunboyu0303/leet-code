package com.leetcode.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 两个数组的交集 II
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
 * <p>
 *
 * @author sunboyu
 * @date 2018/5/4
 */
public class Intersect {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2};
        print(intersect(a, b));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();
        for (int i : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] != -1 && i == nums2[j]) {
                    nums2[j] = -1;
                    list.add(i);
                    break;
                }
            }
        }

        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }

        return intArray;
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
