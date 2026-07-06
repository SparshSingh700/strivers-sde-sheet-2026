# Day 36 Notes

## Lowest Common Ancestor

Observation:

- If current node is p or q, return it.
- Search both subtrees.
- If both return non-null, current node is the Lowest Common Ancestor.
- Otherwise propagate the non-null answer upward.

Time:
O(n)

Space:
O(h)

---

## Same Tree

Observation:

Two trees are identical only if:

- Both nodes are null.
- Current values match.
- Left subtrees are identical.
- Right subtrees are identical.

Time:
O(n)

Space:
O(h)

---

## Zigzag Level Order Traversal

Observation:

Perform normal Level Order Traversal.

Instead of reversing every level afterward,
place each node directly into its correct position using:

Left → Right

or

Right → Left

Time:
O(n)

Space:
O(n)

---

## Boundary Traversal

Boundary consists of four parts:

1. Root
2. Left Boundary (excluding leaves)
3. All Leaf Nodes
4. Right Boundary in reverse (excluding leaves)

Keeping these four parts separate makes the implementation much cleaner.

Time:
O(n)

Space:
O(h)

---

Today's takeaway:

Today's questions reinforced recursive tree thinking. LCA and Same Tree were pure recursion problems, while Zigzag and Boundary Traversal combined traversal techniques with careful handling of tree structure.