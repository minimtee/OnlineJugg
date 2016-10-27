'''
You are given a string S. Your task is to swap cases.
In other words, convert all lowercase letters to uppercase letters and vice versa.
'''

print("".join([i.lower() if i.isupper() else i.upper() for i in raw_input()]))