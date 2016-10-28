'''
There is an array of n integers.
There are also 2 disjoint sets, A and B, each containing m integers.
You like all the integers in set A and dislike all the integers in set B.
Your initial happiness is 0.
For each i integer in the array, if i in A , you add 1 to your happiness.
If i in B , you add -1 to your happiness.
Otherwise, your happiness does not change.
Output your final happiness at the end.
'''

# Get data
n,m = map(int, raw_input().split())
ary = map(int, raw_input().split())
A = set(map(int, raw_input().split()))
B = set(map(int, raw_input().split()))

happiness = 0

for a in ary:
    if (a in A):
        happiness += 1
    if (a in B):
        happiness -= 1

print happiness