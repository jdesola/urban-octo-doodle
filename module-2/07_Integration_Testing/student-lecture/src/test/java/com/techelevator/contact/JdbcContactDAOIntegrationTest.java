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
	
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/contacts");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		dataSource.setAutoCommit( false );
	}
	
	@AfterClass
	public static void closeDataBaseConnection() {
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
		Contact originalContact = getContact(0, "TEST First", "Test Last");
		
		jdbcContactDao.create( originalContact );
		
		Assert.assertTrue( originalContact.getContactId() > 0);
		
		Contact retrievedContact = jdbcContactDao.getById( originalContact.getContactId() );
		
		Assert.assertEquals(originalContact, retrievedContact);
	}
	
	@Test
	public void list_returns_all_contacts() {
		
		List<Contact> originalList = jdbcContactDao.list();
		int originalCount = originalList.size();
		
		jdbcContactDao.create( getContact(0L, "first1", "last1"));
		jdbcContactDao.create( getContact(0L, "first2", "last2"));
		
		List<Contact> retrievedList = jdbcContactDao.list();
		
		Assert.assertEquals(originalCount + 2, retrievedList.size());
	}
	
	@Test
	public void update_contact() {
		Contact originalContact = getContact(0, "first1", "last1");
		
		jdbcContactDao.create( originalContact );
		
		originalContact.setFirstName("updated1");
		originalContact.setLastName("updated2");
		
		jdbcContactDao.update( originalContact );
		
		Contact updatedContact = jdbcContactDao.getById( originalContact.getContactId() );
		
		Assert.assertNotNull( updatedContact );
		Assert.assertEquals(originalContact, updatedContact);
	}
	
	@Test
	public void delete_contact() {
		Contact originalContact = getContact(0, "first1", "last1");
		//jdbcContactDao
	}
	
	private Contact getContact(long id, String firstName, String lastName) {
		Contact contact = new Contact();
		contact.setContactId(id);
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		return contact;
	}
}
