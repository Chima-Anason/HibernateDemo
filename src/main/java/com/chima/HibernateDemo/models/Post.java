package com.chima.HibernateDemo.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Post {
	
	@Id
	private Integer id;
	private LocalDateTime postDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "peopleid",insertable = false, updatable = false)
	private People people;
	private String details;
	
	
	private Integer peopleid;
	
	
	public Post() {
		
	}
	
	public Post(Integer id, LocalDateTime postDate, People people, String details) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.people = people;
		this.details = details;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public LocalDateTime getPostDate() {
		return postDate;
	}



	public void setPostDate(LocalDateTime postDate) {
		this.postDate = postDate;
	}


    @JsonBackReference
	public People getPeople() {
		return people;
	}



	public void setPeople(People people) {
		this.people = people;
	}



	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}

	public Integer getPeopleid() {
		return peopleid;
	}

	public void setPeopleid(Integer peopleid) {
		this.peopleid = peopleid;
	}
	
	
	
	
	

	
	
	
	
	

}
