/*
Question Link:
https://leetcode.com/problems/find-median-from-data-stream/

Question:
Design a data structure that
supports adding numbers
and finding the median
at any time.
*/

class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianFinder() {

        // Max Heap -> Smaller half.
        left = new PriorityQueue<>((a, b) -> b - a);

        // Min Heap -> Larger half.
        right = new PriorityQueue<>();
    }

    /*
        Keep smaller half in a max heap
        and larger half in a min heap.

        Balance the heaps after every insertion.
    */
    public void addNum(int num) {

        if(left.isEmpty() || num <= left.peek()){
            left.offer(num);
        }
        else{
            right.offer(num);
        }

        if(left.size() > right.size() + 1){
            right.offer(left.poll());
        }
        else if(right.size() > left.size()){
            left.offer(right.poll());
        }
    }

    /*
        If both heaps have equal size,
        median is the average.

        Otherwise,
        max heap contains one extra element.
    */
    public double findMedian() {

        if(left.size() == right.size()){
            return (left.peek() + right.peek()) / 2.0;
        }

        return left.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */