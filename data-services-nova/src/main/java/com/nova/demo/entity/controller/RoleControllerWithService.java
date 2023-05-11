package com.nova.demo.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nova.demo.entity.Role;
import com.nova.demo.service.RoleService;

@RestController
public class RoleControllerWithService {
	@Autowired
	RoleService service;
	
	@PostMapping(value="saveRoleSer")
	public String saveRole(@RequestBody Role role) {
		service.save(role);
		return "success";
	}

}
