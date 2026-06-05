/*
Question Link:
https://leetcode.com/problems/powx-n/

Question:
Implement pow(x, n) and calculate x raised to power n.
*/

class Solution {

    /*
    If power is even:
    square number and halve power

    Example:
    4^8 = 16^4

    If power is odd:
    multiply answer once and reduce power

    Example:
    4^3 = 4 × 4^2
    */

    public double myPow(double x, int n) {

        long N = n;

        // Handle negative powers
        if (N < 0) {

            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;

        while (N > 0) {

            // Odd power
            if (N % 2 == 1) {

                result *= currentProduct;
                N--;
            }

            // Square current number
            currentProduct *= currentProduct;

            // Halve power
            N /= 2;
        }

        return result;
    }
}