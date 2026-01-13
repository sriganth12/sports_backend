package com.sports.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_details")

public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	public String username;
	
	public void setUserName(String username) {
		this.username=username;
	}
}