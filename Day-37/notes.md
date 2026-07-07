# Day 37 Notes

## Level Order Traversal

Idea:

Perform Breadth First Search (BFS).

Store nodes level by level by processing exactly the current queue size before moving to the next level.

Time:
O(n)

Space:
O(n)

---

## Maximum Depth of Binary Tree

Idea:

Height of a node is:

max(left subtree height, right subtree height) + 1

The answer is simply the height of the root.

Time:
O(n)

Space:
O(h)

---

## Diameter of Binary Tree

Observation:

The diameter passing through a node is:

Height of Left Subtree + Height of Right Subtree

While recursively computing subtree heights, update the maximum diameter seen so far.

This avoids calculating heights multiple times.

Time:
O(n)

Space:
O(h)

---

## Balanced Binary Tree

Observation:

Instead of calculating height separately for every node,

return:

- subtree height if balanced
- -1 immediately if an imbalance is found

This avoids unnecessary recursion once the tree is already known to be unbalanced.

Time:
O(n)

Space:
O(h)

---

Today's takeaway:

Today's questions all revolved around one recurring concept: tree height.

The same recursive height calculation can solve very different problems—finding the maximum depth, computing the diameter, and checking whether the tree is balanced—with only a small change in what we do after calculating the left and right subtree heights.