/*
Question Link:
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

Original Sheet Topic:
KMP Algorithm / LPS Array

Question:
Find the first occurrence of a pattern
inside a string.

Note:
I solved this using brute force first because
it was sufficient for the problem and I was
short on time. The optimal KMP solution is
added below for future revision.
*/

class Solution {

    /*
        Try every possible starting position.

        Compare substring only if the first
        character matches.

        Return immediately on full match.
    */
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i <= n - m; i++) {

            if(haystack.charAt(i) == needle.charAt(0)) {

                if(haystack.substring(i, i + m).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    /*
    =====================================================
                OPTIMAL KMP SOLUTION (For Revision)
    =====================================================

    public int strStr(String haystack, String needle) {

        if(needle.length() == 0){
            return 0;
        }

        int[] lps = buildLPS(needle);

        int i = 0;
        int j = 0;

        while(i < haystack.length()){

            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;

                if(j == needle.length()){
                    return i - j;
                }
            }
            else{

                if(j != 0){
                    j = lps[j - 1];
                }
                else{
                    i++;
                }
            }
        }

        return -1;
    }

    private int[] buildLPS(String pattern){

        int[] lps = new int[pattern.length()];

        int len = 0;
        int i = 1;

        while(i < pattern.length()){

            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{

                if(len != 0){
                    len = lps[len - 1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    */
}