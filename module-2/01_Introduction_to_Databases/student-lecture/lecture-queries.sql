-- SELECT ... FROM
-- Selecting the names for all countries
SELECT name, population FROM country;

-- Selecting the name and population of all countries
SELECT * FROM city;

-- Selecting all columns from the city table
SELECT district FROM city;

-- Using AS to alias a column name
SELECT code AS country_code, name FROM country;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
SELECT * FROM city WHERE district = 'Ohio';

-- Select just the names of cities in Ohio
SELECT name FROM city WHERE district = 'Ohio';

-- Selecting countries that gained independence in the year 1776
SELECT * FROM country WHERE indepyear = 1776;

-- Selecting countries not in Asia
SELECT * FROM country WHERE continent != 'Asia';

-- Selecting countries that do not have an independence year
SELECT * FROM country WHERE indepyear IS NULL;

-- Selecting countries that do have an independence year
SELECT * FROM country WHERE indepyear IS NOT NULL;

-- Selecting countries that have a population greater than 5 million
SELECT * FROM country WHERE population > 5000000;


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
SELECT * FROM city WHERE district = 'Ohio' AND population > 400000;
-- Selecting country names on the continent North America or South America
SELECT * FROM country WHERE continent = 'North America' OR continent = 'South America';

--Select the same using IN
SELECT * FROM country WHERE continent IN ('North America', 'South America');

-- SELECTING DATA sw/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword
SELECT name, population, lifeexpectancy, ( population / surfacearea ) AS density FROM country;


