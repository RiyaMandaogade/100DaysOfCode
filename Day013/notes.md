# Day 013 — Prefix Max (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 800
- Topic: Brute Force, Arrays, Prefix Maximum

## What the Problem Says
Given array a, value = sum of prefix maximums.
Perform at most one swap of any two elements.
Maximize the value.

## How I Solved It
- Constraints: n ≤ 50, a[i] ≤ 10^4 → tiny!
- Brute force all O(n²) possible swaps
- Also consider no swap (swap 0 times)
- For each, compute prefix max sum in O(n)
- Total complexity: O(n³) = 125,000 ops max → very fast

## Value Computation
- Track running maximum while iterating
- Add running max to sum at each position
- Example: [1,2,1] → max=1,2,2 → sum=5

## What I Learned
- Always check constraints first — small n means brute force wins
- O(n³) with n=50 is only 125,000 operations, trivially fast
- Swap and swap-back pattern keeps code clean (no array copy needed)
- "At most one swap" includes zero swaps — always try no-swap too
- Prefix max problems: just track running maximum

## Time Taken
~10 minutes

## Mistakes I Made
- Almost tried to find a greedy solution before checking
  constraints — n ≤ 50 screams brute force!
