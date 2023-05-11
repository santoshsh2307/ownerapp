package com.nova.demo.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nova.demo.entity.UserDetails;
import com.nova.demo.entity.controller.repository.UserDetailsRepository;

@RestController
public class UserDetailsController {
	@Autowired
  UserDetailsRepository repo;
	@GetMapping(value="getdetails")
	public List<UserDetails> getAllUserDetails(){
		return repo.findAll();
	}
	@PostMapping(value="savedetails")
	public String saveDetails(@RequestBody UserDetails user) {
		repo.save(user);
		return "save Success";
		
	}
}
