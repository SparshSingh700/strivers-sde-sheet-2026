/*
Question Link:
https://leetcode.com/problems/kth-largest-element-in-a-stream/

Question:
Design a class that always returns
the kth largest element
after every insertion.
*/

class KthLargest {

    PriorityQueue<Integer> minHeap;
    int k;

    /*
        Maintain only
        the k largest elements.

        Heap top always stores
        the kth largest value.
    */
    public KthLargest(int k, int[] nums) {

        this.k = k;
        minHeap = new PriorityQueue<>();

        for(int num : nums){
            add(num);
        }
    }

    public int add(int val) {

        minHeap.offer(val);

        if(minHeap.size() > k){
            minHeap.poll();
        }

        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */