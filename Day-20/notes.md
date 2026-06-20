# Day 20 Notes

## Matrix Median

Core Idea:

* Binary search on values, not positions.

Mental Trigger:
"Guess median value, count elements ≤ it."

Important:

* Use upperBound on every row.

Pattern:

* Binary Search on Answer

Time: O(rows × log(cols) × log(valueRange))

---

## Search In Rotated Sorted Array

Core Idea:

* One half is always sorted.

Mental Trigger:
"Find sorted half first."

Pattern:

* Binary Search

Time: O(log n)

---

## Single Element In Sorted Array

Core Idea:

* Single element breaks pair pattern.

Mental Trigger:
"Check whether pair alignment is still correct."

Pattern:

* Binary Search

Time: O(log n)

---

## Sqrt(x)

Core Idea:

* Search answer instead of computing root.

Mental Trigger:
"mid² compared to x."

Pattern:

* Binary Search on Answer

Time: O(log x)
