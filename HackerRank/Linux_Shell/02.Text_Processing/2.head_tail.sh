# stdin a text file and output the first 20 lines of the given text file
head -n 20

# stdin a text file and output the first 20 characters of the given text file
head -c 20

# stdin a text file and output the last 20 lines of the given text file.
tail -n 20

# stdin a text file and output the last 20 characters of the given text file
tail -c 20

# Display the lines (from line number 12 to 22, both inclusive) for the input file.
head -22 | tail -11