package com.cts.demo.model;

import java.io.Serializable;

public class AppUserModel implements Serializable {
	private static final long serialVersionUID = 8249261126864947305L;
	private String username;
	private String password;
	
	//need default constructor for JSON parsing
	public AppUserModel() {
	}

	public AppUserModel(String username, String password) {
		this.username = username;
		this.password = password;
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
	
	
}
