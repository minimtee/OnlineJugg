
-- Table Name : CITY
-- ID           NUMBER
-- NAME         VARCHAR2(17)
-- COUNTRYCODE  VARCHAR3(3)
-- DISTRICT     VARCHAR3(20)
-- POPULATION   NUMBER

-- Table Name : COUNTRY
-- CODE
-- NAME
-- CONTINENT
-- REGION
-- SURFACEAREA
-- INDEPYEAR
-- POPULATION
-- LIFEEXPECTANCY
-- GNP
-- GNPOLD
-- LOCALNAME
-- GOVERNMENTFORM
-- HEADOFSTATE
-- CAPITAL
-- CODE2

-- Note: CITY.CountryCode and COUNTRY.Code are matching key columns.


-- Query the sum of the populations of all cities where the CONTINENT is 'Asia'.
select sum(CITY.POPULATION) from CITY inner join COUNTRY on CITY.CountryCode = COUNTRY.Code where COUNTRY.CONTINENT = "Asia"


-- Query the names of all cities where the CONTINENT is 'Africa'.
select CITY.NAME from CITY inner join COUNTRY on CITY.CountryCode = COUNTRY.Code where COUNTRY.CONTINENT = "Africa"

-- Query the names of all the continents (COUNTRY.Continent) and their respective average city populations (CITY.Population) rounded down to the nearest integer.
select distinct COUNTRY.CONTINENT,floor(AVG(CITY.POPULATION)) from CITY inner join COUNTRY on CITY.CountryCode = COUNTRY.Code group by COUNTRY.CONTINENT