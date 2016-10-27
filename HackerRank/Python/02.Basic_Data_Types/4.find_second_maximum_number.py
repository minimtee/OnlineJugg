# You are given N numbers. Store them in a list and find the second largest number.
# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(raw_input())

ls = [int(x) for x in raw_input().split()]

largest = ls[0]
second = ls[0]

for x in ls:

    if(largest == second) and (x<second):
        second = x

    if(x>largest):
        second = largest
        largest = x

    if (x>second) and (x<largest):
        second = x


print second