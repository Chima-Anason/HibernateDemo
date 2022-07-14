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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chima.HibernateDemo.models.People;
import com.chima.HibernateDemo.models.Post;
import com.chima.HibernateDemo.services.PeopleService;

@RestController
public class PeopleController {
	
	@Autowired
	private PeopleService peopleService;
	
	
	@GetMapping("/users")
	public List<People> getAllPeople() {
		
		return peopleService.getAllPeople();
		
	}
	
	@GetMapping("/user/{id}")
	public Optional<People> getPeopleById(@PathVariable Integer id) {
		return peopleService.getPeopleById(id);
	}
	
	
	@GetMapping("/user/{id}/posts")
	public List<Post> getPostByUserId(@PathVariable Integer id) {
		Optional<People> people = peopleService.getPeopleById(id);
		
		if(people.isPresent()) {
			return people.get().getPost();
		}
		return null;
	}
	
	
	
	@GetMapping("/users/location/{id}/users")
	public List<People> getUsersByLocationId(@PathVariable Integer id) {
		return peopleService.getPeopleByLocationId(id);
	}
	
	
	@PostMapping("/users/addNew")
	public void addPeople(@RequestBody People people) {
		
		peopleService.insertPeople(people);
	}
	
	
	@PutMapping("/users/{id}/update")
	public void updateUser(@RequestBody People people) {
		peopleService.updateUser(people);
	}
	
	
	@DeleteMapping("/user/{id}/delete")
	public void deleteUser(@PathVariable Integer id) {
		peopleService.deletePost(id);
	}
	

}
