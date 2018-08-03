package com.leetcode.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 * <p>
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 *
 * @author sunboyu
 * @date 2018/5/7
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3, null);
        ListNode listNode2 = new ListNode(4, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);

        print(listNode3);

        ListNode listNode4 = new ListNode(4, null);
        ListNode listNode5 = new ListNode(6, listNode4);
        ListNode listNode6 = new ListNode(5, listNode5);

        print(listNode6);

        print(addTwoNumbers(listNode3, listNode6));

        ListNode listNode7 = new ListNode(5, null);
        ListNode listNode8 = new ListNode(5, null);

        print(addTwoNumbers(listNode7, listNode8));

        ListNode listNode9 = new ListNode(6, null);
        ListNode listNode10 = new ListNode(1, listNode9);
        ListNode listNode11 = new ListNode(9, listNode10);

        ListNode listNode12 = new ListNode(0, null);
        print(addTwoNumbers(listNode11, listNode12));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = null;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        List<ListNode> list = new ArrayList<>();
        int up = 0;

        while (temp1 != null || temp2 != null) {

            int num1 = temp1 == null ? 0 : temp1.val;
            int num2 = temp2 == null ? 0 : temp2.val;
            int tempNum = num1 + num2 + up;
            if (tempNum >= 10) {
                up = 1;
                tempNum = tempNum % 10;
            } else {
                up = 0;
            }
            temp = new ListNode(tempNum);
            list.add(temp);
            temp1 = temp1 == null ? null : temp1.next;
            temp2 = temp2 == null ? null : temp2.next;
        }

        if (up != 0) {
            list.add(new ListNode(up));
        }

        int len = list.size();
        ListNode listNode = null;
        for (int i = len - 1; i >= 0; i--) {
            listNode = list.get(i);
            if (i != len - 1) {
                listNode.next = temp;
                temp = listNode;
            } else {
                temp = listNode;
            }
        }

        return temp;
    }

    private static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            if (listNode.next != null) {
                System.out.print(" -> ");
            }
            listNode = listNode.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int i, ListNode next) {
        this.val = i;
        this.next = next;
    }
}