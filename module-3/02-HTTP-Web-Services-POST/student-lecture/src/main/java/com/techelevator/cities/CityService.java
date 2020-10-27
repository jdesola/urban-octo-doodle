package com.techelevator.cities;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class CityService {
	
	private final static String API_URL = "https://5f983e6842706e00169582a3.mockapi.io/api/cities";
	
	private final static RestTemplate restTemplate = new RestTemplate();
	
	public List<City> list() {
		City[] cities = restTemplate.getForObject(API_URL, City[].class);
		
		return Arrays.asList(cities);
	}
	
	public City get(long cityId) {
		City city = restTemplate.getForObject(API_URL + "/" + cityId, City.class);
		return city;
	}
	
	public City add(City city) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType( MediaType.APPLICATION_JSON );
		HttpEntity<City> request = new HttpEntity<>(city, headers);
		
		city = restTemplate.postForObject(API_URL, request, City.class);
		return city;
	}
	
	public void update(City city) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType( MediaType.APPLICATION_JSON );
		HttpEntity<City> request = new HttpEntity<>(city, headers);
		
		restTemplate.put(API_URL + "/" + city.getId(), request);
	}
	
	public void delete(long cityId) {
		restTemplate.delete(API_URL + "/" + cityId);
	}
}
