# Day 22 Notes

## Max Heap

Core Idea:

* Parent is always greater than children.

Formulas:

* Parent = (i - 1) / 2
* Left Child = 2*i + 1
* Right Child = 2*i + 2

Operations:

* Insert → Heapify Up
* Extract Max → Heapify Down
* Build Heap → Heapify from last non-leaf node.

Mental Trigger:
"Heap = Complete Binary Tree + Heap Property."

---

## Kth Largest Element

Core Idea:

* Keep only k largest elements.

Mental Trigger:
"Min heap of size k."

Pattern:

* Heap

Time:
O(n log k)

---

## Top K Sum Pairs

Core Idea:

* Largest sums lie near bottom-right corner after sorting.

Mental Trigger:
"Think of matrix of sums."

Pattern:

* Max Heap + Visited Set.

Time:
O(k log k)

---

Big takeaway today:

1. Implement Heap yourself.
2. Then use Heap to solve problems efficiently.
