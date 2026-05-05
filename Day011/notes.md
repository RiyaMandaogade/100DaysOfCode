# Day 011 — Eating Game (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 800
- Topic: Simulation, Brute Force

## What the Problem Says
n players at circular table, each with a[i] dishes.
On your turn eat one dish if you have any.
Player who eats the last dish wins.
We choose who goes first — count how many players CAN win.

## How I Solved It
- n ≤ 10 and a[i] ≤ 10 → max 100 total dishes → brute force!
- Try all n possible starting players
- For each start, simulate entire game round by round
- Track the last player to eat a dish = winner
- Use HashSet to collect distinct winners
- Answer = size of winners set

## What I Learned
- When constraints are tiny (n ≤ 10, a[i] ≤ 10), always
  consider brute force simulation first
- Circular table = use modulo: next = (current + 1) % n
- HashSet automatically handles duplicates when counting
  distinct winners
- "Skip if 0 dishes" just means nothing happens that turn,
  not that the player is removed from rotation

## Time Taken
~15 minutes

## Mistakes I Made
- Almost overcomplicated it with math before noticing
  the tiny constraints allowing full simulation
