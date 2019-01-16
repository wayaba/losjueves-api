package com.blitox.losjuevesapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TableView {

	@Id
	private long id;
	
    private String nick_name;

    private String points;
    
    private String win;
    
    private String lose;
    
    private String draw;
    
    private String pj;

    
    /**
     * Generic put method to map JPA native Query to this object.
     *
     * @param column
     * @param value
     */
    public void put(Object column, Object value) {
        if (((String) column).equals("nick_name")) {
        	setNick_name((String) value);
        } else if (((String) column).equals("points")) {
        	setPoints((String) value);
        } else if (((String) column).equals("win")) {
        	setWin((String) value);
        } else if (((String) column).equals("draw")) {
        	setDraw((String) value);
        } else if (((String) column).equals("lose")) {
        	setLose((String) value);
        } else if (((String) column).equals("pj")) {
        	setPj((String) value);
        } else if (((String) column).equals("lose")) {
        	setLose((String) value);
        } else if (((String) column).equals("id")) {
        	setId((long) value);
        }	
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

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}

	public String getLose() {
		return lose;
	}

	public void setLose(String lose) {
		this.lose = lose;
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}

	public String getPj() {
		return pj;
	}

	public void setPj(String pj) {
		this.pj = pj;
	}

}
