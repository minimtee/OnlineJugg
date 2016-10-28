# compute the average of all the plants with distinct heights in her greenhouse.

n = map(float, raw_input())
data_set = set(map(float, raw_input().split()))

print sum(data_set)/len(data_set)