package com.leetcode.demo.test;

/**
 * 两个排序数组的中位数
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/
 * <p>
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 *
 * @author sunboyu
 * @date 2018/5/7
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2};
        System.out.println(findMedianSortedArrays(a, b));

        int[] c = {1, 2};
        int[] d = {3, 4};
        System.out.println(findMedianSortedArrays(c, d));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;
        int size = l1 + l2;

        if ((size & 1) == 1) {
            return findMedianSortedArrays(nums1, 0, nums2, 0, size >> 1);
        } else {
            double a = findMedianSortedArrays(nums1, 0, nums2, 0, size >> 1);
            double b = findMedianSortedArrays(nums1, 0, nums2, 0, (size >> 1) + 1);
            return (a + b) / 2;
        }
    }

    private static double findMedianSortedArrays(int[] nums1, int start1, int[] nums2, int start2, int k) {
        double d = 0.0;
        int l1 = nums1.length;
        int l2 = nums2.length;

        if (l1 - start1 > l2 - start2) {

        } else if (l1 - start1 == 0) {
            return nums2[k - 1];
        } else if (k == 1) {
            return Math.max(nums1[start1], nums2[start2]);
        }


        return d;
    }
}