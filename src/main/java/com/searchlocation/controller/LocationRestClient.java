package com.searchlocation.controller;

import org.springframework.web.client.RestTemplate;

import com.searchlocation.dto.Location;

public class LocationRestClient {
	
	public Location getLocation(long id) {
		RestTemplate restTemplate= new RestTemplate();
		Location location = restTemplate.getForObject("http://localhost:8080/location/"+id, Location.class);
		return location;
	}
}
