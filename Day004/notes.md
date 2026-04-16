# Day 004 — Blocked (Codeforces)

## Problem
- Platform: Codeforces
- Link: https://codeforces.com/problemset/problem/XXXX/A
- Difficulty: 800
- Topic: Sorting, Greedy, Subset Sum

## What the Problem Says
Reorder an array so that no element equals the subset sum
of any elements that come before it. If impossible, print -1.

## How I Solved It
- If any value appears more than once → always impossible
  because the second occurrence is always blocked by the first
- If all values are distinct → sort in descending order
- Why descending works: each new element is strictly smaller
  than all previous elements, so it can never equal a subset
  sum of strictly larger numbers

## What I Learned
- Duplicate elements always make this type of problem impossible
- Sorting descending is a powerful trick when dealing with
  subset sum problems involving positive integers
- A smaller number can NEVER equal a sum of strictly
  larger positive numbers — this is the core insight
- HashMap is useful for quick frequency counting in Java

## Time Taken
~30 minutes

## Mistakes I Made
- Initially overcomplicated it by trying to simulate all
  possible subset sums instead of finding the pattern
- Forgot that a single element {x} is also a valid subset,
  so duplicates are always impossible
