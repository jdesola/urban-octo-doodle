package com.techelevator.contacts.dao.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.DAOIntegrationTest;
import com.techelevator.contacts.dao.ContactDao;
import com.techelevator.contacts.model.Contact;


public class JdbcContactDaoIntegrationTest extends DAOIntegrationTest{

	private ContactDao contactDao;
	private JdbcTemplate jdbcTemplate;
	
	@Before
	public void setup() {
		jdbcTemplate = new JdbcTemplate(getDataSource());
		contactDao = new JdbcContactDao( jdbcTemplate );
	}
	
	@Test
	public void get_single_contact() {
		Contact insertedContact = insertContact("test", "test");
		
		Contact retrievedContact = contactDao.get( insertedContact.getContactId() );
		
		Assert.assertEquals(insertedContact, retrievedContact);
		
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
