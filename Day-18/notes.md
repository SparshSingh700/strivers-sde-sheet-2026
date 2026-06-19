# Day 18 Notes

## Permutations

Core Idea:

* Fix one position.
* Try every remaining element there.
* Backtrack and restore array.

Mental Trigger:
"Choose who stands at current position."

Pattern:

* Backtracking
* Swap Technique

Time: O(n! × n)

---

## N Queens

Core Idea:

* Place one queen per column.
* Check whether current position is safe.

Mental Trigger:
"Try, validate, backtrack."

Important:

* Check left row
* Upper diagonal
* Lower diagonal

Pattern:

* Backtracking

Time: Exponential

---

## Sudoku Solver

Core Idea:

* Find an empty cell.
* Try all valid digits.
* Backtrack when stuck.

Mental Trigger:
"Fill one box, solve the rest."

Important:

* Row check
* Column check
* 3×3 box check

Pattern:

* Backtracking

Time: Exponential
