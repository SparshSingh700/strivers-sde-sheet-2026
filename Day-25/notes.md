# Day 25 Notes

## Valid Parentheses

Core Idea:
- Push expected closing brackets instead of opening brackets.

Mental Trigger:
"Stack stores what I expect to see next."

Pattern:
Stack.

Time: O(n)
Space: O(n)

---

## Next Greater Element I

Core Idea:
- Process from right to left.
- Maintain decreasing stack.

Mental Trigger:
"Remove everything that cannot be my answer."

Pattern:
Monotonic Stack.

Time: O(n)
Space: O(n)

---

## Sort a Stack

Core Idea:
- Recursively sort smaller stack.
- Insert removed element back in sorted order.

Mental Trigger:
"Sort while backtracking."

Pattern:
Recursion + Stack.

Time: O(n²)
Space: O(n)

---

Big takeaway today:

Stacks are not just for push/pop problems.

They are extremely useful for:
1. Matching problems.
2. Next Greater/Smaller problems.
3. Recursive backtracking problems.