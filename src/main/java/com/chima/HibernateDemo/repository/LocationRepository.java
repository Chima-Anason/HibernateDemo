package com.chima.HibernateDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chima.HibernateDemo.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
