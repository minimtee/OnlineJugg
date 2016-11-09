-- STATION
-- Field  Type
-- ID     NUMBER
-- CITY   VARCHAR2(21)
-- STATE  VARCHAR2(2)
-- LAT_N  NUMBER
-- LONG_W NUMBER

-- Query a list of CITY and STATE from the STATION table.
select CITY,STATE from STATION


-- Query a list of CITY names from STATION with even ID numbers only.
-- You may print the results in any order,but must exclude duplicates from your answer.
select distinct CITY from STATION where (ID % 2) = 0


-- Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
select count(CITY)-count(distinct(CITY)) from STATION


--Query 2 cities in STATION with the shortest/longest CITY names, as well as their respective lengths.
--If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.
-- ??select min(CITY),length(CITY) from STATION group by LENGTH(CITY) order by LENGTH(CITY) limit 1


-- Query the list of CITY names starting with vowels (a, e, i, o, u) from STATION.
-- Your result cannot contain duplicates.
select distinct CITY from STATION where CITY regexp "^[aeiou]"


-- Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION.
-- Your result cannot contain duplicates.
select distinct CITY from STATION where CITY regexp "[aeiou]$"


-- Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters.
-- Your result cannot contain duplicates.
select distinct CITY from STATION where CITY regexp "^[aeiou](.)*[aeiou]$"


-- Query the list of CITY names from STATION that do not start with vowels.
-- Your result cannot contain duplicates.
select distinct CITY from STATION where CITY regexp "^[^aeiou]"


-- Query the list of CITY names from STATION that do not end with vowels.
-- Your result cannot contain duplicates.
select distinct CITY from STATION where	CITY regexp "[^aeiou]$"


-- Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels.
-- Your result cannot contain duplicates.
select distinct CITY from STATION where CITY not regexp "^[AEIOUaeiou](.)*[AEIOUaeiou]$"


-- Query the list of CITY names from STATION that do not start with vowels and do not end with vowels.
-- Your result cannot contain duplicates.
select distinct CITY from STATION where CITY regexp "^[^AEIOUaeiou](.)*[^AEIOUaeiou]$"