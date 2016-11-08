# Binary Numbers Day 10 - https://www.hackerrank.com/challenges/30-binary-numbers

#  Given a base-10 integer,n, convert it to binary (base-2). Then find and print
# the base-10 integer denoting the maximum number of consecutive 1's in n's binary
# representation.  
 
import sys

def getConsecutiveOnes(n):
 	binaryString = str(bin(n))
 	totalOnes = 0
 	onesSoFar = 0
 	for n in binaryString:
 		if (n == str(1)):
 			onesSoFar+=1
 			if(onesSoFar > totalOnes):
 				totalOnes = onesSoFar
 		else:
 			if(onesSoFar > totalOnes):
 				totalOnes = onesSoFar
 				onesSoFar = 0
 			else:
 				onesSoFar = 0
 	return totalOnes

input = int(raw_input())
print(getConsecutiveOnes(input)) 