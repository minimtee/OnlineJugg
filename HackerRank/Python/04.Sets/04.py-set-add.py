'''
Apply your knowledge of the .add() operation to help your friend Rupal.

Rupal has a huge collection of country stamps.
She decided to count the total number of distinct country stamps in her collection. She asked for your help.
You pick the stamps one by one from a stack of N country stamps.

Find the total number of distinct country stamps.
'''

result_set = set()

for i in range(int(raw_input())):
    result_set.add(raw_input())

print len(result_set)