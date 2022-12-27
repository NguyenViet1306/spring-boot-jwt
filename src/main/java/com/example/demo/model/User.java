package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(	name = "users", 
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email") 
	})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@NotBlank
	@Size (max = 20)
	public String username;
	
	@NotBlank
	@Size( max = 150)
	public String password;
	
	@Email
	@Size(max = 50)
	@NotBlank
	public String email;
	
	@ManyToMany(fetch = FetchType.LAZY) 
	@JoinTable( name = "user_role",
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> role = new HashSet<>(); 
	
	public User() {
	}

	public User(@NotBlank @Size(max = 20) String username, @NotBlank @Size(max = 150) String password,
			@Email @Size(max = 50) @NotBlank String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
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

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}
}
