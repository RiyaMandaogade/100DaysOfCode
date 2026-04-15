# Day 001 — Theatre Square (Codeforces 1A)

## Problem
- Platform: Codeforces
- Link: https://codeforces.com/problemset/problem/1/A
- Difficulty: 800
- Topic: Math

## What the Problem Says
A n x m rectangle needs to be covered with a x a flagstones.
Flagstones can go outside the boundary. How many do you need?

## How I Solved It
- To cover n units with tiles of size a, you need ceil(n/a) tiles
- ceil(n/a) in integer math = (n + a - 1) / a
- Total tiles = ceil(n/a) * ceil(m/a)
- Used long instead of int because numbers can be up to 10^9

## What I Learned
- How to do ceiling division without using Math.ceil()
- Always use long for large number multiplication in Java
- Read problem constraints carefully before choosing data types

## Time Taken
~20 minutes

## Mistakes I Made
- First used int instead of long, caused overflow on large inputs
