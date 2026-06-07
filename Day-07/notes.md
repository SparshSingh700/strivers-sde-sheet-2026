# Day 7 Notes

## Longest Consecutive Sequence

Core Idea:

* Use HashSet for O(1) lookup.
* Start counting only from sequence beginnings.

Mental Trigger:
“If previous number exists,
this cannot be sequence start.”

Pattern:

* Hashing

Time: O(n)
Space: O(n)

---

## Four Sum

Core Idea:

* Sort array first.
* Fix 2 numbers.
* Use two pointers for remaining pair.

Mental Trigger:
“Reduce 4-sum into controlled 2-sum.”

Important:

* Skip duplicates
* Use pruning to stop unnecessary work early

Pattern:

* Sorting
* Two Pointers

Time: O(n³)
Space: O(1) excluding output

---

## Two Sum

Core Idea:

* Store visited numbers in HashMap.
* Check if required number already exists.

Mental Trigger:
“Current number asks:
who do I need to reach target?”

Pattern:

* HashMap

Time: O(n)
Space: O(n)
