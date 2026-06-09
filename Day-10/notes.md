# Day 10 Notes

## Delete Node in Linked List

Core Idea:

* Copy next node into current node.
* Skip next node.

Mental Trigger:
“Cannot delete current node directly,
so transform it into next node.”

Pattern:

* Linked List Manipulation

Time: O(1)
Space: O(1)

---

## Remove Nth Node From End

Core Idea:

* Keep gap of n nodes
  between slow and fast.

Mental Trigger:
“When fast reaches end,
slow reaches node before target.”

Important:

* Handle first node deletion separately

Pattern:

* Slow Fast Pointer

Time: O(n)
Space: O(1)

---

## Add Two Numbers

Core Idea:

* Add digits like normal addition.
* Carry moves forward.

Mental Trigger:
“Digit-by-digit simulation.”

Important:

* Continue while carry exists
* Dummy node simplifies list creation

Pattern:

* Linked List Simulation

Time: O(max(n,m))
Space: O(1) excluding output
