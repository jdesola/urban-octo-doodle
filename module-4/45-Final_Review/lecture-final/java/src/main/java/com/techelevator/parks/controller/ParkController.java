package com.techelevator.parks.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.parks.dao.park.Park;
import com.techelevator.parks.dao.park.ParkDao;
import com.techelevator.parks.dao.states.State;
import com.techelevator.parks.dao.states.StateDao;

@RestController
@CrossOrigin
public class ParkController {

	private ParkDao parkDao;
	private StateDao stateDao;
	
	public ParkController(ParkDao parkDao, StateDao stateDao) {
		this.parkDao = parkDao;
		this.stateDao = stateDao;
	}
	
	@RequestMapping(path="/parks", method=RequestMethod.GET) 
	public List<Park> listParks(@RequestParam(required=false) String stateCode) {
		
		if (stateCode != null) {
			return parkDao.getByState(stateCode);
		}
		return parkDao.list();
	}
	
	@RequestMapping(path="/states", method=RequestMethod.GET)
	public List<State> listStates() {
		return stateDao.list();
	}
	

	
}
