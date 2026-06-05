# Day 017 — Digit String (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 1200
- Topic: Greedy, Prefix/Suffix Sweep, Strings

## What the Problem Says
Remove minimum characters from a string of digits {1,2,3,4}
so no subsequence forms a multiple of 4.

## Key Insight
Multiples of 4 with digits 1-4:
- Single digit: 4
- Two digits: 12, 24, 32, 44
(Any longer multiple of 4 ends in one of these pairs)

Beautiful string must have:
- No '4' at all
- No '2' appearing after any '1' or '3'
  → Remaining string matches pattern: 2*(1|3)*

## Algorithm
1. Remove all 4s (mandatory)
2. On remaining string, find cut point i minimizing:
   count({1,3} in prefix [0..i-1]) + count(2s in suffix [i..end])
3. Answer = count(4s) + min cut cost

## What I Learned
- Reducing "no bad subsequence" to pattern matching
- The pattern 2*(1|3)* means all 2s before all 1s/3s
- Prefix/suffix sweep is the classic tool for cut-point problems
- Precompute suffix counts → O(n) sweep instead of O(n²)
- Always remove mandatory characters first, then optimize rest

## Time Taken
~40 minutes

## Mistakes I Made
- Forgot that the empty string is beautiful (needed for
  edge case where removing everything is optimal)
- Initially forgot to handle the suffix2 array boundary at m
