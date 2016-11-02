# Challenge Day 6 - https://www.hackerrank.com/challenges/30-review-loop?h_r=next-challenge&h_v=zen

# Given a string, , of length  that is indexed from  to , print its even-
# indexed and odd-indexed characters as  space-separated strings on a single line

import sys

def printOddAndEvenCharacters(n):
	evenCharacters = ""
	oddCharacters = ""
	if(len(n) != 0):
		evenCharacters = n[0]
	else:
		return
	i=1
	while(i < len(n)):
		if(i % 2 == 0):
			evenCharacters += n[i]
		else:
			oddCharacters += n[i]
		i+=1
	print(evenCharacters),
	print(oddCharacters)
	# print(evenCharacters +" "+oddCharacters)



scanner = sys.stdin
testCases = int(scanner.readline())
i=0
while(i < testCases):
	n = raw_input()
	printOddAndEvenCharacters(n)
	i+=1
