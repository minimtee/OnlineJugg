-- STATION
-- Field  Type
-- ID     NUMBER
-- CITY   VARCHAR2(21)
-- STATE  VARCHAR2(2)
-- LAT_N  NUMBER
-- LONG_W NUMBER

-- Query the following two values from the STATION table:
-- The sum of all values in LAT_N rounded to a scale of 2 decimal places.
-- The sum of all values in LONG_W rounded to a scale of 2 decimal places.

select round(sum(LAT_N),2),round(sum(LONG_W),2) from STATION

-- Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than 38.7880 and less than 137.2345 .
-- Truncate your answer to 4 decimal places.

select round(sum(LAT_N),4) from STATION where LAT_N > 38.7880 and LAT_N < 137.2345

-- Query the greatest value of the Northern Latitudes (LAT_N) from STATION that is less than 137.2345 .
-- Truncate your answer to 4 decimal places.

select round(max(LAT_N),4) from STATION where LAT_N < 137.2345

-- Query the Western Longitude (LONG_W) for the largest Northern Latitude (LAT_N) in STATION that is less than 137.2345.
-- Round your answer to  decimal places.

select round(LONG_W,4) from STATION where LAT_N < 137.2345 order by LAT_N desc limit 1
-- another solution
select round(LONG_W,4) from STATION where LAT_N = (select max(LAT_N) from STATION where LAT_N < 137.2345)

-- Query the smallest Northern Latitude (LAT_N) from STATION that is greater than 38.7880.
-- Round your answer to 4 decimal places.

select round(min(LAT_N),4) from STATION where LAT_N > 38.7880

-- Query the Western Longitude (LONG_W) for the smallest Northern Latitude (LAT_N) in STATION that is greater than 38.7880.
-- Round your answer to 4 decimal places.

select round(LONG_W,4) from STATION where LAT_N > 38.7880 order by LAT_N limit 1

--Consider P1(a,b) and P2(c,d) to be two points on a 2D plane.

--a happens to equal the minimum value in Northern Latitude (LAT_N in STATION).
--b happens to equal the maximum value in Northern Latitude (LAT_N in STATION).
--c happens to equal the minimum value in Western Longitude (LONG_W in STATION).
--d happens to equal the maximum value in Western Longitude (LONG_W in STATION).

--Query the Manhattan Distance between P1 and P2.
--Round it to a scale of 4 decimal places.

select round(abs((max(LONG_W) - max(LAT_N)))+abs((min(LAT_N)-min(LONG_W))),4) from STATION

-- Query the Euclidean Distance between points P1 and P2.
--Format your answer to display 4 decimal digits.

select round(sqrt(power(min(LONG_W) -min(LAT_N), 2) + power(max(LONG_W) -max(LAT_N),2) ) ,4) from STATION

-- Query the median of the Northern Latitudes (LAT_N) from STATION.
-- Round your answer to 4 decimal places.
-- Attention : SQL does not have function that can calculate median directly.
Select round(S.LAT_N,4) mediam from station S where (select count(Lat_N) from station where Lat_N < S.LAT_N ) = (select count(Lat_N) from station where Lat_N > S.LAT_N)