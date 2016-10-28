'''
You are given a two lists A and B.
Your task is to compute their cartesian product A X B.
'''

import itertools

a = map(int,(raw_input().split()))
b = map(int,(raw_input().split()))

print " ".join(map(str,list(itertools.product(a,b))))