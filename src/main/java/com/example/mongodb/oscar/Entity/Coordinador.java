package com.example.mongodb.oscar.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "coordinador")
public class Coordinador {

	@Id 
	private String id;
	private String user;
	private String password;
	
	
	public Coordinador() {
		// TODO Auto-generated constructor stub
	}


	public Coordinador(String id, String user, String password) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

