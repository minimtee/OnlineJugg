#!/bin/python

# If  is odd, print Weird
# If  is even and in the inclusive range of 2 to 5 , print Not Weird
# If  is even and in the inclusive range of 6 to 20, print Weird
# If  is even and greater than 20, print Not Weird

import sys

n = int(raw_input().strip())

def isOdd(n):
    return True if (n&1)!=0 else False

if isOdd(n):
    print "Weird"

if (n>=2) and (n<=5) and not isOdd(n):
    print "Not Weird"

if (n>=6) and (n<=20) and not isOdd(n):
    print "Weird"

if (n>20) and not isOdd(n):
    print "Not Weird"