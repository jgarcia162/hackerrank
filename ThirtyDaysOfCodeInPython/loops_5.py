# Day 5 Loops - https://www.hackerrank.com/challenges/30-loops?h_r=next-challenge&h_v=zen

# Given an integer, , print its first  multiples. Each multiple  (where ) should
# be printed on a new line in the form: n x i = result.

def printMultiples(n):
	i = 1
	while(i <= 10):
		print str(n) + " x " + str(i) + " = " + str(n*i)
		i+=1

printMultiples(2)