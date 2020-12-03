package com.techelevator.parks.dao.park;

import java.util.List;

public interface ParkDao {

	List<Park> list();
	List<Park> getByState(String stateCode);
	
}
