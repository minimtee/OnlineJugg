# You are given the year, and you have to write a function to check if the year is leap or not.

def is_leap(year):
    # Write your logic here
    if (year % 4 != 0):
        return False

    if (year % 400 == 0):
        return True

    if (year % 100 == 0):
        return False

    return True
