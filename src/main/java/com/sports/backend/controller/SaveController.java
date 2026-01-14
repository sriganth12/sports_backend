package com.sports.backend.controller;

import com.sports.backend.entity.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.*;

interface UserRepo extends JpaRepository<User, Long> {}



@RestController
@CrossOrigin(origins = "*")
public class SaveController{
	
	@Autowired UserRepo repo;

	@PostMapping("/save")
	public String save(@RequestParam String username) {
		User u= new User();
		u.setUserName(username);
		repo.save(u);
		return "Saved : " + username;
	}
}



