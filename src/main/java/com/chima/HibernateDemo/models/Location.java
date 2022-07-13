package com.chima.HibernateDemo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Location {
	
	@Id
	private Integer id;
	private String name;
	
	
	@OneToMany(mappedBy = "location")
	private List<People> peoples;
	
	
	
	public List<People> getPeoples() {
		return peoples;
	}


	public void setPeoples(List<People> peoples) {
		this.peoples = peoples;
	}


	public Location() {
		
	}


	public Location(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
