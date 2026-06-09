# Day 020 — Disturbing Distribution (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 1200
- Topic: Greedy, Math

## What the Problem Says
Remove array elements by picking non-decreasing subsequences.
Each operation costs the product of chosen elements.
Minimize total cost. Answer mod 676767677.

## Key Insights
1. Elements ≥ 2: always keep alone. product(a,b) ≥ sum(a,b) for a,b ≥ 2
2. Element = 1: 1*x = x < 1+x, so attaching a 1 to any sequence is FREE
3. A 1 can attach to any element appearing AFTER it (by index)
4. 1s BEFORE the last non-1 element → always free (attach to non-1 ops)
5. 1s AFTER the last non-1 element → stranded, group together for cost=1
6. All 1s → one group costs 1 total

## Formula
min_cost = sum(all elements > 1) + (1 if any stranded 1s else 0)

## What I Learned
- For product minimization: combining ≥2 elements is never better
- 1s are "free riders" in any sequence (multiply by 1)
- Greedy: think about WHEN an element can be paired
- Stranded = no valid element after it in the original array
- With n,a[i] ≤ 100: max sum = 10,000 → MOD rarely changes answer

## Time Taken
~40 minutes

## Mistakes I Made
- Initially thought "group all 1s together" was optimal (costs 1)
  but pairing with non-1 elements costs 0, which is better!
- Forgot to check POSITIONAL constraints — 1s after last non-1
  can't pair with non-1 elements
