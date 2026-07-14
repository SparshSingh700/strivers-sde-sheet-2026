# Day 44 Notes

## Binary Tree to Doubly Linked List

Observation:

Perform an inorder traversal.

Maintain:

- prev → previously visited node
- head → first node of the DLL

While visiting each node:

- prev.right = current
- current.left = prev

Time:
O(n)

Space:
O(h)

---

## Find Median from Data Stream

Observation:

Maintain two heaps:

- Max Heap → Smaller half
- Min Heap → Larger half

Balance after every insertion.

Median:

- Equal sizes → average of both tops
- Otherwise → top of max heap

Time:

addNum():
O(log n)

findMedian():
O(1)

Space:
O(n)

---

## Kth Largest Element in a Stream

Observation:

Maintain a Min Heap of size exactly k.

Whenever heap size exceeds k:

Remove the smallest element.

Heap top always represents the kth largest element.

Time:

add():
O(log k)

Space:
O(k)

---

Today's takeaway:

Today's problems were centered around maintaining ordered data efficiently. Converting a tree to a DLL reused inorder traversal with pointer manipulation, while both stream problems relied on heaps to answer queries without recomputing everything from scratch. The key idea was maintaining the right data structure so each operation stayed efficient.