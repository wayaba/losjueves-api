package com.blitox.losjuevesapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GameDateDetail {

	@Id
	private long id;
	 
    private String nick_name;
    private long id_player;
    private String result;
    private String team;
    
    /**
     * Generic put method to map JPA native Query to this object.
     *
     * @param column
     * @param value
     */
    public void put(Object column, Object value) {
        if (((String) column).equals("nick_name")) {
        	setNick_name((String) value);
        } else if (((String) column).equals("result")) {
        	setResult((String) value);
        } else if (((String) column).equals("team")) {
        	setTeam((String) value);
        } else if (((String) column).equals("id")) {
        	setId((long) value);
        } 
    }

	public long getId_player() {
		return id_player;
	}

	public void setId_player(long id_player) {
		this.id_player = id_player;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
    
	

}
