# http://tldp.org/LDP/abs/html/textproc.html

# Use grep to display all the lines that contain the word the in them.
# The search should be sensitive to case.
grep ' the '
grep -w 'the'

# Use grep to display all those lines that contain the word the in them.
# The search should NOT be sensitive to case.
grep -iw 'the'

# Use grep to remove all those lines that contain the word 'that'.
# The search should NOT be sensitive to case.
grep -ivw 'that'

# Use grep to display all those lines which contain any of the following words in them:
# the that then those
# The search should not be sensitive to case.
grep -iw -e "the" -e "that" -e "then" -e "those"

# grep out and output only those credit card numbers which have 2 or more consecutive occurences of the same digit (which may be separated by a space, if they are in different segments).
grep '\([0-9]\) *\1'