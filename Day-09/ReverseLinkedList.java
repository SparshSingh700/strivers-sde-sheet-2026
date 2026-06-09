/*
Question Link:
https://leetcode.com/problems/reverse-linked-list/

Question:
Reverse a singly linked list
and return new head.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    /*
    Store next node before reversing
    so remaining list is not lost.

    At the end:
    prev becomes new head.
    */

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;

        ListNode curr = head;

        while (curr != null) {

            ListNode front = curr.next;

            curr.next = prev;

            prev = curr;

            curr = front;
        }

        return prev;
    }
}