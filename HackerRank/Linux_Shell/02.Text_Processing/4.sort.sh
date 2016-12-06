# The vanilla sort command simply sorts the lines of the input file in lexicographical order.

# -n option
# sorts the file on the basis of the numeric fields available if the first word or column in the file is a number.

# -r option
# reverses the sorting order to either the reverse of the usual lexicographical ordering or descending order while sorting in numerical mode.

# -k option
# is useful while sorting a table of data (tsv, csv etc.) based on a specified column (or columns).

# -t option
# is used while specifying a delimiter in a particular file where columns are separated by tabs, spaces, pipes etc.


# Given a text file, order the lines in lexicographical order.
sort

# Given a text file, order the lines in reverse lexicographical order (i.e. Z-A instead of A-Z).
sort -r

# Sort the lines in ascending order - so that the first line holds the numerically smallest number, and the last line holds the numerically largest number.
sort -n

# Sort the lines in descending order
sort -n -r

# Rearrange the rows of the table in descending order of the values for the 2rd second.
sort -rnk 2 -t$'\t'

# Rearrange the rows of the table in ascending order of the values for the 2rd second.
sort -nk 2 -t$'\t'

# Sort this file in descending order of the second column
sort -rnk 2 -t$'|'