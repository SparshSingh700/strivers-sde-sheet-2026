# Day 38 Notes

## Binary Tree Maximum Path Sum

Observation:

A path can start and end at any node.

For every node:

Maximum Path =
Left Gain + Current Node + Right Gain

Negative paths are ignored because they only reduce the answer.

While returning to the parent,
only one side (left or right) can be extended.

Time:
O(n)

Space:
O(h)

---

## Construct Binary Tree from Preorder + Inorder

Observation:

Preorder always gives the root first.

Inorder tells where that root lies,
splitting the tree into:

- Left Subtree
- Right Subtree

A HashMap stores inorder indices to avoid repeated searching.

Time:
O(n)

Space:
O(n)

---

## Construct Binary Tree from Inorder + Postorder

Observation:

Postorder gives the root last.

Since we process postorder from the end,

Order becomes:

Root → Right → Left

Therefore,

build the Right subtree before the Left subtree.

Again, a HashMap gives O(1) inorder lookup.

Time:
O(n)

Space:
O(n)

---

Today's takeaway:

Today's reconstruction problems highlighted how different traversals reveal different pieces of information. Preorder immediately identifies the root from the beginning, while postorder identifies it from the end. Once the root is known, inorder naturally divides the remaining nodes into left and right subtrees, making the recursive construction straightforward.