package com.chima.HibernateDemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chima.HibernateDemo.models.People;
import com.chima.HibernateDemo.repository.PeopleRepository;

@Service
public class PeopleService {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	public List<People> getAllPeople() {
		return (List<People>) peopleRepository.findAll();
	}

	public Optional<People> getPeopleById(Integer id) {
		
		return peopleRepository.findById(id);
	}

	public List<People> getPeopleByLocationId(Integer id) {
		
		return peopleRepository.findByLocationId(id);
	}
	
	public void insertPeople(People people) {
		peopleRepository.save(people);
	}



}
