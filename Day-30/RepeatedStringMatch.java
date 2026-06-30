/*
Question Link:
https://leetcode.com/problems/repeated-string-match/

Question:
Return the minimum number of times
string a must be repeated so that
b becomes its substring.
*/

class Solution {

    /*
        Keep repeating a until its length
        becomes at least b's length.

        Then check current string and
        one extra repetition.

        Why only one extra repetition?
        Because b can overlap the boundary
        between two copies of a only once.
    */
    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        while(sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if(sb.indexOf(b) != -1) {
            return count;
        }

        sb.append(a);

        if(sb.indexOf(b) != -1) {
            return count + 1;
        }

        return -1;
    }

    /*
    ---------------------------
    Rabin-Karp Approach
    ---------------------------

    Instead of using indexOf(),
    we can search b inside the repeated string
    using rolling hash.

    Time:
    Average: O(n + m)

    private boolean rabinKarp(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if(m > n) {
            return false;
        }

        long mod = 1_000_000_007;
        long base = 31;

        long patternHash = 0;
        long windowHash = 0;
        long power = 1;

        for(int i = 0; i < m - 1; i++) {
            power = (power * base) % mod;
        }

        for(int i = 0; i < m; i++) {
            patternHash = (patternHash * base + pattern.charAt(i)) % mod;
            windowHash = (windowHash * base + text.charAt(i)) % mod;
        }

        for(int i = 0; i <= n - m; i++) {

            if(patternHash == windowHash) {
                if(text.substring(i, i + m).equals(pattern)) {
                    return true;
                }
            }

            if(i < n - m) {
                windowHash =
                    (windowHash - text.charAt(i) * power % mod + mod) % mod;

                windowHash =
                    (windowHash * base + text.charAt(i + m)) % mod;
            }
        }

        return false;
    }
    */
}