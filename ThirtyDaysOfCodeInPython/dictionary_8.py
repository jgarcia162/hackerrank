# Day 8 - Dictionary and Maps

# Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.

# Note: Your phone book should be a Dictionary/Map/HashMap data structure.


import sys

def addToDictionary(dictionary,name,phone):
    dictionary[name] = phone

scan = sys.stdin
phoneBook = {}
n = int(raw_input())
i = 0
while(i < n):
    name = str(raw_input())
    phone = int(raw_input())
    addToDictionary(phoneBook,name,phone)
    i+=1
names = raw_input().split()
for s in names:
    if(s in phoneBook):
        print(s),
        print('='),
        print(phoneBook[s])
    else:
        print("Not found")