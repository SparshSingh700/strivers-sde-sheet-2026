# Day 13 Notes

## Copy List With Random Pointer

Core Idea:

* Interleave copied nodes with original nodes.
* Use original structure to connect random pointers.

Mental Trigger:
“Insert copies between originals, then use neighbors.”

Pattern:

* Linked List Manipulation

Time: O(n)
Space: O(1)

---

## Three Sum

Core Idea:

* Sort array.
* Fix one element.
* Use two pointers for remaining two elements.

Mental Trigger:
“Convert 3-sum into repeated 2-sum.”

Important:

* Skip duplicates on all sides

Pattern:

* Sorting
* Two Pointers

Time: O(n²)
Space: O(1) excluding output

---

## Rotate List

Core Idea:

* Convert list into a circle.
* Break it at the correct position.

Mental Trigger:
“Rotation becomes finding a new tail.”

Important:

* k can be larger than list size
* Use k % length

Pattern:

* Linked List Traversal

Time: O(n)
Space: O(1)
