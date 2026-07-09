# Day 39 Notes

## Symmetric Binary Tree

Observation:

A tree is symmetric if its left subtree is the mirror image of its right subtree.

Compare:

- left.left ↔ right.right
- left.right ↔ right.left

Time:
O(n)

Space:
O(h)

---

## Flatten Binary Tree to Linked List

Observation:

Reverse preorder traversal:

Right → Left → Root

Maintain one pointer (`prev`) that always points to the previously processed node.

Each node simply connects to `prev`.

Time:
O(n)

Space:
O(h)

---

## Children Sum Property

Observation:

Every non-leaf node should satisfy:

Node = Left Child + Right Child

Leaf nodes are always valid.

Check the current node first, then recursively verify both subtrees.

Time:
O(n)

Space:
O(h)

---

Extra:

The GFG problem "Check for Symmetrical BTs" is the same concept as LeetCode's "Symmetric Binary Tree", so solving one directly covers the other.