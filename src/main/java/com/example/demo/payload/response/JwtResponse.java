package com.example.demo.payload.response;

import java.util.List;

public class JwtResponse {
	private Long id;
	private String username;
	private String email;
	private String token;
	private List<String> roles;
	private String type = "Beare";
	public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles) {
	    this.token = accessToken;
	    this.id = id;
	    this.username = username;
	    this.email = email;
	    this.roles = roles;
	  }
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
