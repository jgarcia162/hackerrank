# More Exceptions Day 17 - https://www.hackerrank.com/challenges/30-more-exceptions?h_r=next-challenge&h_v=zen

# Task -
# Write a Calculator class with a single method: int power(int,int). The power
# method takes two integers as parameters and returns the integer result. If either integers is negative, then the method must throw an exception with
# the message: "n and p should be non-negative." 

import sys

class Calculator:

	def __init__(self):
		pass

	def power(self, n, p):
		return n**p

power = Calculator()
n = int(raw_input("Enter a number: "))
p = int(raw_input("Enter another number: "))
if(n < 0 or p < 0):
	raise Exception("n and p should be non-negative")
num = power.power(n,p)
print(num)