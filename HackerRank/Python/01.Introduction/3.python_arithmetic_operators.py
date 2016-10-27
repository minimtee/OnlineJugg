# Enter your code here. Read input from STDIN. Print output to STDOUT
'''
Read two integers from STDIN and print three lines where:

The first line contains the sum of the two numbers.
The second line contains the difference of the two numbers (first - second).
The third line contains the product of the two numbers.
'''

from sys import stdin

a = int(raw_input())
b = int(raw_input())

print a + b
print a - b
print a * b
