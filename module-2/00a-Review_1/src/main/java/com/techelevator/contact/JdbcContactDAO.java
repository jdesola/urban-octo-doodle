package com.techelevator.contact;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcContactDAO implements ContactDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcContactDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	
	/*
	 * CREATE methods
	 */
	@Override
	public void create(Contact contact) {
		String sql = "INSERT INTO contact (contact_id, first_name, last_name) VALUES (DEFAULT, ?, ?) RETURNING contact_id";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, contact.getFirstName(), contact.getLastName());
		rows.next();
		long newId = rows.getLong("contact_id");
		
		contact.setContactId( newId );
		
	}
	
	
	/*
	 * READ methods
	 */
	@Override
	public List<Contact> list() {
		
		List<Contact> contacts = new ArrayList<Contact>();
		
		String sql = "SELECT contact_id, first_name, last_name FROM contact";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql);
		
		while (rows.next()) {
			
			Contact contact = mapRowToContact( rows );
			contacts.add(contact);
		}
		
		
		return contacts;
	}
	
	@Override
	public Contact getById(long contactId) {
		Contact contact = null;
		
		String sql = "SELECT contact_id, first_name, last_name FROM contact WHERE contact_id = ?";
		
		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, contactId);
		
		if (row.next() ) {
			contact = mapRowToContact( row );
		}
		
		return contact;
	}
	
	@Override
	public List<Contact> searchByLastname(String lastName) {
		
		List<Contact> contacts = new ArrayList<Contact>();
		
		String sql = "SELECT contact_id, first_name, last_name FROM contact WHERE last_name ILIKE ?";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, "%" + lastName + "%");
		
		while (rows.next()) {
			
			Contact contact = mapRowToContact( rows );
			contacts.add(contact);
		}
		
		return contacts;
	}
	
	
	/*
	 * UPDATE methods
	 */
	@Override
	public void update(Contact contact) {
		String sql = "UPDATE contact SET first_name = ?, last_name = ? WHERE contact_id = ?";
		jdbcTemplate.update(sql, contact.getFirstName(), contact.getLastName(), contact.getContactId());	
	}
	
	
	/*
	 * DELETE methods
	 */
	@Override
	public void delete(long contactId) {
		String sql = "DELETE FROM contact WHERE contact_id = ?";
		jdbcTemplate.update(sql, contactId);
	}


	
	
	private Contact mapRowToContact( SqlRowSet row ) {
		Contact contact = new Contact();
		
//		if (row.getDate("date_column") != null) {
//			LocalDate date = row.getDate("date_column").toLocalDate();
//		}
		
		
		contact.setContactId(  row.getLong("contact_id") );
		contact.setFirstName(  row.getString("first_name") );
		contact.setLastName( row.getString("last_name") );
		
		return contact;
	}


}
