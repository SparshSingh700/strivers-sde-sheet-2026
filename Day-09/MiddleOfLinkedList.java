/*
Question Link:
https://leetcode.com/problems/middle-of-the-linked-list/

Question:
Return middle node of linked list.
If two middles exist,
return second middle.
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
    Slow pointer moves 1 step.
    Fast pointer moves 2 steps.

    When fast reaches end:
    slow reaches middle.
    */

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;

        ListNode fast = head;

        while (fast != null &&
               fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }
}