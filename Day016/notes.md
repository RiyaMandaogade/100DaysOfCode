# Day 016 — Another Sorting Problem (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 1200
- Topic: Greedy, Label Propagation, Constraints

## How I Solved It
Label each element 0 (unboosted) or 1 (boosted, +k added).
For sorted result, constraints on adjacent pairs:
- Descent a[i]>a[i+1]: FORCED label[i]=0, label[i+1]=1
  Gives lower bound: k ≥ a[i]-a[i+1]
- Flat a[i]=a[i+1]: CANNOT have label[i]=1, label[i+1]=0
  Propagate 1s rightward and 0s leftward through flat chains
- 1→0 transition at ascent: k ≤ a[i+1]-a[i] (upper bound)

For free regions between forced-1 and forced-0,
optimally place the 10 transition at max gap position.

Answer: YES if lower_k ≤ upper_k, else NO.

## Key Insights
- Consecutive descents always force a contradiction → NO
- Flat propagation can chain conflicts
- For free regions: defer 10 transition as late as possible
  (max gap = best upper bound)

## Time Taken
~90 minutes

## Mistakes I Made
- Initially thought only direct adjacent forced labels mattered
- Missed the flat-chain propagation
- Had to carefully prove why deferring the 10 transition is optimal
