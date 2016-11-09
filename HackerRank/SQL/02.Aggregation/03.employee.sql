-- table name Employee
-- Column      Type
-- employee_id Integer
-- name        String
-- months      Integer
-- salary      Integer

-- When calculating the average monthly salaries for all employees in the table, we find the keyboard's 0 key was broken until after completing the calculation.
-- Please find the difference between miscalculation (using salaries with any zeroes removed), and the actual average salary.
--Round it up to the next integer.
SELECT CEIL(AVG(Salary)-AVG(REPLACE(Salary,'0',''))) FROM EMPLOYEES;


-- We define an employee's total earnings to be their monthly salary*months worked, and the maximum total earnings to be the maximum total earnings for any employee in the Employee table.
-- Write a query to find the maximum total earnings for all employees as well as the total number of employees who have maximum total earnings.
--Then print these values as 2 space-separated integers.

select (salary*months) as earnings ,count(*) from employee group by 1 order by earnings desc limit 1;
