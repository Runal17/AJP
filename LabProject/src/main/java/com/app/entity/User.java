package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String email;
	private long mobile;
	
	
	
	
	public User() {}




	public User(int id, String username, String password, String email, long mobile) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}




	public User(String username, String password, String email, long mobile) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public long getMobile() {
		return mobile;
	}




	public void setMobile(long mobile) {
		this.mobile = mobile;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
	
	
}
