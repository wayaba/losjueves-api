package com.blitox.losjuevesapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< Upstream, based on origin/master
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name = "game_date")
public class GameDate {
//https://dzone.com/articles/spring-boot-2-hibernate-5-jpa-mysql-crud-rest-api
	private long id; 
	private String description; 
	private Player mvp;
	private Date date;
	
	public GameDate() {
		
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_player", referencedColumnName="id", nullable = true)
	public Player getMvp() {
		return mvp;
	}

	public void setMvp(Player player) {
		this.mvp = player;
	}

	@Column(name = "date", nullable = true)
	@DateTimeFormat (pattern="dd-MM-yyyy")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "GameDate [id=" + id + ", description=" + description + ", mvp=" + mvp + ", date=" + date + "]";
	}

	

}
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name = "game_date")
public class GameDate {

	private long id;
	private Date date;
	private String description;
	private int number;
	private Player mvp;
	
	public GameDate() {
		
	}
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "date", nullable = false)
	@DateTimeFormat (pattern="dd-MM-yyyy")
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "number", nullable = false)
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@ManyToOne
	@JoinColumn(name="id_player", nullable=true)
	public Player getMvp() {
		return mvp;
	}
	public void setMvp(Player mvp) {
		this.mvp = mvp;
	}
	
}
>>>>>>> 65f8303 subo todo
