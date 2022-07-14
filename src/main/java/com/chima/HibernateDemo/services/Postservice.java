package com.chima.HibernateDemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chima.HibernateDemo.models.Post;
import com.chima.HibernateDemo.repository.PostRepository;

@Service
public class Postservice {
	
	@Autowired
	private PostRepository postRepository;

	public List<Post> getAllPost() {
		
		return (List<Post>) postRepository.findAll();
	}

	public Optional<Post> getPostById(Integer id) {
		
		return postRepository.findById(id);
	}

	public List<Post> getPostsByPeopleId(Integer id) {
		
		return postRepository.findByPeopleId(id);
	}
	
	
	public void insertPost(Post post) {
		postRepository.save(post);
	}

	public void updatePost(Post post) {
		postRepository.save(post);
		
	}

	public void deletePost(Integer id) {
		postRepository.deleteById(id);
		
	}

}
