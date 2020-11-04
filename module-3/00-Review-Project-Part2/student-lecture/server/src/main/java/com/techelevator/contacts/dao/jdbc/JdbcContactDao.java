package com.techelevator.contacts.dao.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.contacts.dao.ContactDao;
import com.techelevator.contacts.model.Contact;

@Component
public class JdbcContactDao implements ContactDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcContactDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Contact> list() {
		List<Contact> contacts = new ArrayList<Contact>();
		SqlRowSet rows = jdbcTemplate.queryForRowSet("SELECT contact_id, first_name, last_name FROM contact");
		
		while (rows.next()) {
			contacts.add( mapRowToContact(rows) );
		}
		
		return contacts;
	}

	private Contact mapRowToContact(SqlRowSet row) {
		Contact contact = new Contact();
		contact.setContactId( row.getInt("contact_id"));
		contact.setFirstName( row.getString("first_name") );
		contact.setLastName( row.getString("last_name") );
		return contact;
	}

	@Override
	public Contact get(int contactId) {
		Contact contact = new Contact();
		
		String sql = "SELECT contact_id, first_name, last_name FROM contact WHERE contact_id = ?";
		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, contactId);
		
		row.next();
		contact = mapRowToContact(row);
		
		return contact;
	}

}
