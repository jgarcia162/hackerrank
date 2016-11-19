# Exceptions Day 16 - https://www.hackerrank.com/challenges/30-exceptions-string-to-integer?h_r=next-challenge&h_v=zen

# Read a string and print its integer value; if it cannot be converted to an integer, print "Bad String".

import sys

scanner = raw_input()
try:
    print(int(scanner))
except:
    print("Bad String")
