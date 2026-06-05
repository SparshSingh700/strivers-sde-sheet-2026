# Day 5 Notes

## Search a 2D Matrix

Core Idea:

* Treat matrix as one sorted 1D array.
* Apply normal binary search.

Mental Trigger:
“Flatten matrix virtually without actually creating array.”

Flow:

1. Binary search on indices from 0 → m*n-1
2. Convert mid into:
   row = mid / n
   col = mid % n

Important:

* Division gives row
* Modulus gives column

Pattern:

* Binary Search

Time: O(log(m*n))
Space: O(1)

---

## Majority Element

Core Idea:

* Same element strengthens candidate.
* Different element cancels it out.

Mental Trigger:
“Majority element survives all cancellations.”

Flow:

1. Keep candidate + count
2. Same element → count++
3. Different element → count--
4. If count becomes 0 → choose new candidate

Important:

* Majority element appears more than n/2 times

Pattern:

* Boyer Moore Voting Algorithm

Time: O(n)
Space: O(1)

---

## Pow(x, n)

Core Idea:

* Reduce exponent quickly using repeated squaring.

Mental Trigger:
“Half the power at every step.”

Flow:

1. If power odd:
   multiply answer once
2. Square current number
3. Divide power by 2

Important:

* Negative powers:
  x = 1/x
* Use long for n to avoid overflow

Pattern:

* Binary Exponentiation

Time: O(log n)
Space: O(1)
