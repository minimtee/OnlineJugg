# Enter your code here. Read input from STDIN. Print output to STDOUT

# number of commands
n = int(raw_input())

ls = []

for _ in range(n):
    string = raw_input().split()
    cmd = string[0]
    args = string[1:]

    if cmd != "print":
        cmd += "(" + ",".join(args) + ")"
        eval("ls." + cmd)
    else:
        print ls