# Day 12 Notes

## Linked List Cycle II

Core Idea:

* First detect cycle.
* Then locate cycle start.

Mental Trigger:
“Meeting point is not cycle start.
Reset one pointer and walk together.”

Pattern:

* Floyd Cycle Detection

Time: O(n)
Space: O(1)

---

## Palindrome Linked List

Core Idea:

* Split list into two halves.
* Reverse second half.
* Compare values.

Mental Trigger:
“Palindrome check becomes two-list comparison.”

Important:

* Skip middle node for odd length lists

Pattern:

* Slow Fast Pointer
* Linked List Reversal

Time: O(n)
Space: O(1)

---

## Flatten Linked List

Core Idea:

* Flatten right side first.
* Merge current list with flattened result.

Mental Trigger:
“Repeated merge of sorted bottom lists.”

Important:

* Use bottom pointers, not next pointers

Pattern:

* Recursion
* Merge Two Sorted Lists

Time: O(N*M) approx depending on structure
Space: Recursive stack
