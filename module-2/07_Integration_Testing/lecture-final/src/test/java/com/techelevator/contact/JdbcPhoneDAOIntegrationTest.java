package com.techelevator.contact;

import java.sql.SQLException;
import java.util.List;

import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcPhoneDAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	private JdbcPhoneDAO phoneDao;
	private long contactId;
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/contacts");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		dataSource.setAutoCommit( false );
	}
	
	@AfterClass
	public static void closeDatabaseConnection() {
		dataSource.destroy();
	}
	
	@After
	public void rollbackTransaction() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	
	@Before
	public void setupTest() {
		phoneDao = new JdbcPhoneDAO(dataSource);
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "INSERT INTO contact (contact_id, first_name, last_name) VALUES (DEFAULT, 'f1','l1' ) RETURNING contact_id";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		result.next();
		contactId = result.getLong("contact_id");
	
	}
	
	@Test
	public void add_new_phone() {
		// Arrange
		Phone newPhone = getPhone(0, contactId);
		
		// Act
		phoneDao.add( newPhone );
		
		// Assert
		List<Phone> savedPhones = phoneDao.getByContactId(contactId);
		Assert.assertNotNull(savedPhones);
		Assert.assertEquals(1, savedPhones.size());
		Assert.assertEquals(newPhone, savedPhones.get(0));
		
	}
	
	@Test
	public void get_multiples_phones_for_contact() {
		
		// Arrange
		// Remove all phones records from the phone table
		truncateAllPhoneRecords();
		
		phoneDao.add( getPhone(0, contactId ));
		phoneDao.add( getPhone(0, contactId ));
		phoneDao.add( getPhone(0, contactId ));
		
		// Act
		List<Phone> phones = phoneDao.getByContactId(contactId);
		
		// Assert
		Assert.assertNotNull( phones );
		Assert.assertEquals(3, phones.size());
		
	}
	
	private void truncateAllPhoneRecords() {
		jdbcTemplate.update("TRUNCATE phone CASCADE");
	}
	
	private Phone getPhone(long phoneId, long contact) {
		Phone phone = new Phone();
		phone.setId( phoneId );
		phone.setContactId( contact );
		phone.setPhoneNumber("555-555-5555");
		phone.setPhoneType("HOME");
		return phone;
	}
	
}
