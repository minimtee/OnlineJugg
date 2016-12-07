# Given a text file, remove the consecutive repetitions of any line.
uniq

# Given a text file, count the number of times each line repeats itself. Only consider consecutive repetitions. Display the space separated count and line, respectively. There shouldn't be any leading or trailing spaces. Please note that the uniq -c command by itself will generate the output in a different format than the one expected here.
# the '-c' option indicates the count of repetitions for each of the lines it collapses.
uniq -c

# This time, compare consecutive lines in a case insensitive manner
# the '-i' option ignore variations in case between lines.
uniq -ci

# Given a text file, display only those lines which are not followed or preceded by identical replications.
# The '-u' option prints only those lines which are succeeded and preceded by different lines.
uniq -u
