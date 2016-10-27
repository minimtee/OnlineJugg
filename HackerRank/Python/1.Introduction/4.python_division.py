# Enter your code here. Read input from STDIN. Print output to STDOUT

'''
Task 
Read two integers and print two lines. 
The first line should contain integer division,a // b.
The second line should contain float division, a / b .
'''

from __future__ import division
from sys import stdin

a = int(raw_input())
b = int(raw_input())

int_division = a // b
float_division = a / b

print int_division
print float_division
