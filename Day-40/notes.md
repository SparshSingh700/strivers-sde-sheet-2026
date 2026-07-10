# Day 40 Notes

## Populating Next Right Pointers

Observation:

The tree is **Perfect**, so every internal node has exactly two children.

For every node:

- Connect left child → right child.
- Connect right child → next node's left child.

No extra queue is required because the next pointers built on one level help traverse the next level.

Time:
O(n)

Space:
O(1)

---

## Search in a Binary Search Tree

Observation:

BST Property:

- Left subtree contains smaller values.
- Right subtree contains larger values.

Instead of searching both sides, move only toward the side where the value can exist.

Time:
O(h)

Space:
O(1)

---

## Convert Sorted Array to BST

Observation:

Choosing the middle element as the root keeps the tree balanced.

Recursively repeat the same process:

- Left half → Left subtree
- Right half → Right subtree

Time:
O(n)

Space:
O(h)

---

Today's takeaway:

Today's problems highlighted how powerful tree properties can be. The Perfect Binary Tree property removes the need for extra space when connecting next pointers, while the BST property reduces search from exploring the entire tree to following a single path. Building a balanced BST from a sorted array also showed how recursion naturally preserves balance by always choosing the middle element as the root.