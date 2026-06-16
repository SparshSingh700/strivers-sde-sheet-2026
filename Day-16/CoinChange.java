/*
Question Link:
https://leetcode.com/problems/coin-change/

Question:
Find the minimum number of coins needed
to make the given amount.
Return -1 if impossible.
*/

class Solution {

    /*
    For every coin:

    Take:
    stay on same index because coin
    can be used again.

    Skip:
    move to previous coin.

    Return minimum coins among both choices.
    */

    int helper(int index, int amount, int[] coins, int[][] dp) {

        if(index == 0) {
            if(amount % coins[0] == 0) {
                return amount / coins[0];
            }
            return (int)1e9;
        }

        if(dp[index][amount] != -1) {
            return dp[index][amount];
        }

        int take = (int)1e9;

        if(coins[index] <= amount) {
            take = 1 + helper(index, amount - coins[index], coins, dp);
        }

        int skip = helper(index - 1, amount, coins, dp);

        return dp[index][amount] = Math.min(take, skip);
    }

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = helper(n - 1, amount, coins, dp);

        return ans >= 1e9 ? -1 : ans;
    }
}