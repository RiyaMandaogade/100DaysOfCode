# Day 005 — Course Wishes (Codeforces)

## Problem
- Platform: Codeforces
- Link: https://codeforces.com/problemset/problem/XXXX/A
- Difficulty: 800
- Topic: Greedy, Simulation

## What the Problem Says
Move all courses to priority level k+1 by incrementing
one course at a time. After every operation all capacity
limits must still be satisfied. Do it in at most 1000 steps.

## How I Solved It
- Process levels from k DOWN to 1
- For each level, find all courses sitting at that level
- Push each of those courses all the way up to k+1 one step at a time
- Going from high levels first (k) ensures lower levels are
  already cleared, so capacity limits are never violated
- It is always possible — never need to print -1

## What I Learned
- Greedy from the highest constrained level downward
  guarantees capacity limits are never broken
- When you clear level k first, level k-1 courses can
  freely pass through level k without violating its limit
- Simulation problems just need the right ORDER of operations
- n*k ≤ 50*20 = 1000 operations max, fits perfectly in limit

## Time Taken
~35 minutes

## Mistakes I Made
- Initially tried going from level 1 upward which violated
  capacity limits because lower levels were still occupied
- Forgot that k+1 has no capacity limit so no check needed there
