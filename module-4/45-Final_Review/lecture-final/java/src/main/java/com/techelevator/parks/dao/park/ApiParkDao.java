package com.techelevator.parks.dao.park;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiParkDao implements ParkDao {

	private static final String baseUrl = "https://developer.nps.gov/api/v1/parks";
	private static final String apiKey = "c2NGoeD1S0EWjjG98SUp2rPZYado0jZdd9oX8tb9";
	
	private static final RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public List<Park> list() {
		
		String url = baseUrl + "?api_key=" + apiKey;
		ParkApiResponse response = restTemplate.getForObject(url, ParkApiResponse.class);
	
		return response.getData();
	}

	@Override
	public List<Park> getByState(String stateCode) {
		String url = baseUrl + "?stateCode=" + stateCode + "&api_key=" + apiKey;
		ParkApiResponse response = restTemplate.getForObject(url, ParkApiResponse.class);
	
		return response.getData();
	}
	
	
}
