class Solution {
    public void nextPermutation(int[] num) {
        int n = num.length;

        // Find the first decreasing element from right to left
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                ind = i;
                break;
            }
        }

        // If no such element is found, reverse the entire array
        if (ind == -1) {
            reverse(num, 0, n - 1);
        } else {
            // Find the smallest element to the right of ind but greater than num[ind]
            int smallestGreater = -1;
            for (int i = n - 1; i > ind; i--) {
                if (num[ind] < num[i]) {
                    smallestGreater = i;
                    break;
                }
            }

            // Swap num[ind] and num[smallestGreater]
            swap(num, ind, smallestGreater);

            // Reverse the subarray to the right of ind
            reverse(num, ind + 1, n - 1);
        }
    }

    private void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    private void reverse(int[] num, int start, int end) {
        while (start < end) {
            swap(num, start, end);
            start++;
            end--;
        }
    }
}

