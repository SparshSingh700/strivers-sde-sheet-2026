# Day 29 Notes

## Reverse Words in a String

Core Idea:
- Traverse from right to left.
- Extract one word at a time.

Mental Trigger:
"Reverse the traversal, not the words."

Pattern:
Two Pointers.

Time:
O(n)

---

## Longest Palindromic Substring

Core Idea:
- Every palindrome has a center.

Centers:
1. Single character.
2. Gap between two characters.

Mental Trigger:
"Expand from the center."

Pattern:
Expand Around Center.

Time:
O(n²)
Space:
O(1)

---

## Roman to Integer

Core Idea:
- Traverse from right to left.

If:
current < previous
→ subtract.

Else:
→ add.

Mental Trigger:
"Smaller before bigger means subtraction."

Examples:

IV = 5 - 1
IX = 10 - 1
XL = 50 - 10

Pattern:
String Traversal.

Time:
O(n)

---

Big takeaway today:

String questions often become easier once you stop thinking character-by-character and instead think in terms of:

- Words
- Centers
- Patterns between neighbouring characters.