'''
You are given a string S.
Suppose a character 'c' occurs consecutively X times in the string.
Replace these consecutive occurrences of the character 'c' with (X,c) in the string.
'''


import itertools

string = [ (len(list(c)), int(k)) for k,c in itertools.groupby(raw_input())]

print " ".join(str(i) for i in string)