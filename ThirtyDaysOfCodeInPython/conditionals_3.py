import sys
# Conditional Statements - https://www.hackerrank.com/challenges/30-conditional-statements?h_r=next-challenge&h_v=zen

# Given an integer, , perform the following conditional actions:
# If  is odd, print Weird
# If  is even and in the inclusive range of  to , print Not Weird
# If  is even and in the inclusive range of  to , print Weird
# If  is even and greater than , print Not Weird 

scan = sys.stdin
n = int(scan.readline())
def checkInteger(n):
	ans = "Weird"

	if (n % 2 != 0):
		print ans
		return
	elif (2<=n<=5):
		ans = "Not Weird"
	elif (n>20):
		ans = "Not Weird"
	print ans

checkInteger(n)