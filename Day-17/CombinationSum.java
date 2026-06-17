/*
Question Link:
https://leetcode.com/problems/combination-sum/

Question:
Find all combinations whose sum equals target.
Each number can be used unlimited times.
*/

class Solution {

    /*
    Take:
    stay on same index because
    current number can be reused.

    Skip:
    move to next index.

    Store combination when
    target sum is reached.
    */

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();

        helper(0, 0, target, candidates, new ArrayList<>(), res);

        return res;
    }

    static void helper(int index, int sum, int target, int[] arr,
                       List<Integer> list, List<List<Integer>> res) {

        if(sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        if(index == arr.length) {
            return;
        }

        // Take
        if(sum + arr[index] <= target) {
            list.add(arr[index]);
            helper(index, sum + arr[index], target, arr, list, res);
            list.remove(list.size() - 1);
        }

        // Skip
        helper(index + 1, sum, target, arr, list, res);
    }
}