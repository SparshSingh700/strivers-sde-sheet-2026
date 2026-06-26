# Day 26 Notes

## Next Smaller Element

Core Idea:
- Process from right to left.
- Maintain increasing stack.

Mental Trigger:
"Remove everything that cannot become my answer."

Pattern:
Monotonic Stack.

Time:
O(n)

---

## LRU Cache

Core Idea:
Need O(1):

1. Access by key.
2. Remove node.
3. Move node to front.

Data Structures:
HashMap + Doubly Linked List.

Mental Trigger:
"Map gives node.
DLL gives ordering."

Most Recently Used:
head.next

Least Recently Used:
tail.prev

Pattern:
HashMap + DLL.

Time:
get() -> O(1)
put() -> O(1)

---

## LFU Cache

Core Idea:
Evict:
1. Least Frequently Used.
2. If tie, Least Recently Used.

Data Structures:

HashMap<Key, Node>
HashMap<Frequency, DLL>

Mental Trigger:
"LRU inside every frequency."

Need:
minFreq

because when cache becomes full,
we must instantly know which frequency to remove.

Pattern:
HashMap + Multiple DLLs.

Time:
get() -> O(1)
put() -> O(1)

---

Big takeaway today:

LFU is basically:

LRU + Frequency management.

The hard part isn't coding the DLL.

The hard part is keeping:
- cache
- frequency lists
- minFreq

all perfectly synchronized.
