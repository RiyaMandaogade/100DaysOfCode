# Day 008 — THU Packing Puzzle (Codeforces)

## Problem
- Platform: Codeforces
- Link: https://codeforces.com/problemset/problem/XXXX/B
- Difficulty: 1200
- Topic: Greedy, Math, Geometry

## What the Problem Says
Pack T, H, U shaped blocks into an n×3 grid.
Find minimum n.

## Shape Sizes
- H-shape: 6 cells, fits perfectly in 2×3 (2 rows)
- T-shape: 4 cells, needs 3 rows alone
- U-shape: 4 cells, needs 3 rows alone

## Key Packing Rules Discovered
- H: always 2 rows, no pairings possible
- T + U pair: 5 rows together (saves 1 vs 3+3=6)
- T + T pair: 5 rows together (saves 1 vs 3+3=6)
- U + U: CANNOT pair, each U always needs 3 rows
- Single T: 3 rows
- Single U: 3 rows

## Algorithm
1. rows += 2 * cH
2. Pair T with U: rows += 5 * min(cT, cU)
3. Pair remaining T with T: rows += 5 * (cT/2)
4. Single remaining T: rows += 3 * cT
5. Single remaining U: rows += 3 * cU

## What I Learned
- Geometry packing problems need shape analysis first
- Reverse engineer formulas from given examples
- U blocks cannot be paired together unlike T blocks
- Always use long for values up to 10^9 * constants
- Greedy pairing: prefer T+U over T+T since U has
  no other pairing option

## Time Taken
~60 minutes

## Mistakes I Made
- Initially assumed U+U could pair (wrong!)
- Forgot to use long, got overflow
- Tried to compute cell counts instead of row counts
