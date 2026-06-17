# Day 17 Notes

## Combination Sum

Core Idea:

* Take current number or skip it.
* Taking stays on same index because reuse is allowed.

Mental Trigger:
"Unlimited usage = stay."

Pattern:

* Backtracking

Time: Exponential

---

## Combination Sum II

Core Idea:

* Same as Combination Sum.
* Each element can be used only once.

Mental Trigger:
"Move forward after taking."

Important:

* Sort first.
* Skip duplicate starts.

Pattern:

* Backtracking

Time: Exponential

---

## Palindrome Partitioning

Core Idea:

* Try every possible cut.
* Continue only if current substring is palindrome.

Mental Trigger:
"Valid cut → recurse."

Pattern:

* Backtracking

Time: Exponential

---

## Kth Permutation Sequence

Core Idea:

* Each digit controls a block of permutations.

Mental Trigger:
"(n-1)! tells block size."

Important:

* Convert k to 0-based indexing.

Pattern:

* Factorial Number System

Time: O(n²)
