/*
Question Link:
https://leetcode.com/problems/reverse-pairs/

Question:
Count pairs (i, j) such that:
i < j and nums[i] > 2 * nums[j].
*/

class Solution {

    /*
    Reverse Pairs is a modified inversion count problem.

    Before merging two sorted halves:
    count pairs where:
    left element > 2 * right element

    Since halves are sorted,
    use two pointers for efficient counting.
    */

    public int reversePairs(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int[] arr, int low, int high) {

        int cnt = 0;

        if (low >= high) return cnt;

        int mid = low + (high - low) / 2;

        cnt += mergeSort(arr, low, mid);

        cnt += mergeSort(arr, mid + 1, high);

        cnt += countPairs(arr, low, mid, high);

        merge(arr, low, mid, high);

        return cnt;
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {

        int cnt = 0;

        int right = mid + 1;

        for (int left = low; left <= mid; left++) {

            while (right <= high &&
                    arr[left] > 2L * arr[right]) {

                right++;
            }

            cnt += right - (mid + 1);
        }

        return cnt;
    }

    public static void merge(int[] arr,
                             int low,
                             int mid,
                             int high) {

        int left = low;
        int right = mid + 1;

        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {

                temp.add(arr[left++]);

            } else {

                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}