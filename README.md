
# Palindrome Number

LeetCode problem #9: [Palindrome Number](https://leetcode.com/problems/palindrome-number/)

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

## Examples

- Input: `121` → Output: `true`
- Input: `-121` → Output: `false` (because `-121` reversed is `121-`)
- Input: `10` → Output: `false` (because `01` is not a valid integer)

## Solutions

This repository contains two implementations:

1. **String conversion** – Convert the integer to a string and compare characters from both ends.
2. **Mathematical reversal** – Reverse half of the number and compare, avoiding string conversion.

## How to run

Compile and run the Java file:

```bash
javac Solution.java
java Solution   # runs a simple test in main()