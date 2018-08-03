package com.leetcode.demo.test;

/**
 * 最长回文子串
 * https://leetcode-cn.com/problems/longest-palindromic-substring/description/
 * <p>
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 *
 * @author sunboyu
 * @date 2018/6/2
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
        String s1 = "cbbd";
        System.out.println(longestPalindrome(s1));
        String s2 = "a";
        System.out.println(longestPalindrome(s2));
        String s3 = "bb";
        System.out.println(longestPalindrome(s3));
        String s4 = "abcda";
        System.out.println(longestPalindrome(s4));
        String s5 = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s5));
    }

    private static String longestPalindrome(String s) {
        //-----------------------------------
        //转换字符串
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            stringBuilder.append("#");
        }
        //-----------------------------------

        int rightIndex = 0;
        int centerIndex = 0;
        //求len中的最大
        int answer = 0;
        //answer最大时的中心
        int index = 0;
        int len[] = new int[stringBuilder.length()];

        for (int i = 1; i < stringBuilder.length(); i++) {
            //当rightIndex > i，那么我们就在rightIndex - i 与len[2 * centerIndex - i](len[j])，取得最小值
            //因为当i + len[j] < rightIndex时，我们就把len[i]更新为len[j]
            //但是如果i + len[j] >= rightIndex时，我们暂且将len[i]定更新为rightIndex - i,超出的部分需要我们一个一个的匹配
            if (rightIndex > i) {
                len[i] = Math.min(rightIndex - i, len[2 * centerIndex - i]);
            } else {
                len[i] = 1;
            }
            //一个一个匹配
            //要么是超出的部分，要么是i > rightIndex
            while (i - len[i] >= 0 && i + len[i] < stringBuilder.length() && stringBuilder.charAt(i - len[i]) == stringBuilder.charAt(i + len[i])) {
                len[i]++;
            }
            //当 len[i] + i > rightIndex,我们需要更新centerIndex和rightIndex
            //至于为什么会这样做，理解一下rightIndex和centerIndex的含义
            if (len[i] + i > rightIndex) {
                rightIndex = len[i] + i;
                centerIndex = i;
            }
            if (len[i] > answer) {
                answer = len[i];
                index = i;
            }
        }
        //截取字符串
        //为什么index - answer + 1,因为len[i] - 1才是原来的回文字符串长度，而answer记录的是len中最大值
        return stringBuilder.substring(index - answer + 1, index + answer).replace("#", "");
    }
}