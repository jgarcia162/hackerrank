 #  Challenge Day 11 2D Arrays - https://www.hackerrank.com/challenges/30-2d-arrays?h_r=next-challenge&h_v=zen

 #    Task 
 #    Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 

import sys

scanner = sys.stdin

def findMaximumHourglassSum(array):
    currentSum = 0
    maxSum = 0
    for i in range(len(array)-2):
        for j in range(len(array)-2):
            currentSum = array[i][j]+array[i][j+1]+array[i][j+2]+array[i+1][j+1]+array[i+2][j]+array[i+2][j+1]+array[i+2][j+2]
            if(i == 0 and j == 0):
                maxSum = currentSum
            if(currentSum > maxSum):
                maxSum = currentSum
                currentSum = 0
            else:
                currentSum = 0
    return maxSum

w,h = 6,6
Matrix = [[0 for x in range(w)] for y in range(h)]
for i in range(6):
        for j in range(6):
            Matrix[i][j] = int(raw_input())
print("Maximum Hourglass Sum = " + str(findMaximumHourglassSum(Matrix)))











