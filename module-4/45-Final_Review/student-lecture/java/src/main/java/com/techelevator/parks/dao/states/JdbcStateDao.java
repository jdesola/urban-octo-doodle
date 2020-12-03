package com.techelevator.parks.dao.states;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcStateDao implements StateDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcStateDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<State> list() {
		List<State> states = new ArrayList<State>();
		
		String sql = "SELECT code, name FROM states";
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql);
		
		while (rows.next()) {
			states.add( new State( rows.getString("code"), rows.getString("name")));
		}
		return states;
	}
	
	
	
}
