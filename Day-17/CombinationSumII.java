/*
Question Link:
https://leetcode.com/problems/combination-sum-ii/

Question:
Find unique combinations whose sum equals target.
Each number can be used only once.
*/

class Solution {

    /*
    Sort array first.

    Skip duplicate starts at the same recursion level.

    Move to i+1 because
    current element cannot be reused.
    */

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();

        helper(0, target, candidates, new ArrayList<>(), res);

        return res;
    }

    static void helper(int index, int target, int[] arr,
                       List<Integer> list, List<List<Integer>> res) {

        if(target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < arr.length; i++) {

            if(i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            if(arr[i] > target) {
                break;
            }

            list.add(arr[i]);

            helper(i + 1, target - arr[i], arr, list, res);

            list.remove(list.size() - 1);
        }
    }
}