package com.chima.HibernateDemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chima.HibernateDemo.models.Location;
import com.chima.HibernateDemo.models.People;
import com.chima.HibernateDemo.services.LocationService;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	
	@GetMapping("/locations")
	public List<Location> getAllLocations() {
		
		return locationService.getAllLocations();
		
	}
	
	
	@GetMapping("/location/{id}")
	public Optional<Location> getLocationById(@PathVariable Integer id) {
		
		return locationService.getLocationById(id);
	}
	
	
	
	@GetMapping("/location/{id}/users")
	public List<People> getPeopleByLocationId(@PathVariable Integer id) {
		Optional<Location> location = locationService.getLocationById(id);
		
		if(location.isPresent()) {
			 Location newlocation = location.get();
			 
			 return newlocation.getPeoples();
		}
		return null;
	}
	
	
	@PostMapping("/locations/addNew")
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
	}
	
	
	
	@PutMapping("/location/{id}/update")
	public void updateLocation(@RequestBody Location location) {
		locationService.updateLocation(location);
	}
	
	
	@DeleteMapping("/location/{id}/delete")
	public void deleteLocation(@PathVariable Integer id) {
		locationService.deleteLocation(id);
	}
	

}
