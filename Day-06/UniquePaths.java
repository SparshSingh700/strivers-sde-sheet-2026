/*
Question Link:
https://leetcode.com/problems/unique-paths/

Question:
Robot starts at top-left corner and can move
only right or down.
Find total unique paths to reach bottom-right.
*/

class Solution {

    /*
    Paths to current cell =
    paths from top + paths from left
    */

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        // First row can only come from left
        for (int col = 0; col < n; col++) {
            dp[0][col] = 1;
        }

        // First column can only come from top
        for (int row = 0; row < m; row++) {
            dp[row][0] = 1;
        }

        // Fill remaining grid
        for (int row = 1; row < m; row++) {

            for (int col = 1; col < n; col++) {

                dp[row][col] =
                        dp[row - 1][col]
                      + dp[row][col - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}