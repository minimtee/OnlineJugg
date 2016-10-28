'''
You are given a string S.
Your task is to print all possible permutations of size k of the string in lexicographic sorted order.
'''

import itertools

string,number = raw_input().split()

for i in sorted(list(itertools.permutations(string,int(number)))):
    print "".join(i)