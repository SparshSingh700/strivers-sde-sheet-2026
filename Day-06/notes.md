# Day 6 Notes

## Reverse Pairs

Core Idea:

* Modified inversion count problem.
* Use merge sort to efficiently count pairs.

Mental Trigger:
“Sorted halves help count valid pairs quickly.”

Important:

* Count before merge
* Condition:
  arr[left] > 2 * arr[right]

Pattern:

* Merge Sort
* Two Pointers

Time: O(n log n)
Space: O(n)

---

## Unique Paths

Core Idea:

* Current cell paths =
  top + left

Mental Trigger:
“Every path comes from either above or left.”

Important:

* First row and first column always have 1 path

Pattern:

* Dynamic Programming

Time: O(m*n)
Space: O(m*n)

---

## Majority Element II

Core Idea:

* More than n/3 frequency means at most 2 valid elements.

Mental Trigger:
“Different elements cancel each other.”

Important:

* First pass finds candidates
* Second pass verifies count

Pattern:

* Boyer Moore Voting Algorithm

Time: O(n)
Space: O(1)
