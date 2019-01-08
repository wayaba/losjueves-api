package com.blitox.losjuevesapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "result")
public class Result {
//https://dzone.com/articles/spring-boot-2-hibernate-5-jpa-mysql-crud-rest-api
	private long id; 
	private String description; 
	private int points;
	
	
	public Result() {
		
	}
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	public long getId() { 
		return id; 
	} 
	
	public void setId(long id) { 
		this.id = id; 
	}
	
	@Column(name = "description", nullable = false) 
	public String getDescription() { 
		return description; 
	} 
	
	public void setDescription(String description) { 
		this.description = description; 
	}
	
	@Column(name = "points", nullable = false)
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", description=" + description + ", points=" + points + "]";
	}

    

}