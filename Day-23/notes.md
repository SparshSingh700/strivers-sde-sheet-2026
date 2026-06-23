# Day 23 Notes

## Find Median From Data Stream

Core Idea:

* Split numbers into two halves.

Heaps:

* Max Heap → smaller half
* Min Heap → larger half

Invariant:
left.size() == right.size()
OR
left.size() == right.size() + 1

Median:

* Even → average of both tops.
* Odd → top of left heap.

Pattern:
Two Heaps.

Time:
addNum() → O(log n)
findMedian() → O(1)

---

## Merge K Sorted Arrays

Core Idea:

* Keep the smallest unused element from every row inside a heap.

Mental Trigger:
"K pointers using a heap."

Pattern:
Min Heap + K-way Merge.

Time:
O(NK log K)

---

## Top K Frequent Elements

Core Idea:

* Count frequencies.
* Maintain only k best candidates.

Mental Trigger:
"Min heap of size k."

Pattern:
HashMap + Heap.

Time:
O(n log k)

---

Big takeaway today:

Heap questions usually fall into three buckets:

1. Maintain order dynamically.
2. Merge multiple sorted structures.
3. Keep only the top k candidates.
