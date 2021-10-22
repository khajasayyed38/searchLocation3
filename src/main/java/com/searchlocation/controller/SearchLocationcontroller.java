package com.searchlocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchlocation.dto.Location;

@Controller
public class SearchLocationcontroller {

	@RequestMapping("/searchLocation")
	public String showSearchLocation() {
		return "searchLocation";
	}
	
	@RequestMapping("/findLocation")
	public String findLocationById(@RequestParam("id") long id, ModelMap modelMap) {
		LocationRestClient restclient= new LocationRestClient();
		Location location = restclient.getLocation(id);
		modelMap.addAttribute("location", location);
		return"searchResult";
	}
}
