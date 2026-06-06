# Day 018 — Absolute Cinema (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 1200
- Topic: Greedy, Math

## What the Problem Says
Two arrays a and b. Can swap a[i] and b[i] freely.
Maximize max(a) + sum(b).

## Key Insight
For each pair, let hi=max(a[i],b[i]), lo=min(a[i],b[i]).

Objective = max(a) + sum(b)
          = total_sum + max(a) - sum(a)

To maximize max(a) - sum(a):
- Let j = position achieving max(a)
- max(a) - sum(a) = -sum of all other a[i]
- Minimize: put lo[i] in a for all i ≠ j
- Regardless of x[j] choice, objective = total_sum - sum_{i≠j}(lo[i])
  = Σhi[i] + lo[j]

Best j = one with largest lo[j] (always valid since hi[j] ≥ lo[j] ≥ all other lo values if lo[j]=max_lo)

Answer = Σhi[i] + max(lo[i])

## What I Learned
- Rewrite objective in terms of fixed quantities + variable
- a[i]+b[i] fixed per pair → convert sum(b) to total-sum(a)
- Separating "special" position from rest simplifies greedy
- The largest min always works as the special position
- Must use long: values up to 10^9, n up to 10^5 → sum up to 10^14

## Time Taken
~25 minutes

## Mistakes I Made
- Initially tried to think about which specific swaps to do
  instead of thinking about what values go to which array
