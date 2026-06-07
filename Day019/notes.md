# Day 019 — Party Monster (Codeforces)

## Problem
- Platform: Codeforces
- Difficulty: 1200
- Topic: Strings, Observation

## What the Problem Says
Remove a contiguous substring, then reinsert each removed
character at any position. Determine if a valid bracket
sequence is achievable.

## Key Insight
The operation allows removing the ENTIRE string and
reinserting all characters freely. This means we can
form ANY arrangement of the characters.

A valid bracket sequence exists iff:
1. n is even (need equal '(' and ')')
2. count('(') = count(')') = n/2

If both hold, just remove the whole string and reinsert
as a valid bracket sequence. Always works!

## What I Learned
- Always consider the extreme case (remove entire string)
- Freedom of reinsertion = freedom of arrangement
- Complex-looking problems can have simple observations
- Check edge cases first: odd length is immediately NO
- This reduced an apparently hard problem to a 2-line check

## Time Taken
~15 minutes

## Mistakes I Made
- Started thinking about DP before checking the extreme case
- Key insight: the problem allows removing ANY substring
  including the whole string
