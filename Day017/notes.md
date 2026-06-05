# Day 016 — Another Sorting Problem (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 1200
- Topic: DP, Greedy

## What the Problem Says
Add k to a chosen subsequence at most once.
Result must be non-decreasing. Determine if possible.

## How I Solved It
Label each element 0 (no add) or 1 (+k). For each
adjacent pair, derive constraints on k:
- (0→0): hard constraint a[i] ≤ a[i+1]
- (0→1): k ≥ a[i] - a[i+1]  (lower bound)
- (1→0): k ≤ a[i+1] - a[i]  (upper bound, must be ≥ 1)
- (1→1): hard constraint a[i] ≤ a[i+1]

DP state: (label at position i) → track (min lo, max hi)
Valid if lo ≤ hi at the end for any label.

## What I Learned
- Labeling problems reduce to range constraints on k
- DP with 2 states (label 0 or 1) tracking lo/hi range
- (1→0) transition requires a[i+1] > a[i] else impossible
- O(n) total work: 4 transitions per position
- Must use long — differences can be up to 10^9

## Time Taken
~50 minutes

## Mistakes I Made
- Initially overcomplicated with full Pareto front tracking
- Key insight: min lo and max hi from DP correctly capture
  the feasible k range
