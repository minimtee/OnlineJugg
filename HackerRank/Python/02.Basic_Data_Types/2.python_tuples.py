'''
Task
Given an integer,n, and n space-separated integers as input, create a tuple, t , of those n integers. Then compute and print the result of hash(t).
'''

# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(raw_input())

input_list = [int(x) for x in raw_input().split()]

input_tuple = tuple(input_list)

print hash(input_tuple)