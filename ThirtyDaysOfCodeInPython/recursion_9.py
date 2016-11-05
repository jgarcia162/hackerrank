# Recursion Day 9 - https://www.hackerrank.com/challenges/30-recursion/submissions/code/31545190

#  Write a factorial function that takes a positive integer,  as a parameter
# and prints the result of  ( factorial).

import sys

def factorial(n):
 	if(n>1):
 		return n * factorial(n-1)
 	else:
 		return 1

n = int(raw_input())
print(factorial(n))