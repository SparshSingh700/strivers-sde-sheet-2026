/*
Question Link:
https://leetcode.com/problems/search-a-2d-matrix/

Question:
Given a sorted 2D matrix where rows are sorted and first element
of each row is greater than last element of previous row,
determine if target exists in matrix.
*/

class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        // Treat matrix like one sorted 1D array
        // and apply binary search.

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Convert 1D index back into row and column
            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {

                return true;

            } else if (matrix[row][col] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return false;
    }
}