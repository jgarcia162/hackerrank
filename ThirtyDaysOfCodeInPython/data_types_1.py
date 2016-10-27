import sys

# Data Types Challenge - https://www.hackerrank.com/challenges/30-data-types

# Read  lines of input from stdin and initialize your variables.
# Print the sum of  plus your int variable on a new line.
# Print the sum of  plus your double variable to a scale of one decimal place on a new line.
# Concatenate  with the string you read as input and print the result on a new line.

i = 4
d = 4.0
s = "Python is "
input = sys.stdin
x = int(input.readline())
y = round(float(input.readline()),1)
z = input.readline()

print i + x
print d + y
print s + z