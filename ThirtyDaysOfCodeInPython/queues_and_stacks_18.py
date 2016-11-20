# /* Queues and Stacks Day 18 -https://www.hackerrank.com/challenges/30-queues-stacks?h_r=next-challenge&h_v=zen
# Write the following declarations and implementations:

# To solve this challenge, we must first take each character in s, enqueue it in
# a queue, and also push that same character onto a stack. Once that's done, we
# must dequeue the first character from the queue and pop the top character off
# the stack, then compare the two characters to see if they are the same; as
# long as the characters match, we continue dequeueing, popping, and comparing
# each character until our containers are empty (a non-match means s isn't a
# palindrome).
# */

class Stack:
     def __init__(self):
         self.items = []

     def isEmpty(self):
         return self.items == []

     def push(self, item):
         self.items.append(item)

     def pop(self):
         return self.items.pop()

     def peek(self):
         return self.items[len(self.items)-1]

     def size(self):
         return len(self.items)

class Queue:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def enqueue(self, item):
        self.items.insert(0,item)

    def dequeue(self):
        return self.items.pop()

    def size(self):
        return len(self.items)

class Solution():
    def __init__(self):
        self.stack = Stack()
        self.queue = Queue()
    
    def pushCharacter(self,c):
        self.stack.push(c)
    
    def enqueueCharacter(self,c):
        self.queue.enqueue(c)

    def popCharacter(self):
        return self.stack.pop()

    def dequeueCharacter(self):
        return self.queue.dequeue()

string = str(raw_input("Enter a word: "))
s = list(string)
p = Solution()
for c in s:
    p.pushCharacter(c)
    p.enqueueCharacter(c)
isPalindrome = True

for x in range(0,(len(s)-1)):
    if(p.popCharacter() != p.dequeueCharacter()):
        isPalindrome = False
        break
if(isPalindrome):
    print("The word " + string + " is a palindrome")
else:
    print("The word " + string + " is not a palindrome")