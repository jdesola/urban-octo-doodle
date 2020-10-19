package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

/*
 * Spring JDBC is a wrapper around Java JDBC that makes connecting to a database and
 * executing queries easier and more concise.
 */
public class SpringJDBCExample {

	public static void main(String[] args) {

		/*
		 * This datasource will be used for creating connections to the database. Below,
		 * we provide the information required to make database connections
		 */

		BasicDataSource dvdstoreDataSource = new BasicDataSource();
		/*
		 * Connection string is a URI (like an internet address) that tells the
		 * datasource what RDBMS to connect to, where it located, and what database to use
		 */
		dvdstoreDataSource.setUrl("jdbc:postgresql://localhost:5432/dvdstore");
		dvdstoreDataSource.setUsername("postgres");
		dvdstoreDataSource.setPassword("postgres1");

		/*
		 * The JdbcTemplate is the main interface we use to interact with databases
		 * using Spring JDBC.
		 */
		JdbcTemplate dvdstoreJdbcTemplate = new JdbcTemplate(dvdstoreDataSource);

		/* The JdbcTemplate can be used to execute parameterized SQL statements */
		String sqlFilmsByCategory = "SELECT film.title, film.release_year "
				+ "FROM film JOIN film_category ON film.film_id = film_category.film_id "
				+ "JOIN category ON category.category_id = film_category.category_id " + "WHERE category.name = ?";

		/*
		 * The first parameter to the "queryForRowSet" method is a String containing a
		 * parameterized SQL statement Any following parameters are used to replace
		 * query placeholders (i.e. '?') in the order in which they appear
		 */
		String category = "Comedy";
		SqlRowSet results = dvdstoreJdbcTemplate.queryForRowSet(sqlFilmsByCategory, category);

		System.out.println(category + " Films:");

		/*
		 * The "next" method advances the cursor to the next row. If a row exists, it
		 */
		while (results.next()) {
			// this is the title column from the SELECT statement above
			String filmTitle = results.getString("title");
			int releaseYear = results.getInt("release_year");
			System.out.println(filmTitle + " (" + releaseYear + ")");
		}

		// use the "update" method to run INSERT, UPDATE, and DELETE statements
		String sqlCreateActor = "INSERT INTO actor(actor_id, first_name, last_name) " + "VALUES (DEFAULT, ?, ?)";

		dvdstoreJdbcTemplate.update(sqlCreateActor, "Craig", "Castelaz");

		/*
		 * The next example makes use of the world database, so we need a new DataSource
		 * for creating connections to that database.
		 */
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");

		/*
		 * The JdbcTemplate is the main interface we use to interact with databases
		 * using Spring JDBC.
		 */
		JdbcTemplate worldJdbcTemplate = new JdbcTemplate(worldDataSource);

		/*
		 * Using a Sequence by pre-generating it with nextval()
		 */
		
		/*
		 * Sequences are often used to generate a unique Id value prior to inserting a
		 * new record.
		 */
		String sqlGetNextId = "SELECT nextval('seq_city_id')";
		results = worldJdbcTemplate.queryForRowSet(sqlGetNextId);
		// advances to the first row
		results.next();
		// returns the integer value of the first column (i.e. index 1)
		int id = results.getInt(1);
		System.out.println("New city id: " + id);

		/*
		 * Now create a new city record using the generated id
		 */
		String sqlCreateNewCity = "INSERT INTO city(id, name, countrycode, district, population) "
				+ "VALUES(?, ?, ?, ?, ?)";

		worldJdbcTemplate.update(sqlCreateNewCity, id, "Smallville", "USA", "Kansas", 45001);
		
		
		/*
		 * Using a Sequence with RETURNING
		 */
		
		String sqlCreateNewCityReturning = "INSERT INTO city(id, name, countrycode, district, population) "
				+ "VALUES(DEFAULT, ?, ?, ?, ?) RETURNING id";
		
		SqlRowSet insertResult = worldJdbcTemplate.queryForRowSet(sqlCreateNewCityReturning, "Smallville2", "USA", "Kansas", 45001 );
		insertResult.next();
		int cityId = insertResult.getInt("id");
		
		/*
		 * Using a Sequence with Returning as Object
		 */
		Integer cityId2 = worldJdbcTemplate.queryForObject(sqlCreateNewCityReturning, Integer.class, "Smallville2", "USA", "Kansas", 45001 );
		
	}
}
