# Scope Day 14 - https://www.hackerrank.com/challenges/30-scope?h_r=next-challenge&h_v=zen
# Complete the Difference class by writing the following:

# A class constructor that takes an array of integers as a parameter and saves
# it to the elements instance variable. A computeDifference method that finds the
# maximum absolute difference between any  numbers in and stores it in the
# maximumDifference instance variable. 


import sys 

class Difference:
	maximumDifference = 0
	elements = []
	def __init__(self,elements):
		self.elements = elements

	def computeDifference(self):
		self.elements = sorted(self.elements)
		self.maximumDifference = self.elements[len(self.elements)-1] - self.elements[0]


a = [-9,3,-5,-1,-2]	
newClass = Difference(a)
newClass.computeDifference()
print(newClass.maximumDifference)