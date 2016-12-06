# 'e' being transformed to 'E'
echo "Hello" | tr "e" "E"

# Spaces being transformed to hyphens
echo "Hello how are you" | tr " " '-'

# Digits (numerals) being deleted
echo "Hello how are you 1234" | tr -d [0-9]

# Output the text with all parentheses ( ) replaced with box brackets [ ].
tr "(" "[" | tr ")" "]"

# Delete all the lowercase characters in the given block of text.
tr -d [a-z]

# Replace all sequences of multiple spaces with just one space.
tr -s " "
