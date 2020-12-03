package com.techelevator.parks.dao.favorites;

import java.util.List;

import com.techelevator.parks.dao.park.Park;

public interface FavoriteParkDao {

	List<FavoritePark> getFavoriteParksForUser(String username);
	void addFavoritePark(String parkCode, String username);
	void deleteFavoritePark(String parkCode, String username);
	
}
