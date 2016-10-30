# Class vs Instance - https://www.hackerrank.com/challenges/30-class-vs-instance?h_r=next-challenge&h_v=zen

# Task 
# Write a Person class with an instance variable, , and a constructor that takes an integer, , as a parameter. The constructor must assign  to  after confirming the argument passed as is not negative; if a negative argument is passed as , the constructor should set  to  and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

# yearPasses() should increase the  instance variable by 3
# amIOld() should perform the following conditional actions:
# If , print You are young..
# If  and , print You are a teenager..
# Otherwise, print You are old..
import sys


class Person():
	age = 0

	def __init__(self,age):
		if(age >= 0):
			self.age = age
		else:
			print "Age is not valid, setting age to 0."
			self.age = 0

	def amIOld(self):
		if(self.age < 13):
			print "You are young."
		elif(18 > self.age >= 13):
			print "You are a teenager."
		else:
			print "You are old."

	def yearPasses(self):
		self.age+=1

scan = sys.stdin
print "waiting for input"
t = int(scan.readline())
i=0
j=0

while (i < t):
	age = int(scan.readline())
	p = Person(age)
	p.amIOld()
	while(j < 3):
		p.yearPasses()
		j+=1
	p.amIOld()
	i+=1

