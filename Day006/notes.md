# Day 006 — 1-1 (Codeforces)

## Problem
- Platform: Codeforces
- Link: https://codeforces.com/problemset/problem/XXXX/A
- Difficulty: 800
- Topic: Greedy, Simulation, String

## What the Problem Says
Given a binary string, you can set any character at position i
to 0 or 1 if both its neighbors are 1. Find min and max
number of 1s achievable.

## How I Solved It
**Maximum:**
- Greedily fill any 0 between two 1s → set it to 1
- Repeat until no more changes possible
- This propagates 1s inward through gaps

**Minimum:**
- Greedily remove any 1 between two 1s → set it to 0
- Repeat until no more changes possible
- This collapses runs of 1s down to their endpoints

## What I Learned
- Both min and max need simulation, not just math formulas
- Greedy + repeat until stable is a powerful pattern
- My first max formula (range between first/last 1) was WRONG
  because not all zeros in that range are immediately reachable
- Always verify with ALL given test cases before submitting

## Time Taken
~40 minutes

## Mistakes I Made
- First assumed max = fill all 0s between first and last 1
  which overcounts unreachable zeros
- Needed to simulate step by step to get correct answer
