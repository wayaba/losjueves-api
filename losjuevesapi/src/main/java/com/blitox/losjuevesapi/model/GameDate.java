package com.blitox.losjuevesapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	private Player goal;
	
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
	
	@ManyToOne
	@JoinColumn(name="id_player_goal", nullable=true)
	public Player getGoal() {
		return goal;
	}
	public void setGoal(Player goal) {
		this.goal = goal;
	}
}
