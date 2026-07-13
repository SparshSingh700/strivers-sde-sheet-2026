# Day 43 Notes

## BST Iterator

Store the complete left boundary in a stack.

next():
- Pop the smallest node.
- Push the left boundary of its right subtree.

Time:
- next(): Amortized O(1)
- hasNext(): O(1)

Space:
O(h)

---

## Two Sum IV - Input is a BST

Instead of converting the BST into an array:

- Iterator 1 gives the next smallest element.
- Iterator 2 gives the next largest element.

This simulates the two-pointer approach directly on the BST.

Time:
O(n)

Space:
O(h)

---

## Serialize and Deserialize Binary Tree

Serialize:
Level Order Traversal

Store null nodes using "#".

Deserialize:
Read values level by level and reconstruct children.

Time:
O(n)

Space:
O(n)

---

## Maximum Sum BST in Binary Tree

Each subtree returns:

- Minimum value
- Maximum value
- Sum of the subtree

If:

left.max < node < right.min

then the subtree is a valid BST.

Otherwise return an invalid range so ancestors also fail the BST check.

Time:
O(n)

Space:
O(h)

---

Today's takeaway:

Today's problems combined several BST concepts. The BST Iterator showed how inorder traversal can be performed lazily with a stack, which naturally extended to solving Two Sum in a BST using two iterators. The serialization problem focused on preserving tree structure, while Maximum Sum BST introduced the idea of returning multiple pieces of information from each recursive call to validate and compute subtree properties in a single traversal.