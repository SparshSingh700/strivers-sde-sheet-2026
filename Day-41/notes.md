# Day 41 Notes

## Construct BST from Preorder

Observation:

Preorder always visits:

Root → Left → Right

Maintain one global index.

Use an upper bound to determine whether the current value belongs to the current subtree.

No inorder traversal is needed.

Time:
O(n)

Space:
O(h)

---

## Validate BST

Observation:

Every node must satisfy a valid range.

Initially:

(-∞, +∞)

Left subtree:

(lowerBound, node.val)

Right subtree:

(node.val, upperBound)

Using ranges catches violations that parent-child comparisons alone cannot.

Time:
O(n)

Space:
O(h)

---

## Lowest Common Ancestor in BST

Observation:

Unlike a normal Binary Tree, BST ordering lets us move in only one direction.

If both nodes are:

- Smaller → Go Left
- Larger → Go Right

Otherwise, current node is the LCA.

Time:
O(h)

Space:
O(1)

---

## Predecessor & Successor

Observation:

Predecessor:

Largest value smaller than the key.

Successor:

Smallest value greater than the key.

Traverse like BST search while continuously updating the best candidate.

Time:
O(h)

Space:
O(1)

---

Today's takeaway:

Today's problems showed how much the BST property simplifies common tree operations. Instead of exploring both subtrees like a general binary tree, the ordering of values lets us make a single decision at each step, reducing many operations from O(n) to O(h).