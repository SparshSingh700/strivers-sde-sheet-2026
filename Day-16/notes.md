# Day 16 Notes

## Coin Change

Core Idea:

* At every coin, choose:

  * Take it
  * Skip it

Mental Trigger:
"Unlimited coins = stay on same index after taking."

Pattern:

* DP
* Recursion + Memoization

Time: O(n × amount)

---

## Assign Cookies

Core Idea:

* Give the smallest valid cookie.

Mental Trigger:
"Don't waste large cookies on easy children."

Pattern:

* Greedy
* Two Pointers

Time: O(n log n)

---

## Subset Sums

Core Idea:

* Every element has two choices:

  * Take
  * Skip

Mental Trigger:
"Binary decision tree."

Pattern:

* Recursion
* Backtracking

Time: O(2ⁿ)

---

## Subsets II

Core Idea:

* Generate subsets normally.
* Skip duplicate starts at same recursion level.

Mental Trigger:
"Duplicates are only dangerous at the same depth."

Pattern:

* Backtracking

Time: O(2ⁿ)
