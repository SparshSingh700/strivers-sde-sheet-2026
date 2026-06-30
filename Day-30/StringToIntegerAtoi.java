/*
Question Link:
https://leetcode.com/problems/string-to-integer-atoi/

Question:
Implement the atoi function.

Ignore leading spaces, handle optional sign,
read digits and clamp the answer
within 32-bit signed integer range.
*/

class Solution {

    /*
        Skip leading spaces and determine the sign.

        Build the number digit by digit.

        Stop at first non-digit character.

        Clamp early to avoid overflow.
    */
    public int myAtoi(String s) {

        s = s.trim();

        if(s.length() == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        long result = 0;

        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            if(s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))) {

            result = result * 10 + (s.charAt(i) - '0');

            if(sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if(sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * result);
    }
}