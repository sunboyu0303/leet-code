package com.leetcode.demo.test;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 * <p>
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 *
 * @author sunboyu
 * @date 2018/5/7
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s1));
        String s2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s2));
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));
        String s4 = "p";
        System.out.println(lengthOfLongestSubstring(s4));
        String s5 = "jbpnbwwd";
        System.out.println(lengthOfLongestSubstring(s5));

    }

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        char[] charArray = s.toCharArray();

        int len = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i; j < charArray.length; j++) {
                if (!set.contains(charArray[j])) {
                    set.add(charArray[j]);
                } else {
                    if (len < set.size()) {
                        len = set.size();
                    }
                    set = new HashSet<>();
                    break;
                }
            }
        }

        if (len == 0) {
            len = set.size();
        }

        return len;
    }
}