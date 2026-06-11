# Day 11 Notes

## Linked List Cycle

Core Idea:

* Fast moves twice as quickly as slow.
* If cycle exists, they must meet.

Mental Trigger:
“Runner on circular track eventually catches slower runner.”

Pattern:

* Floyd Cycle Detection
* Slow Fast Pointer

Time: O(n)
Space: O(1)

---

## Intersection of Two Linked Lists

Core Idea:

* Switch lists when reaching end.
* Both pointers travel equal total distance.

Mental Trigger:
“Equalize path lengths automatically.”

Important:

* No length calculation needed.

Pattern:

* Two Pointers

Time: O(n + m)
Space: O(1)

---

## Reverse Nodes in K Group

Core Idea:

* Reverse one k-sized block at a time.
* Reconnect reversed block to remaining list.

Mental Trigger:
“Normal reversal, but only inside group boundaries.”

Important:

* Find kth node first.
* Stop when fewer than k nodes remain.

Pattern:

* Linked List Reversal
* Pointer Manipulation

Time: O(n)
Space: O(1)
