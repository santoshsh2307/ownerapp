package com.nova.demo.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nova.demo.entity.Role;
import com.nova.demo.entity.controller.repository.RoleRepository;
import com.nova.demo.service.RoleService;

@Service 
public class RoleServiceImpl implements RoleService {
	
    @Autowired
	RoleRepository repo;
    
    @Transactional
    public void save(Role role) {
	
		repo.save(role);
	}
	
	 

}




