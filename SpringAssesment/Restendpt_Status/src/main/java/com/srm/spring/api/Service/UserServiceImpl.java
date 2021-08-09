package com.srm.spring.api.Service;
import java.util.List;

import com.srm.spring.api.Entity.user;
import com.srm.spring.api.Repo.userRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl{
    @Autowired
	private userRepo repo;
	

	
	 public List<user> getUser() {
	        return repo.findAll();
	    }

    public user saveUser(user us) {
         return repo.save(us);
    	}

  
    }
