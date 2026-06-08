# Day 8 Notes

## Subarray XOR Equals K

Core Idea:

* Use Prefix XOR.
* Store frequencies of previous XOR values.

Mental Trigger:
“If currentXor ^ previousXor = k,
then subarray XOR becomes k.”

Important:

* XOR properties:
  a ^ a = 0
  a ^ 0 = a

Pattern:

* Prefix XOR
* HashMap

Time: O(n)
Space: O(n)

---

## Longest Substring Without Repeating Characters

Core Idea:

* Maintain sliding window with unique characters.

Mental Trigger:
“Move left pointer only when duplicate appears.”

Important:

* Store latest index of characters
* Never move left backward

Pattern:

* Sliding Window
* HashMap

Time: O(n)
Space: O(n)

---

## Longest Subarray With Sum K

Core Idea:

* Use Prefix Sum.
* If:
  currentSum - previousSum = k
  then subarray sum = k.

Mental Trigger:
“Current prefix asks:
have we already seen the needed sum?”

Important:

* Store first occurrence only
  for maximum length

Pattern:

* Prefix Sum
* HashMap

Time: O(n)
Space: O(n)
