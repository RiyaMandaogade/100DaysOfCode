# Day 012 — Social Experiment (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 800
- Topic: Math, Greedy, Construction

## What the Problem Says
Split n people into teams of 2 or 3.
Each team goes entirely to one of two civilizations.
Minimize |civ1 - civ2|.

## How I Solved It
Special cases:
- n=2: only one team of 2, must all go one side → diff=2
- n=3: only one team of 3, must all go one side → diff=3

For n≥4:
- Even n → always achievable diff=0
  Example: use teams of 2, split equally between civs
- Odd n → minimum possible is 1 (odd total can't split evenly)
  Always achievable: e.g. n=7 → teams {2,2,3},
  put {2,2} in civ1 (4 people), {3} in civ2 (3 people) → diff=1

## Key Insight
The choice of how to form teams (2s vs 3s) gives flexibility.
For any n≥4 we can always find a team composition AND
assignment that achieves the theoretical minimum.

## What I Learned
- Always check small cases separately (n=2, n=3 are special)
- For larger n, think about parity: odd total → min diff ≥ 1
- Construction problems: prove you can ALWAYS achieve the bound
- The freedom to choose team sizes is the key insight here

## Time Taken
~25 minutes

## Mistakes I Made
- Initially thought n=4 would give diff=2 (forgot we can
  put each team-of-2 on different sides)
- Almost wrote full subset sum simulation before finding pattern
