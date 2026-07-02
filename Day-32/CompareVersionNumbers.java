/*
Question Link:
https://leetcode.com/problems/compare-version-numbers/

Question:
Compare two version numbers.

Return:
1  -> version1 > version2
0  -> equal
-1 -> version1 < version2
*/

class Solution {

    /*
        Read one revision at a time.

        Missing revisions are treated as 0.

        Compare every revision until
        a difference is found.
    */
    public int compareVersion(String version1, String version2) {

        int i = 0;
        int j = 0;

        int n = version1.length();
        int m = version2.length();

        while(i < n || j < m) {

            long num1 = 0;
            long num2 = 0;

            while(i < n && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            while(j < m && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if(num1 < num2) {
                return -1;
            }

            if(num1 > num2) {
                return 1;
            }

            i++;
            j++;
        }

        return 0;
    }
}