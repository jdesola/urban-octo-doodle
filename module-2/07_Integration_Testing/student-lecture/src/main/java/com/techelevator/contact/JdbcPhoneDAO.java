package com.techelevator.contact;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcPhoneDAO implements PhoneDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcPhoneDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<Phone> getByContactId(long contactId) {
		List<Phone> phones = new ArrayList<Phone>();
		
		String sql = "SELECT phone_id, contact_id, phone_number, phone_type, phone_type_other FROM phone WHERE contact_id = ?";
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, contactId);
		
		while ( rows.next() ) {
			phones.add( mapRowToPhone(rows) );
		}
		return phones;
	}


	
	@Override
	public void add(Phone phone) {
		String sql = "INSERT INTO phone (phone_id, contact_id, phone_number, phone_type, phone_type_other) VALUES (DEFAULT, ?, ?, ?, ?) RETURNING phone_id";
		Long id = jdbcTemplate.queryForObject(sql, Long.class, phone.getContactId(), phone.getPhoneNumber(), phone.getPhoneType(), phone.getPhoneTypeOther());
		phone.setId(id);
	}

	@Override
	public void update(Phone phone) {
		jdbcTemplate.update("UPDATE phone SET phone_number = ?, phone_type = ?, phone_type_other = ? WHERE phone_id = ?",
				phone.getPhoneNumber(), phone.getPhoneType(), phone.getPhoneTypeOther(), phone.getId());
		
	}

	@Override
	public void delete(long phoneId) {
		jdbcTemplate.update("DELETE FROM phone WHERE phone_id = ?", phoneId);
		
	}
	
	private Phone mapRowToPhone(SqlRowSet row) {
		Phone phone = new Phone();
		
		phone.setId( row.getLong("phone_id") );
		phone.setContactId( row.getLong("contact_id") );
		phone.setPhoneNumber( row.getString("phone_number") );
		phone.setPhoneType( row.getString("phone_type") );
		phone.setPhoneTypeOther( row.getString("phone_type_other") );
		
		return phone;
	}

}
