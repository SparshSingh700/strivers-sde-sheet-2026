/*
Question Link:
https://leetcode.com/problems/merge-two-sorted-lists/

Question:
Merge two sorted linked lists
into one sorted linked list.
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
    Compare nodes from both lists.

    Attach smaller node
    and move temp forward.

    At end:
    attach remaining list directly.
    */

    public ListNode mergeTwoLists(
            ListNode list1,
            ListNode list2) {

        if (list1 == null) return list2;

        if (list2 == null) return list1;

        ListNode head;

        // Decide starting node
        if (list1.val <= list2.val) {

            head = list1;

            list1 = list1.next;

        } else {

            head = list2;

            list2 = list2.next;
        }

        ListNode temp = head;

        while (list1 != null &&
               list2 != null) {

            if (list1.val <= list2.val) {

                temp.next = list1;

                list1 = list1.next;

            } else {

                temp.next = list2;

                list2 = list2.next;
            }

            temp = temp.next;
        }

        // Attach remaining nodes
        if (list1 != null) {

            temp.next = list1;

        } else {

            temp.next = list2;
        }

        return head;
    }
}