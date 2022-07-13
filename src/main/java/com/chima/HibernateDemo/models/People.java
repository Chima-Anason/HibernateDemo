package com.chima.HibernateDemo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class People {
	
	@Id
	private Integer id;
	
	private String firstname;
	private String lastname;
	
	@ManyToOne
	@JoinColumn(name = "locationid", insertable = false, updatable = false)
	private Location location;
	private String email;
	
	@OneToMany(mappedBy = "people")
	private List<Post> post;
	
	
	private Integer locationid;
	
	
	@JsonManagedReference
	public List<Post> getPost() {
		return post;
	}


	public void setPost(List<Post> post) {
		this.post = post;
	}
	
	
	public People() {
	
	}


	public People(Integer id, String firstname, String lastname, Location location, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.email = email;
	}
	
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@JsonBackReference
	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getLocationid() {
		return locationid;
	}


	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}
	
	
	
	
	

}
