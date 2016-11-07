-- Table name : CITY

-- Field        Type
-- ID           NUMBER
-- NAME         VARCHAR2(17)
-- COUNTRYCODE  VARCHAR3(3)
-- DISTRICT     VARCHAR3(20)
-- POPULATION   NUMBER

-- Query all columns for all American cities in CITY with populations larger than 100000.
-- The CountryCode for America is USA.

select * from CITY where POPULATION > 100000 and COUNTRYCODE = "USA"

-- Query the names of all American cities in CITY with populations larger than 120000.
-- The CountryCode for America is USA.

select NAME from CITY where COUNTRYCODE = "USA" and POPULATION > 120000

-- Query all columns (attributes) for every row in the CITY table.

select * from CITY

-- Query all columns for a city in CITY with the ID 1661.

select * from CITY where ID = "1661"

-- Query all attributes of every Japanese city in the CITY table.
-- The COUNTRYCODE for Japan is JPN.

select * from CITY where COUNTRYCODE = "JPN"

-- Query the names of all the Japanese cities in the CITY table.
-- The COUNTRYCODE for Japan is JPN.

select NAME from CITY where COUNTRYCODE = "JPN"

-- Query a list of CITY and STATE from the STATION table.
