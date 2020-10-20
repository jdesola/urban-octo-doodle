package com.techelevator.contact;

import java.sql.SQLException;
import java.util.List;

import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class JdbcContactDAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;
	
	private JdbcContactDAO jdbcContactDao;
	private JdbcTemplate jdbcTemplate;
	
	// Create the connection in @BeforeClass
	
		// Instantiate the DAO in @Before
	
		// Rollback the transaction in @After
	
	// Close the connection in @AfterClass
	
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
		jdbcContactDao = new JdbcContactDAO(dataSource);
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Test
	public void create_new_contact() {
		// Arrange
		// Instantiate and Populate a Contact Object
		Contact originalContact = getContact(0, "TEST First", "Test Last");
		
		// Act
		// Use the dao create() method to insert it into the database
		jdbcContactDao.create( originalContact );
		
		// Assert
		// Verify that the id was generated and set
		Assert.assertTrue( originalContact.getContactId() > 0 );
		
		// use the DAO getById() method to get the contact
		Contact retrievedContact = jdbcContactDao.getById( originalContact.getContactId() );
		// Verify the retrieved contact matches the one we inserted
		Assert.assertEquals(originalContact, retrievedContact);
	}
	
	@Test
	public void list_returns_all_contacts() {
		// Arrange
		// Call list to get the count of contacts on the table
		// Insert 2 contacts
		List<Contact> originalList = jdbcContactDao.list();
		int originalCount = originalList.size();
		
		jdbcContactDao.create( getContact(0L, "first1", "last1"));
		jdbcContactDao.create( getContact(0L, "first2", "last2"));
		
		// Act
		// Call list
		List<Contact> retrievedList = jdbcContactDao.list();
		
		// Assert
		// Verify the new count of contacts is the original +2
		Assert.assertEquals(originalCount + 2, retrievedList.size() );
	}
	
	
	@Test 
	public void update_contact() {
		// Arrange
		// Create contact and insert into the database
		Contact originalContact = getContact(0, "first1", "last1");
		jdbcContactDao.create( originalContact );
		// Change the contact
		originalContact.setFirstName("updated1");
		originalContact.setLastName("updated2");
		
		// Act
		// calling the update with the changed object
		jdbcContactDao.update( originalContact );
		
		// Assert
		// Select the contact from the database
		// Assert that it is the same as the changed contact
		Contact updatedContact = jdbcContactDao.getById( originalContact.getContactId() );
		
		Assert.assertNotNull(updatedContact);
		Assert.assertEquals(originalContact, updatedContact);
	}
	
	@Test
	public void delete_contact() {
		// Arrange
		// Create a contact and insert into the database
		Contact originalContact = getContact(0, "first1", "last1");
		jdbcContactDao.create( originalContact );
		
		// Act
		// Delete the contact from the database
		jdbcContactDao.delete( originalContact.getContactId() );
		
		// Assert
		// Select the contact and verify it is null
		Contact retrievedContact = jdbcContactDao.getById( originalContact.getContactId() );
		Assert.assertNull( retrievedContact );
	}
	
	
	private Contact getContact(long id, String firstName, String lastName) {
		Contact contact = new Contact();
		contact.setContactId(id);
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		return contact;
		
	}
	
}
