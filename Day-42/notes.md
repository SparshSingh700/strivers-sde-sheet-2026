# Day 42 Notes

## Floor in BST

Floor = Largest value ≤ key.

Move:
- Left if current value is too large.
- Right after storing a valid floor candidate.

Time:
O(h)

Space:
O(1)

---

## Ceil in BST

Ceil = Smallest value ≥ key.

Move:
- Right if current value is too small.
- Left after storing a valid ceil candidate.

Time:
O(h)

Space:
O(1)

---

## Kth Smallest in BST

BST inorder traversal produces nodes in sorted order.

Visit nodes using:

Left → Root → Right

The kth visited node is the answer.

Time:
O(h + k)
Worst: O(n)

Space:
O(h)

---

## Kth Largest in BST

Reverse inorder traversal gives nodes in descending order.

Visit:

Right → Root → Left

The kth visited node is the answer.

Time:
O(h + k)
Worst: O(n)

Space:
O(h)

---

Today's takeaway:

Today's problems highlighted one of the biggest advantages of a BST: its ordering property. Instead of traversing the whole tree, operations like floor, ceil, predecessor, successor, and kth element become much simpler by choosing the correct direction at every node.