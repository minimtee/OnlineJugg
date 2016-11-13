'''
You are given a string S.
Your task is to find out whether S is a valid regex or not.
'''

import re
for _ in range(int(raw_input())):
    try:
        x=re.compile(raw_input().strip())
        print True
    except:
        print False