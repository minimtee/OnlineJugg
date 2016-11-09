-- Table name : CITY

-- Field        Type
-- ID           NUMBER
-- NAME         VARCHAR2(17)
-- COUNTRYCODE  VARCHAR3(3)
-- DISTRICT     VARCHAR3(20)
-- POPULATION   NUMBER

-- Query a count of the number of cities in CITY having a Population larger than 100,000.
select count(id) from CITY where POPULATION > 100000


-- Query the total population of all cities in CITY where District is California.
select sum(POPULATION) from CITY where DISTRICT = "California";


-- Query the average population of all cities in CITY where District is California.
select sum(POPULATION)/count(ID) from CITY where DISTRICT = "California";
-- another solution
select avg(POPULATION) from CITY where DISTRICT = "California";


-- Query the average population for all cities in CITY, rounded down to the nearest integer.
select round(avg(POPULATION)) from CITY
-- another solution
select floor(avg(POPULATION)) from CITY


-- Query the sum of the populations for all Japanese cities in CITY.
-- The COUNTRYCODE for Japan is JPN.
select sum(POPULATION) from CITY where COUNTRYCODE = "JPN"


--Query the difference between the maximum and minimum populations in CITY.
select max(POPULATION)-min(POPULATION) from CITY

