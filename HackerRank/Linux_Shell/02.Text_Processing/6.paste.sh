# Given a CSV file where each row contains the name of a city and its state separated by a comma, your task is to replace the newlines in the file with tabs.
paste -s
tr '\n' '\t'

# replace the newlines in the file with semicolons as demonstrated in the sample.
paste -d';' -s

# restructure the file so that 3 consecutive rows are folded into 1 line and are separated by semicolons.
paste -d';' - - -

# Restructure the file in such a way, that 3 consecutive rows are folded into one.
paste - - -
# Restructure the file in such a way, that 4 consecutive rows are folded into one.
paste - - - -