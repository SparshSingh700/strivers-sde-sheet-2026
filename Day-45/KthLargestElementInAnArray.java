/*
Question Link:
https://leetcode.com/problems/kth-largest-element-in-an-array/

Question:
Given an integer array,
return the kth largest element
without fully sorting the array.
*/

class Solution {

    /*
        Keep only k largest elements
        inside a Min Heap.

        If heap size exceeds k,
        remove the smallest element.

        Heap top is always
        the kth largest element.
    */
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.offer(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }
}