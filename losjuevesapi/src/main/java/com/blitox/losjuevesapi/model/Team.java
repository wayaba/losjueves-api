package com.blitox.losjuevesapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "team")
public class Team {
	
	private long id; 
	private String description; 
	
	
	public Team() {
		
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

	@Override
	public String toString() {
		return "Team [id=" + id + ", description=" + description + "]";
	}
	


    

}