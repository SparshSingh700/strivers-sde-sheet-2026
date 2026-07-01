/*
Question Link:
https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/

Question:
Return the minimum number of insertions
required to make the string a palindrome.
*/

class Solution {

    /*
        Characters already belonging to the
        Longest Palindromic Subsequence
        don't need insertion.

        Answer =
        String Length - LPS.

        LPS = LCS(string, reverse(string)).
    */
    public int minInsertions(String s) {

        String rev = new StringBuilder(s).reverse().toString();

        int n = s.length();

        int[][] dp = new int[n + 1][n + 1];

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return n - dp[n][n];
    }
}