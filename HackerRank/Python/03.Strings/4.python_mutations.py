# Read a given string, change the character at a given index and then print the modified string.

string, exchange = [raw_input() for _ in range(2)]

index, char = exchange.split()

print string[:int(index)] + char + string[int(index)+1:]