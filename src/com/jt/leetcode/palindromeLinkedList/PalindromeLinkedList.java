package com.jt.leetcode.palindromeLinkedList;

/**
 * Created by jiangtao on 16/5/24.
 *
 * {@link "https://leetcode.com/problems/palindrome-linked-list/"}
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return false;
        }

        if (head.next == head) {
            return true;
        }

        ListNode oneStepNode = head;
        ListNode twoStepNode = head.next;


        return false;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
