# Day 014 — Construct an Array (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 800
- Topic: Construction, Math

## What the Problem Says
Build array of n integers where:
- Each element is between 1 and 2n
- All n elements AND all n-1 adjacent sums are pairwise distinct
(2n-1 values must all be different)

## How I Solved It
Construction: use [n+1, n+2, n+3, ..., 2n]

Why it works:
1. All elements in range [1, 2n] ✓
2. All elements are consecutive → pairwise distinct ✓
3. Adjacent sums: (n+1)+(n+2), (n+2)+(n+3), ...
   - Smallest sum = (n+1)+(n+2) = 2n+3 > 2n
   - So ALL sums are strictly greater than ALL elements
   - Therefore sums never collide with elements ✓
4. Sums form a strictly increasing arithmetic sequence
   (each sum is 2 more than previous) → all sums distinct ✓

## What I Learned
- Construction problems: think about invariants that
  guarantee no collisions
- Separating elements and sums into non-overlapping value
  ranges is a powerful technique
- The upper half [n+1..2n] forces all sums above 2n,
  completely separating the two sets
- Always verify construction mathematically, not just on examples

## Time Taken
~20 minutes

## Mistakes I Made
- First tried [2n, 1, 2, ..., n-1] but sums collided
  with small elements (e.g. sum 3 = element 3)
- Second tried [1, 2, ..., 2n] same issue
- Key insight: put all elements in UPPER half so sums
  are pushed even higher, never overlapping elements
