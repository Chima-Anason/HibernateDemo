package com.chima.HibernateDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chima.HibernateDemo.models.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

	List<Post> findByPeopleId(Integer Id);
}
