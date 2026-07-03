# Day 33 Notes

## Inorder Traversal

Order:

Left → Root → Right

Recursive:
- Most common.
- Uses recursion stack.

Morris:
- No recursion.
- No stack.
- Uses temporary threads.
- Restores tree afterwards.

Mental Trigger:

"Visit node after finishing left subtree."

Time:
O(n)

Space:
Recursive : O(h)

Morris : O(1)

---

## Preorder Traversal

Order:

Root → Left → Right

Mental Trigger:

"Visit immediately."

Time:
O(n)

Space:
O(h)

---

## Postorder Traversal

Order:

Left → Right → Root

Mental Trigger:

"Visit after both children."

Time:
O(n)

Space:
O(h)

---

Today's takeaway:

Today's focus wasn't difficult algorithms,
but strengthening tree traversal fundamentals.

Also learned Morris Traversal,
which performs inorder traversal
without recursion or an explicit stack.