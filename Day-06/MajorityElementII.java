/*
Question Link:
https://leetcode.com/problems/majority-element-ii/

Question:
Find all elements appearing more than n/3 times.
*/

class Solution {

    /*
    At most 2 elements can appear more than n/3 times.

    Use two candidates and cancel out
    different elements.

    First pass:
    find possible candidates

    Second pass:
    verify frequencies
    */

    public List<Integer> majorityElement(int[] nums) {

        int cand1 = Integer.MIN_VALUE;
        int cand2 = Integer.MAX_VALUE;

        int cnt1 = 0;
        int cnt2 = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (cnt1 == 0 && nums[i] != cand2) {

                cand1 = nums[i];
                cnt1 = 1;

            } else if (cnt2 == 0 &&
                       nums[i] != cand1) {

                cand2 = nums[i];
                cnt2 = 1;

            } else if (nums[i] == cand1) {

                cnt1++;

            } else if (nums[i] == cand2) {

                cnt2++;

            } else {

                cnt1--;
                cnt2--;
            }
        }

        // Verify actual frequencies
        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {

            if (num == cand1) {

                cnt1++;

            } else if (num == cand2) {

                cnt2++;
            }
        }

        int min = nums.length / 3;

        if (cnt1 > min) {
            list.add(cand1);
        }

        if (cnt2 > min) {
            list.add(cand2);
        }

        Collections.sort(list);

        return list;
    }
}