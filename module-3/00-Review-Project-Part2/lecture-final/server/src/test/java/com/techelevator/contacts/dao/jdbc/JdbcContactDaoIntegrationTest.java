package com.techelevator.contacts.dao.jdbc;

import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.DAOIntegrationTest;
import com.techelevator.contacts.dao.ContactDao;
import com.techelevator.contacts.model.Contact;

public class JdbcContactDaoIntegrationTest extends DAOIntegrationTest {

	private ContactDao contactDao;
	private JdbcTemplate jdbcTemplate;
	
	@Before
	public void setup() {
		jdbcTemplate = new JdbcTemplate(getDataSource());
		contactDao = new JdbcContactDao( jdbcTemplate );
	}
	
	@Test
	public void get_single_contact() {
		// Arrange (Setup)
		Contact insertedContact = insertContact("test", "test");
		// Act
		Contact retrievedContact = contactDao.get( insertedContact.getContactId() );
		// Assert
		Assert.assertEquals(insertedContact, retrievedContact);
	}
	
	@Test
	public void add_contact() {
		// Arrange
		Contact contactToAdd = new Contact();
		contactToAdd.setFirstName("testFirstName");
		contactToAdd.setLastName("testLastName");
		
		// Act
		contactToAdd = contactDao.add(contactToAdd);
		
		// Assert
		Assert.assertTrue(contactToAdd.getContactId() > 0);
		Contact retrievedContact = contactDao.get( contactToAdd.getContactId() );
		Assert.assertEquals(contactToAdd, retrievedContact);
		
	}
	
	private Contact insertContact(String firstName, String lastName) {
		Contact contact = new Contact();
		
		String sql = "INSERT INTO contact (contact_id, first_name, last_name) VALUES (DEFAULT, ?, ?) RETURNING contact_id";
		Integer id = jdbcTemplate.queryForObject(sql, Integer.class, firstName, lastName);
		
		contact.setContactId(id);
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		
		return contact;
	}
	
	
}
