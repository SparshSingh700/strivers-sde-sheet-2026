# Day 27 Notes

## Largest Rectangle in Histogram

Core Idea:
- Every bar acts as the height of a rectangle.
- Need Previous Smaller and Next Smaller.

Mental Trigger:
"When an element gets popped,
I finally know both its boundaries."

Pattern:
Monotonic Increasing Stack.

Time:
O(n)

---

## Sliding Window Maximum

Core Idea:
- Keep indices in decreasing order.
- Front always stores maximum.

Mental Trigger:
"Remove useless smaller elements."

Pattern:
Monotonic Deque.

Time:
O(n)

---

## Min Stack

Core Idea:
- Store encoded values whenever minimum changes.

Encoding:
encoded = 2 * val - min

Decoding:
previousMin = 2 * min - encoded

Mental Trigger:
"One stack, two pieces of information."

Pattern:
Stack + Mathematical Encoding.

Time:
All operations -> O(1)

---

## Rotting Oranges

Core Idea:
- All rotten oranges spread simultaneously.

Mental Trigger:
"Multiple BFS sources."

Pattern:
Multi-source BFS.

Time:
O(m × n)

---

Big takeaway today:

Today was all about realizing that stacks and queues are much more powerful than simple push/pop operations.

Monotonic Stack
→ Histogram.

Monotonic Deque
→ Sliding Window.

Queue + BFS
→ Rotting Oranges.

Even Min Stack turned into a math problem instead of a data structure problem.