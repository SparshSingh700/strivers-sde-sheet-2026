/*
Question Link:
https://leetcode.com/problems/reverse-words-in-a-string/

Question:
Reverse the order of words in a string.
Remove extra spaces.
*/

class Solution {

    /*
        Scan from the end and extract one word at a time.

        Append each word to answer.

        Words automatically get reversed.
    */
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();

        int left = s.length() - 1;
        int right = left;

        while(left >= 0) {

            // Skip spaces.
            if(s.charAt(left) == ' ') {
                left--;
                right = left;
            }

            // Start of a word found.
            else if(left == 0 || s.charAt(left - 1) == ' ') {

                ans.append(s.substring(left, right + 1));
                ans.append(" ");

                left--;
                right = left;
            }

            // Still inside the same word.
            else {
                left--;
            }
        }

        return ans.toString().trim();
    }
}