# Day 34 Notes

## Morris Preorder Traversal

Idea:
- Visit current node first.
- If left child exists, create a temporary thread from its inorder predecessor back to the current node.
- Traverse left subtree.
- Remove the thread when returning.

Time:
O(n)

Space:
O(1)

---

## Right Side View

Observation:
- Traverse Root → Right → Left.
- The first node visited at every depth is visible from the right side.

Time:
O(n)

Space:
O(h)

---

## Top View

Observation:
- Perform Level Order Traversal.
- Track Horizontal Distance (HD).
- Store only the first node seen at every HD.

Data Structures:
- Queue
- TreeMap

Time:
O(n log n)

Space:
O(n)

---

## Bottom View

Observation:
- Perform Level Order Traversal.
- Track Horizontal Distance (HD).
- Keep updating the node for every HD.
- The last node stored becomes the bottom view.

Data Structures:
- Queue
- TreeMap

Time:
O(n log n)

Space:
O(n)

---

Today's takeaway:

Today's problems revolved around viewing the same binary tree from different perspectives.

Also learned Morris Preorder Traversal, which extends the threading idea from inorder traversal to achieve preorder traversal in O(1) auxiliary space.