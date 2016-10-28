'''
You are given one set A and a number of other sets, N.
Your job is to find whether set A is a strict superset of all the N sets.
Print True, if A is a strict superset of all of the N sets.
Otherwise, print False.

A strict superset has at least one element that does not exist in its subset.
'''

a_set = set(map(int, raw_input().split()))

print (all( a_set > set(map(int,raw_input().split())) for _ in range(int(raw_input()))))