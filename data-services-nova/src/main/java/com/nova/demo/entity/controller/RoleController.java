package com.nova.demo.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nova.demo.entity.Role;
import com.nova.demo.entity.controller.repository.RoleRepository;

@RestController
public class RoleController {
	 @Autowired 
	 RoleRepository repo;

    @GetMapping(value="getRoles")
	public List<Role> getRoles(){
		
		return repo.findAll();
	}
    @PostMapping(value="saveuser")
    public String saveRole(@RequestBody Role role) {
    	repo.save(role);
    	return "savesuccess";
    }
    @GetMapping(value="getRoleById/{Id}")
    public Role getRole(@PathVariable Long id) {
    	return repo.getById(id);
    	
    }
    @DeleteMapping(value="deleting/{id}")
    public String getDeleted(@PathVariable Long id) {
    	repo.deleteById(id);
    	return "deleted Success";
    }
}
