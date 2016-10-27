'''
Let's learn about list comprehensions!
You are given three integers X,Y and Z representing the dimensions of a cuboid.
You have to print a list of all possible coordinates on a 3D grid where the sum of Xi+Yi+Zi is not equal to N .
'''

x_len = int(raw_input())+1
y_len = int(raw_input())+1
z_len = int(raw_input())+1

n = int(raw_input())

result = []

for x in range(x_len):
    for y in range(y_len):
        for z in range(z_len):
            if((x+y+z)!=n):
                result.append([x,y,z])

print result