-- table name Employee
-- Column      Type
-- employee_id Integer
-- name        String
-- months      Integer
-- salary      Integer

-- Prints a list of employee names in alphabetical order.
select name from Employee order by name


-- Prints a list of names for employees having a salary greater than 2000 per month who have been employees for less than 10 months.
-- Sort your result by ascending employee_id.
select name from Employee where salary > 2000 and months < 10 order by employee_id