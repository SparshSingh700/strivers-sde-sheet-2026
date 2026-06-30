# Day 30 Notes

## String to Integer (atoi)

Core Idea:
- Ignore leading spaces.
- Read optional sign.
- Build number digit by digit.
- Stop at first non-digit.
- Handle overflow early.

Mental Trigger:
"Parser simulation."

Pattern:
String Parsing.

Time: O(n)
Space: O(1)

---

## Longest Common Prefix

Core Idea:
- Use first string as reference.
- Compare characters vertically.

Mental Trigger:
"Column-wise comparison."

Example:

flower
flow
flight
^^
Prefix = fl

Pattern:
Vertical Scanning.

Time: O(n × m)
Space: O(1)

---

## Repeated String Match

Core Idea:
- Repeat until length >= target length.
- Check one extra repetition.

Mental Trigger:
"The answer can only be:
k or k + 1 repetitions."

Pattern:
String Construction.

Time: O((m+n)²) using indexOf internally.
Space: O(m+n)

---

Big takeaway today:

String questions often look messy because of edge cases.

The actual solutions were mostly:
- simulation,
- careful conditions,
- and handling boundaries correctly.