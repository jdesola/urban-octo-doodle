package com.techelevator.cities;

import java.util.List;

public class CityDemo {

	public static void main(String[] args) {
		
		CityService cityService = new CityService();
		
		List<City> cities = cityService.list();
		printCities( cities );

		City city = cityService.get(2);
		System.out.println(city);
		
		City newCity = new City();
		newCity.setCountryCode("USA");
		newCity.setDistrict("California");
		newCity.setName("Somewhere");
		newCity.setPopulation(23492472);
		
		cityService.add( newCity );
		
		printCities( cityService.list());
		
		city.setName("UPDATED");
		city.setPopulation(0);
		
		cityService.update( city );
		
		printCities( cityService.list());
		
		cityService.delete(8);
		
		printCities( cityService.list());
		
		
		
	}
	
	private static void printCities(List<City> cities) {
		for (City city : cities) {
			System.out.println( city );
		}
		System.out.println("********************************");
	}

}
