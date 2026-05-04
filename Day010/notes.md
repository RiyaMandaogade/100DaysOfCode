# Day 010 — MEX Partition (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 800
- Topic: Math, MEX, Sets

## What the Problem Says
Find the minimum score over all valid partitions of a multiset,
where score = MEX (minimum excluded value) of each subset,
and all subsets in a valid partition must have the same MEX.

## Key Insight — The Answer is Always MEX(A)
Proof:
- For any valid partition with score m:
  → Every set has MEX = m
  → Every set contains 0..m-1 but NOT m
  → So m is NOT in A at all (not in any set)
  → And 0..m-1 ARE in A
  → Therefore MEX(A) = m exactly
- This means ALL valid partitions have the same score
- That score = MEX of the entire array A
- So just compute MEX of A directly

## What I Learned
- MEX is a powerful concept in competitive programming
- Sometimes "minimum over all partitions" = just one fixed value
- Proof by contradiction/construction helps simplify problems
- HashSet is efficient for MEX computation in Java

## Time Taken
~20 minutes

## Mistakes I Made
- Initially tried to simulate different partitions
- Overcomplicated it before realizing all valid partitions
  are forced to have the same score
