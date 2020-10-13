SELECT name, district FROM city WHERE district = 'Ohio' AND name like 'C%';

-- ORDERING RESULTS

-- Populations of all countries in descending order
SELECT name, population 
FROM country
ORDER BY population DESC;


--Names of countries and continents in ascending order
SELECT name, continent
FROM country
ORDER BY continent ASC, name ASC;


-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.
SELECT name, lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10;

-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city
SELECT (name || ', ' || district) AS city_and_state
FROM city
WHERE district IN ('California', 'Oregon', 'Washington')
ORDER BY district, name;

-- Same Query ordered by population of each city largest to smallest
SELECT (name || ', ' || district) AS city_and_state
FROM city
WHERE district IN ('California', 'Oregon', 'Washington')
ORDER BY district, population DESC;

-- Rounding numeric results
select round(gnp / population, 4) AS gnp_population
FROM country 
WHERE gnp > 0;


-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World
SELECT AVG(lifeexpectancy) AS average_lifeexpectancy
FROM country;

-- Can round output of aggregate functions, but in Postgres they return the Data Type 'Double Precision' and 
-- round() requires decimal, so can cast the output of AVG() to decimal using the postgres :: operator
SELECT round(AVG(lifeexpectancy)::decimal, 2) AS average_lifeexpectancy
FROM country;

-- Total population in Ohio
SELECT SUM(population)
FROM city
WHERE district = 'Ohio';


-- The surface area of the smallest country in the world
SELECT MIN(surfacearea)
FROM country;

-- The surface area of the largest country in the world
SELECT MAX(surfacearea)
FROM country;



-- The 10 largest countries in the world
SELECT *
FROM country
ORDER BY surfacearea DESC
LIMIT 10;

-- The number of countries who declared independence in 1991
SELECT COUNT(*) 
FROM country
WHERE indepyear = 1991;

-- GROUP BY
-- Count the number of countries where each language is spoken, ordered from most countries to least
SELECT language, COUNT(*) AS countries FROM countrylanguage
GROUP BY language
ORDER BY countries DESC;


-- Average life expectancy of each continent ordered from highest to lowest
SELECT continent, AVG(lifeexpectancy) AS avg_lifeexpectancy
FROM country
GROUP BY continent
ORDER BY avg_lifeexpectancy DESC;

-- Exclude Antarctica from consideration for average life expectancy
SELECT continent, AVG(lifeexpectancy) AS avg_lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
GROUP BY continent
ORDER BY avg_lifeexpectancy DESC;

-- Sum of the population of cities in each state in the USA ordered by state name
SELECT district, SUM(population)
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;

-- The average population of cities in each state in the USA ordered by state name
SELECT district, AVG(population), SUM(population), MIN(population), MAX(population), COUNT(*)
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district


-- SUBQUERIES
-- Find the names of cities under a given government leader
SELECT *
FROM city
WHERE countrycode IN (SELECT code
                        FROM country
                        WHERE headofstate = 'Elisabeth II');

-- Find the names of cities in Europe with a gnp > 1,000,000
select * from city WHERE countrycode IN (SELECT code from country WHERE continent = 'Europe' AND gnp > 1000000);

-- Find the names of cities whose country they belong to has not declared independence yet
SELECT * FROM city WHERE countrycode IN (SELECT code FROM country WHERE indepyear IS NULL);


-- Additional samples
-- You may alias column and table names to be more descriptive
SELECT name AS city_name
FROM city AS cities;

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.
SELECT c.name, co.name
FROM city AS c, country AS co;

-- Can also just use the table names
SELECT city.name, country.name
FROM city, country;

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)
SELECT name, population
FROM city
WHERE countryCode = 'USA'
ORDER BY name ASC, population ASC;

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip
SELECT name, population
FROM city
LIMIT 10 OFFSET 20;

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.
SELECT (name || ' is in the state of ' || district)
FROM city
WHERE countrycode = 'USA';

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.
SELECT min(population), max(population), sum(population)  
FROM city;

-- Counts the number of rows in the city table
SELECT count(*) FROM city;

-- Also counts the number of rows in the city table
SELECT count(name) FROM city;

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.
SELECT SUM(population) AS total_city_population, COUNT(*) AS number_of_cities, AVG(population) AS average_population
FROM city;

-- Gets the MIN population and the MAX population from the city table.
SELECT MIN(population) AS min_population, MAX(population) AS max_population
FROM city;


-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
SELECT countrycode, MIN(population), MAX(population)
FROM city
GROUP BY countrycode;