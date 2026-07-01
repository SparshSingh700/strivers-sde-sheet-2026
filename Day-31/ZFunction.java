/*
Question Link:
https://www.geeksforgeeks.org/problems/search-pattern-z-algorithm--141631/1

Question:
Implement the Z Function
to search a pattern in a text.
*/

class Solution {

    /*
        Create:
        pattern + "$" + text.

        Build the Z-array.

        Whenever Z[i] equals
        pattern length,
        pattern starts there.
    */
    ArrayList<Integer> search(String pat, String txt) {

        String s = pat + "$" + txt;

        int n = s.length();
        int m = pat.length();

        int[] z = new int[n];

        int left = 0;
        int right = 0;

        // Build Z-array.
        for(int i = 1; i < n; i++) {

            if(i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }

            while(i + z[i] < n &&
                  s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }

            if(i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(z[i] == m) {
                ans.add(i - m - 1);
            }
        }

        return ans;
    }
}