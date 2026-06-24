# Day 24 Notes

## Stack using Array

Core Idea:

* Insert and remove from one end only.

Mental Trigger:
"Top pointer."

Operations:
Push → ++top
Pop → top--
Peek → arr[top]

Time:
All operations → O(1)

---

## Queue using Array

Core Idea:

* Use Circular Queue.

Mental Trigger:
"Wrap around using modulo."

Formula:
rear = (rear + 1) % size
front = (front + 1) % size

Time:
All operations → O(1)

---

## Stack using Queue

Core Idea:

* Keep newest element at front.

Mental Trigger:
"Push is expensive."

Pattern:
Queue Rotation.

Complexity:
Push → O(n)
Pop → O(1)
Top → O(1)

---

## Queue using Stacks

Core Idea:

* Input stack stores new elements.
* Output stack serves old elements.

Mental Trigger:
"Reverse twice."

Pattern:
Lazy Transfer.

Complexity:
Push → O(1)
Pop → Amortized O(1)
Peek → Amortized O(1)

---

Big takeaway today:

Stack and Queue are simple data structures, but implementing one using the other helps understand why their order properties (LIFO/FIFO) work.
