
'''
You have a record of N students.
Each record contains the student's name, and their percent marks in Maths, Physics and Chemistry.
The marks can be floating values.
The user enters some integer N followed by the names and marks for N students.
You are required to save the record in a dictionary data type.
The user then enters a student's name.
Output the average percentage marks obtained by that student, correct to two decimal places.
'''

# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(raw_input())

ls = [] 

for x in range(n):
    # get new line
    temp_list = raw_input().split()
    length = len(temp_list)
    # 1. get the student name
    name = temp_list[0]
    # 2. get the average grade
    total_grade = 0
    for i in range(1,length):
        total_grade += float(temp_list[i])
    ave_grade = total_grade/(length-1)
    # append new row of list
    new_list = [name,ave_grade]
    ls.append(new_list)

target = raw_input()

for l in ls:
    if(l[0] == target):
        print "%.2f" % l[1]