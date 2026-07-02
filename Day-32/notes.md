# Day 32 Notes

## Valid Anagram

Core Idea:
- Count character frequencies.
- Increase for first string.
- Decrease for second string.

If every count becomes 0,
the strings are anagrams.

Mental Trigger:
"Same characters → Same frequencies."

Pattern:
Frequency Counting

Time:
O(n)

Space:
O(1) for lowercase English letters.

Alternative:
HashMap works for all Unicode characters.

---

## Count and Say

Core Idea:
Read the current string and
describe consecutive digits.

Example:

1

↓

11
(one 1)

↓

21
(two 1s)

↓

1211
(one 2 one 1)

Mental Trigger:
"Count consecutive characters."

Pattern:
Run Length Encoding (RLE)

Time:
O(total generated characters)

---

## Compare Version Numbers

Core Idea:
Compare one revision at a time.

Treat missing revisions as 0.

Example:

1.01
=
1.001

1.0
=
1.0.0

Mental Trigger:
"Split logically without using split()."

Pattern:
Two Pointers + Parsing

Time:
O(n + m)

Space:
O(1)

---

Big takeaway today:

Most string questions aren't difficult because of algorithms.

They're difficult because of careful parsing,
counting and handling edge cases correctly.