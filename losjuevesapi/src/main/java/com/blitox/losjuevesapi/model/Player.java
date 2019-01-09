package com.blitox.losjuevesapi.model;

import java.util.Date;
<<<<<<< Upstream, based on origin/master
import java.util.Set;
=======
import java.util.List;
>>>>>>> 65f8303 subo todo

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name = "player")
public class Player {
//https://dzone.com/articles/spring-boot-2-hibernate-5-jpa-mysql-crud-rest-api
	private long id; 
	private String firstName; 
	private String lastName;
	private String nickName;
	private Date birth;
	
<<<<<<< Upstream, based on origin/master
	@OneToMany(mappedBy = "mvp", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<GameDate> mvps;
=======
	@OneToMany(mappedBy="mvp")
	private List<GameDate> mvps;
>>>>>>> 65f8303 subo todo
	
	public Player() {
		
	}
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	public long getId() { 
		return id; 
	} 
	
	public void setId(long id) { 
		this.id = id; 
	}
	
	@Column(name = "first_name", nullable = false) 
	public String getFirstName() { 
		return firstName; 
	} 
	
	public void setFirstName(String firstName) { 
		this.firstName = firstName; 
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "nick_name", nullable = false)
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "birth", nullable = true)
	@DateTimeFormat (pattern="dd-MM-yyyy")
	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

<<<<<<< Upstream, based on origin/master
	/*
	// gameDate
    public void setMvps(Set<GameDate> gameDate){
    	this.mvps = gameDate;
    }
    
    public Set<GameDate> Mvps(){
    	return this.mvps;
    }
    */
=======
	
>>>>>>> 65f8303 subo todo
	@Override
	public String toString() {
		return "Player [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName
				+ ", birth=" + birth + "]";
	}

}