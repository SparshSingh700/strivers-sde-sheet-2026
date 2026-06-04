/*
Question Link:
https://leetcode.com/problems/find-the-duplicate-number/

Question:
Given an array containing n + 1 integers where each integer is between 1 and n,
find the duplicate number without modifying the array and using constant extra space.
*/

class Solution {

    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = slow;

        // Move like linked list cycle detection
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find start of cycle = duplicate number
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}