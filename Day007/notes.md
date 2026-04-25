# Day 007 — Flip Flops (Codeforces)

## Problem
- Platform: Codeforces
- Link: https://codeforces.com/problemset/problem/XXXX/A
- Difficulty: 800
- Topic: Greedy, Sorting

## What the Problem Says
Kill monsters to gain their power. Flip flops INCREASE a
monster's power by 1. Maximize final combat power c.

## How I Solved It
- Sort monsters ascending to snowball c
- Kill every monster where a[i] <= c greedily
- For each killed monster, headroom = c - a[i] = how many
  extra flip flops we could have thrown before killing it
- Total usable flops = min(k, sum of all headrooms)
- Add that to final c

## What I Learned
- Flip flops INCREASE monster power — easy to misread!
- Greedy sort ascending is the classic snowball strategy
- Headroom concept: how much "buffer" exists for each kill
- Always use long for large numbers (up to 10^9 * 10^9)
- Distributing k flops optimally = just use min(k, totalHeadroom)
  since every usable flop gives exactly +1 to final c

## Time Taken
~50 minutes

## Mistakes I Made
- Initially thought flip flops reduce monster power (misread!)
- Tried to dump all k flops on one monster which was wrong
- Forgot to use long, got overflow on last test case
- Had to work through 4 wrong approaches before finding
  the headroom insight
