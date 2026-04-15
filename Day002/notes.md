# Day 002 — Stones on the Table (Codeforces 266A)

## Problem
- Platform: Codeforces
- Link: https://codeforces.com/problemset/problem/266/A
- Difficulty: 800
- Topic: Implementation, Strings

## What the Problem Says
n stones each with a color are placed one by one on a table.
If a stone has the same color as the one before it, remove it.
Count total removed stones.

## How I Solved It
- Loop through each stone
- Keep track of the previous stone's color
- If current color equals previous, increment removed counter
- Otherwise update previous to current color

## What I Learned
- Simple simulation problems just need you to follow the steps exactly
- String comparison in Java must use .equals() not ==
- Always trim input lines to avoid hidden whitespace bugs

## Time Taken
~15 minutes

## Mistakes I Made
- Used == to compare strings instead of .equals(), gave wrong answer
