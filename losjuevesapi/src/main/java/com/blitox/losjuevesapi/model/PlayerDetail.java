package com.blitox.losjuevesapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerDetail {

	@Id
    private String description;

    private String points;
    
    private String win;
    
    private String lose;
    
    private String draw;
    
    private String pj;
    
    private String mvp;
    
    /**
     * Generic put method to map JPA native Query to this object.
     *
     * @param column
     * @param value
     */
    public void put(Object column, Object value) {
        if (((String) column).equals("description")) {
        	setDescription((String) value);
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
        } else if (((String) column).equals("mvp")) {
        	setMvp((String) value);
        }
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getMvp() {
		return mvp;
	}

	public void setMvp(String mvp) {
		this.mvp = mvp;
	}
    
	

}
