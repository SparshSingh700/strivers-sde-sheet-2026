# Day 9 Notes

## Reverse Linked List

Core Idea:

* Reverse links one by one.

Mental Trigger:
“Current node should point backward.”

Important:

* Save next node before changing links

Pattern:

* Linked List Reversal

Time: O(n)
Space: O(1)

---

## Middle of Linked List

Core Idea:

* Slow moves 1 step
* Fast moves 2 steps

Mental Trigger:
“When fast reaches end,
slow reaches middle.”

Pattern:

* Slow Fast Pointer

Time: O(n)
Space: O(1)

---

## Merge Two Sorted Lists

Core Idea:

* Compare nodes from both lists.
* Attach smaller node each time.

Mental Trigger:
“Build merged list gradually.”

Important:

* Attach remaining list directly at end

Pattern:

* Two Pointers
* Linked List Manipulation

Time: O(n + m)
Space: O(1)
