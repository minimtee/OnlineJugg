'''
print True if S has any alphanumeric characters. Otherwise, print False. 
print True if S has any alphabetical characters. Otherwise, print False. 
print True if S has any digits. Otherwise, print False. 
print True if S has any lowercase characters. Otherwise, print False. 
print True if S has any uppercase characters. Otherwise, print False.
'''

s = raw_input()
    
    print any(c.isalnum() for c in s)
    print any(c.isalpha() for c in s)
    print any(c.isdigit() for c in s)
    print any(c.islower() for c in s)
    print any(c.isupper() for c in s)
