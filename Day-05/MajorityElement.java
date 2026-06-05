/*
Question Link:
https://leetcode.com/problems/majority-element/

Question:
Find the element that appears more than n/2 times in the array.
*/

class Solution {

    // Keep majority candidate and its count.
    // Same element increases count.
    // Different element decreases count.
    // Majority element survives all cancellations.

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // Choose new candidate
            if (count == 0) {
                candidate = num;
            }

            // Same candidate
            if (num == candidate) {

                count++;

            } else {

                // Different element cancels out
                count--;
            }
        }

        return candidate;
    }
}