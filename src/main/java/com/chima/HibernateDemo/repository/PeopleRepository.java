package com.chima.HibernateDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chima.HibernateDemo.models.People;

@Repository
public interface PeopleRepository extends CrudRepository<People, Integer> {

	List<People> findByLocationId(Integer id);
}
