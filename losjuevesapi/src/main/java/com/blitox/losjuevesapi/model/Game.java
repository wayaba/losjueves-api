package com.blitox.losjuevesapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "game")
public class Game {
	
	private long id;
	private Player player; 
	private GameDate gameDate; 
	private Team team;
	private Result result;
	
	public Game() {
		
	}

	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	public long getId() { 
		return id; 
	} 
	
	public void setId(long id) { 
		this.id = id; 
	}
	
	@ManyToOne
	@JoinColumn(name="id_player", nullable=false)
	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}

	@ManyToOne
	@JoinColumn(name="id_game_date", nullable=false)
	public GameDate getGameDate() {
		return gameDate;
	}

	public void setGameDate(GameDate gameDate) {
		this.gameDate = gameDate;
	}

	@ManyToOne
	@JoinColumn(name="id_team", nullable=false)
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@ManyToOne
	@JoinColumn(name="id_result", nullable=true)
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
	


    

}