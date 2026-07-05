# Day 35 Notes

## Tree Traversals using One Stack

Idea:

Instead of using three separate traversals, maintain a state for every node.

- State 1 → Preorder
- State 2 → Inorder
- State 3 → Postorder

The same stack simulates recursion and every node transitions through all three states.

Time:
O(n)

Space:
O(h)

---

## Root to Leaf Paths

Idea:

Carry the current path while performing DFS.

- Add current node.
- If leaf → store the path.
- Backtrack before returning.

Time:
O(n)

Space:
O(h)

---

## Vertical Order Traversal

Idea:

Perform BFS while storing:

Vertical → Level → Node Values

Use:

- TreeMap for sorted verticals.
- TreeMap for sorted levels.
- PriorityQueue when multiple nodes share the same position.

Time:
O(n log n)

Space:
O(n)

---

## Maximum Width of Binary Tree

Idea:

Treat the tree as a Complete Binary Tree.

Assign indices:

- Left = 2*i + 1
- Right = 2*i + 2

Normalize indices at every level to prevent overflow.

Width = Last Index − First Index + 1

Time:
O(n)

Space:
O(n)

---

Today's takeaway:

Today was more about understanding traversal techniques than solving many individual problems.

The one-stack traversal was especially interesting because a single state variable lets us generate preorder, inorder, and postorder together while simulating recursion iteratively.