'''
You are given a string S.
Your task is to print all possible size k replacement combinations of the string in lexicographic sorted order.
'''

from itertools import combinations_with_replacement

string , number = raw_input().split()

for i in sorted(list(combinations_with_replacement(sorted(string),int(number)))):
    print "".join(i)