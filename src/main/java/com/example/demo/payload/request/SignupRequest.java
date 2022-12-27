package com.example.demo.payload.request;

import java.util.List;

import javax.validation.constraints.*;

public class SignupRequest {

	@Size(min=3, max=20)
	private String username;
	
	@Email
	@Size(max=50)
	private String email;
	
	@Size(min=6, max=40)
	private String password;
	
	private List<String> role;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}
	
	}
