# Day 015 — Optimal Purchase (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 800
- Topic: Greedy, Math

## What the Problem Says
n students need access. Two key types:
- Individual key: costs a, covers 1 student
- Group key: costs b, covers up to 3 students
Find minimum total cost.

## How I Solved It
- Divide n into groups of 3 and remainder
- Full groups of 3: pay min(b, 3a) per group
- Remainder 1: pay min(b, a)
- Remainder 2: pay min(b, 2a)
- Key: group key can be used for fewer than 3 students,
  so always compare against actual students covered

## What I Learned
- Greedy: always take the cheaper option per unit
- Group key for 1 student vs individual: just compare b vs a
- Group key for 2 vs 2 individual: compare b vs 2a
- MUST use long — n=10^8, a=10^8 → cost up to 10^16
  which overflows int (max ~2×10^9) and even regular long
  arithmetic needs care
- n/3 groups and n%3 remainder is the clean decomposition

## Time Taken
~10 minutes

## Mistakes I Made
- Almost used int instead of long (would overflow on
  test case 5 with n=10^8, a=100)
