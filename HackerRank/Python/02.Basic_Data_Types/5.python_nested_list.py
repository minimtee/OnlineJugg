'''
Given the names and grades for each student in a Physics class of N students,
store them in a nested list and print the name(s) of any student(s) having the second lowest grade.
'''

# Enter your code here. Read input from STDIN. Print output to STDOUT

markSheet = []

for _ in range(0,int(raw_input())):
    markSheet.append([raw_input(),float(raw_input())])

second_highest = sorted(list(set([marks for name,marks in markSheet])))[1]

print('\n'.join([name for name,grade in sorted(markSheet) if grade == second_highest]))