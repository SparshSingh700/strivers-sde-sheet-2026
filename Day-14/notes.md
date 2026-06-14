# Day 14 Notes

## Remove Duplicates From Sorted Array

Core Idea:

* Array is already sorted.
* Unique elements appear when current value differs from previous value.

Mental Trigger:
"j searches, i writes."

Important:

* i always points to next position for unique element.

Pattern:

* Two Pointers

Time: O(n)
Space: O(1)

---

## Trapping Rain Water

Core Idea:

* Water depends on smaller boundary.

Mental Trigger:
"Smaller wall decides water level."

Important:

* Maintain leftMax and rightMax.
* Move side with smaller maximum height.

Pattern:

* Two Pointers

Time: O(n)
Space: O(1)

---

## Max Consecutive Ones

Core Idea:

* Count current streak of 1s.
* Reset when 0 appears.

Mental Trigger:
"0 breaks streak."

Pattern:

* Array Traversal

Time: O(n)
Space: O(1)
