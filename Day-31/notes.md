# Day 31 Notes

## Z Function

Core Idea:
- Create:
  pattern + "$" + text
- Build Z-array.
- Wherever Z[i] = pattern length,
  pattern exists there.

Mental Trigger:
"Reuse previously matched prefix."

Pattern:
String Matching

Time:
O(n + m)

---

## KMP Algorithm / LPS Array

Today's Solution:
- Brute Force

Optimal:
- KMP (LPS Array)

Core Idea:
If mismatch occurs after matching some characters,
don't restart from the beginning.

LPS tells us the longest proper prefix
which is also a suffix,
allowing us to reuse previous matches.

Mental Trigger:
"Don't compare characters twice."

Time:
O(n + m)

---

## Minimum Insertions to Make String Palindrome

Core Idea:

Minimum Insertions =
Length − Longest Palindromic Subsequence

LPS =
LCS(string, reverse(string))

Mental Trigger:
"Palindrome → Reverse → LCS"

Pattern:
DP on Strings

Time:
O(n²)

Space:
O(n²)

---

Big takeaway today:

Pattern matching has multiple approaches.

Brute Force works for small inputs,
while Z Function and KMP avoid unnecessary comparisons and achieve linear time.