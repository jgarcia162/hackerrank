import sys

line = sys.stdin.readline().split()
n = int(line[0])
k = int(line[1])
q = int(line[2])
k = k%n 


arrayline = sys.stdin.readline().split()
array = list()
for elem in arrayline :
	array.append(int(elem))

left = array[:n-k]
right = array[n-k:]
rotatedarray = right + left




# print line, n, k, q, n + k + q
# print arrayline
# print array
# print rotatedarray

for i in range(q):
	query = sys.stdin.readline()
	# print query,type(query)
	print rotatedarray[int(query)]