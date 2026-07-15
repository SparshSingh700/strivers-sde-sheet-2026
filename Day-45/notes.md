# Day 45 Notes

## Flood Fill

Observation:

Start DFS (or BFS) from the source cell.

Only visit cells having the original color.

Recolor the current cell and continue in all four directions.

Time:
O(m × n)

Space:
O(m × n) (Recursion stack)

---

## Kth Largest Element in an Array

Observation:

Maintain a Min Heap of size k.

Whenever heap size exceeds k,
remove the smallest element.

The heap top always represents
the kth largest element.

Time:
O(n log k)

Space:
O(k)

---

## Count Distinct Elements in Every Window

Observation:

Use a sliding window with a HashMap.

HashMap stores:
Element → Frequency

For every window:

- Remove outgoing element
- Add incoming element

HashMap size equals the number of distinct elements.

Time:
O(n)

Space:
O(k)

---

Today's takeaway:

Today's problems focused on recognizing the right data structure for the job. Flood Fill is a straightforward graph traversal using DFS, Kth Largest is naturally handled with a fixed-size Min Heap, and counting distinct elements efficiently comes from combining a sliding window with a frequency map.