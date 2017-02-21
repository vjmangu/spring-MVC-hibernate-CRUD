package com.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="User")
public class User {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;


	@Column(name = "userName", nullable=false ,unique=true)
	private String username;

	@Column(name = "email", nullable=false)
	private String email;

	@Column(name = "firstName", nullable=false)
	private String fname;

	@Column(name = "lastName", nullable=false)
	private String lname;

	@Column(name = "password", nullable=false)
	private String password;




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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

}
