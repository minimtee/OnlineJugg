# Enter your code here. Read input from STDIN. Print output to STDOUT

a_num = map(int, raw_input())
a_set = set(map(int ,raw_input().split()))
b_num = map(int, raw_input())
b_set = set(map(int ,raw_input().split()))

whole_set = a_set.union(b_set)

interest_set = a_set.intersection(b_set)

# result_set = a_set.symmetric_difference(b_set)

for i in interest_set:
    whole_set.remove(i)

for i in sorted(list(whole_set)):
    print i