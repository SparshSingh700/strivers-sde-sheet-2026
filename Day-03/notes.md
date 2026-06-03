# Day 3 Notes

## Rotate Image

Core Idea:

* Rotate matrix clockwise in-place using:

  1. Transpose
  2. Reverse every row

Mental Trigger:
“Rows become columns, then mirror horizontally.”

Flow:

1. Swap arr[i][j] with arr[j][i]
2. Reverse each row using two pointers

Important:

* Transpose only lower triangle (j < i)
* Otherwise elements swap twice and matrix becomes same again

Pattern:

* Matrix manipulation
* In-place transformation

Time: O(n²)
Space: O(1)

---

## Merge Intervals

Core Idea:

* Sort intervals first.
* Keep one active interval:
  [curStart, curEnd]

Mental Trigger:
“Can next interval merge into current one?”

Flow:

1. Sort by start value
2. If overlap:
   nextStart <= curEnd
   → extend curEnd
3. Else:
   save current interval
   start new interval

Important:

* Last interval remains unsaved after loop, add separately

Pattern:

* Sorting + Greedy

Time: O(n log n)
Space: O(n)

---

## Merge Sorted Arrays

Core Idea:

* Fill nums1 from the BACK.
* Avoid shifting elements repeatedly.

Mental Trigger:
“Largest element should occupy last free position first.”

Pointers:

* p1 → nums1 valid elements
* p2 → nums2 elements
* p → final placement index

Flow:

1. Compare nums1[p1] and nums2[p2]
2. Place larger element at nums1[p]
3. Move pointers backward

Important:

* Only remaining nums2 elements need copying
* nums1 leftovers are already correctly placed

Pattern:

* Two pointers

Time: O(m + n)
Space: O(1)
