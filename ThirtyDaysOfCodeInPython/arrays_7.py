# Day 7 Arrays - https://www.hackerrank.com/challenges/30-arrays?h_r=next-challenge&h_v=zen

# Given an array, of integers, print elements in reverse order as a single line of space-separated numbers.

import sys

def printElements(array):
	i = len(array) - 1
	while(i >= 0):
		print(array[i]),
		i-=1

scanner = sys.stdin
n = int(raw_input())
arr = range(n)
printElements(arr)