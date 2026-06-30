/*
Question Link:
https://leetcode.com/problems/longest-common-prefix/

Question:
Find the longest common prefix
among all strings in the array.
*/

class Solution {

    /*
        Use the first string as reference.

        Compare characters column by column.

        Stop at first mismatch.
    */
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }

        for(int i = 0; i < strs[0].length(); i++) {

            char c = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++) {

                if(i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}