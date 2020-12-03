package com.techelevator.parks.dao.favorites;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcFavoriteParkDao implements FavoriteParkDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcFavoriteParkDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<FavoritePark> getFavoriteParksForUser(String username) {
		List<FavoritePark> parks = new ArrayList<FavoritePark>();
		String sql = "SELECT fp.park_code FROM favorite_parks fp "  +
				 	  "JOIN users u ON u.user_id = fp.user_id " +
				 	  "WHERE u.username = ?";
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, username);
		
		while (rows.next()) {
			parks.add( new FavoritePark( rows.getString("park_code")));
		}
		
		return parks;
	}

	@Override
	public void addFavoritePark(String parkCode, String username) {
		String sql = "INSERT INTO favorite_parks (user_id, park_code) VALUES ((SELECT user_id FROM users WHERE username = ?), ?)";
		jdbcTemplate.update(sql, username, parkCode);
	}

	@Override
	public void deleteFavoritePark(String parkCode, String username) {
		String sql = "DELETE FROM favorite_parks WHERE user_id = (SELECT user_id FROM users WHERE username = ?) AND park_code = ?";
		jdbcTemplate.update(sql, username, parkCode);
		
	}
	
	
	
}
