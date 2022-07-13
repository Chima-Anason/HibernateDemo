package com.chima.HibernateDemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chima.HibernateDemo.models.Post;
import com.chima.HibernateDemo.services.Postservice;

@RestController
public class PostController {
	
	@Autowired
	private Postservice postservice;
	
	
	@GetMapping("/posts")
	public List<Post> getAllPost() {
		
		return postservice.getAllPost();
	}
	
	
	@GetMapping("/post/{id}")
	public Optional<Post> getPostById(@PathVariable Integer id) {
		
		return postservice.getPostById(id);
	}
	
	
	@GetMapping("/posts/user/{id}/posts")
	public List<Post> getPostsByPeopleId(@PathVariable Integer id) {
		
		return postservice.getPostsByPeopleId(id);
	}
	
	@PostMapping("/posts/addNew")
	public void addPost(@RequestBody Post post) {
		postservice.insertPost(post);
	}

}
