# Day 009 — Be Positive (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 800
- Topic: Math, Greedy

## What the Problem Says
Array of -1, 0, 1. Only increase operations allowed.
Make the product of all elements strictly positive.
Find minimum operations.

## Key Insight
For product > 0, two conditions must hold:
1. NO zeros (zero kills the product)
2. EVEN number of negatives (negatives must cancel out)

## How I Solved It
- Every 0 must become 1 → costs 1 operation each
- Count negatives after handling zeros
- If negative count is even → product already positive (negatives cancel)
- If negative count is odd → must fix one -1 to 1 → costs 2 operations
- Total = zeros + (2 if odd negatives else 0)

## What I Learned
- Product sign depends only on count of negatives (even=positive)
- You never need to fix more than one negative since fixing
  one odd negative makes the count even
- Zeros are always more efficient to fix (cost 1) vs
  negatives (cost 2) — handle separately
- Simple counting problems don't need simulation

## Time Taken
~10 minutes

## Mistakes I Made
- Initially thought about converting -1 to 0 first (bad idea,
  0 still kills the product so must go all the way to 1)
