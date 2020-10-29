package com.techelevator.cities.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.cities.dao.CityDao;
import com.techelevator.cities.exception.CityNotFoundException;
import com.techelevator.cities.model.City;

/*
 *  /cities   - GET (list), POST
 *  /cities/id - GET (one), PUT, DELETE
 */


@RestController
@RequestMapping("/cities")
public class CityController {

	private CityDao cityDao;
	
	public CityController(CityDao cityDao) {
		this.cityDao = cityDao;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<City> list(@RequestParam(required=false) String countryCode) {
		
		if (countryCode != null) {
			return cityDao.searchByCountryCode(countryCode);
		}
		
		return cityDao.list();
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.GET)
	public City get(@PathVariable long id) throws CityNotFoundException {
		return getCityIfExists(id);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method=RequestMethod.POST)
	public City add(@RequestBody City city) {
		return cityDao.add(city);
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.PUT)
	public City update(@RequestBody City city, @PathVariable long id) throws CityNotFoundException {
		getCityIfExists(city.getId());
		return cityDao.update(city);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(path="/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable long id) throws CityNotFoundException {
		getCityIfExists(id);
		cityDao.delete(id);
	}
	
	
	private City getCityIfExists(long id) throws CityNotFoundException {
		City city = cityDao.get(id);
		
		if (city == null) {
			throw new CityNotFoundException();
		}
		
		return city;
	}
	
}
