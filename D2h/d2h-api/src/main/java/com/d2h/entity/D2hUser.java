package com.d2h.entity;

import com.d2h.model.Role;

public class D2hUser {
	private int userId;
	private String userName;
	private String password;
	private Role role;
	private String jwtToken;
	
	public String getJstToken() {
		return jwtToken;
	}
	public void setJstToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
