'''
You are given two sets, A and B.
Your job is to find whether set A is a subset of set B.

If set A is subset of set B , print True.
If set A is not a subset of set B , print False.

Input Format

The first line will contain the number of test cases, T.
The first line of each test case contains the number of elements in set A.
The second line of each test case contains the space separated elements of set A.
The third line of each test case contains the number of elements in set B.
The fourth line of each test case contains the space separated elements of set B.
'''

for i in range(int(raw_input())): #More than 4 lines will result in 0 score. Blank lines won't be counted.  
    a = int(raw_input()); A = set(raw_input().split())
    b = int(raw_input()); B = set(raw_input().split())
    print (A == A.intersection(B))