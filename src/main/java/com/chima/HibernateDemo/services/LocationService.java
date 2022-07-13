package com.chima.HibernateDemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chima.HibernateDemo.models.Location;
import com.chima.HibernateDemo.repository.LocationRepository;

@Service
public class LocationService {
	
	
	@Autowired
	private LocationRepository locationRepository;

	public List<Location> getAllLocations() {
		
		return (List<Location>) locationRepository.findAll();
	}

	public Optional<Location> getLocationById(Integer id) {
		
		return locationRepository.findById(id);
	}
	
	

}
