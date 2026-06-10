# Day 020 — Snowfall (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: ~1400
- Topic: Greedy, Arrays, Math

## What the Problem Says
Given an array, reorder it to minimize the number of
subarrays whose product is divisible by 6.

## Key Insight
A product is divisible by 6 iff it has BOTH a factor
of 2 AND a factor of 3 somewhere in the subarray.

Categorize every element into 4 groups:
- group6: divisible by both 2 and 3
- group2: divisible by 2 only
- group3: divisible by 3 only
- groupN: divisible by neither

Optimal order: [group6] [larger of group2/group3] [groupN] [smaller of group2/group3]

This ensures group2 and group3 elements are NEVER
in the same subarray — they can't combine to form
a new multiple of 6.

## What I Learned
- Divisibility by 6 = divisibility by 2 AND by 3
- Greedy separation: keep "only-2" and "only-3" elements
  on opposite ends of the array
- Neutral elements (neither 2 nor 3) act as safe buffers
- Clustering group6 at the front avoids new cross-pairs
- Larger group goes before neutral — maximises separation

## Time Taken
~25 minutes

## Mistakes I Made
- Initially tried sorting by value, which doesn't help
- Forgot that group6 elements are already dangerous alone
  and need to be grouped, not scattered
- Almost missed the "larger group first" detail which
  handles the asymmetric group2 vs group3 sizes
