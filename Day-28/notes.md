# Day 28 Notes

## Online Stock Span

Core Idea:
- Find Previous Greater Element.

Mental Trigger:
"How far can I extend to the left?"

Pattern:
Monotonic Decreasing Stack.

Store:
(price, index)

Formula:
span = currentIndex - previousGreaterIndex

Time:
O(n)

---

## Maximum of Minimum for Every Window Size

Core Idea:
Treat every element as the minimum.

Find:
1. Previous Smaller Element
2. Next Smaller Element

This gives:

largestWindow =
NSE - PSE - 1

Then:

answer[largestWindow] =
max(answer[largestWindow], arr[i])

Some window sizes remain empty,
so fill from right to left.

Mental Trigger:
"Every element contributes to one window size."

Pattern:
Monotonic Stack.

Time:
O(n)

---

## Celebrity Problem

Core Idea:
One comparison removes one candidate.

If A knows B:
A cannot be celebrity.

Else:
B cannot be celebrity.

After elimination,
verify the final candidate.

Mental Trigger:
"Eliminate one person every comparison."

Pattern:
Two Pointers / Candidate Elimination.

Time:
O(n)

---

Big takeaway today:

Monotonic stack problems are becoming easier because the questions now feel like variations of:

Previous Greater
Previous Smaller
Next Greater
Next Smaller

The hard part is usually figuring out what the stack should represent.