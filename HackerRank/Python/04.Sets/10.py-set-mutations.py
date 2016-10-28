'''
TASK

You are given a set A and N number of other sets.
These N number of sets have to perform some specific mutation operations on set A.

Your task is to execute those operations and print the sum of elements from set A.

Input Format

The first line contains the number of elements in set A.
The second line contains the space separated list of elements in set A.
The third line contains integer N, the number of other sets.
The next 2*N lines are divided into N parts containing two lines each.
The first line of each part contains the space separated entries of the operation name and the length of the other set.
The second line of each part contains space separated list of elements in the other set.
'''

n = int(raw_input())

origin_set = set(map(int,raw_input().split()))

for _ in range(int(raw_input())):
    command,number = raw_input().split()
    eval("origin_set." + command + "("+str(set(map(int,raw_input().split())))+")")

print sum(origin_set)
