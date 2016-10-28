'''
Task
You are given a string S.
Your task is to print all possible combinations, up to size k, of the string in lexicographic sorted order.
'''

import itertools

string,number = raw_input().split()

number = int(number)

for i in range(1,number+1):
    for c in sorted(list(itertools.combinations(sorted(string),i))):
        print "".join(c)