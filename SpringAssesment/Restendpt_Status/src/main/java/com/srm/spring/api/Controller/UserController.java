package com.srm.spring.api.Controller;


import java.util.List;

import com.srm.spring.api.Entity.user;
import com.srm.spring.api.Service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

@RequestMapping("api")
public class UserController {
    
    @Autowired
    UserServiceImpl service;

    @GetMapping(value="/user")
    public ResponseEntity<List<user>> findAllUser() {
    return new ResponseEntity<List<user>>(service.getUser(), HttpStatus.CREATED);	
    }
 

    @PostMapping(value="/userpost")
    public ResponseEntity<user> saveStudent(@RequestBody user u) {
        user usinfo = service.saveUser(u);
        return new ResponseEntity<user>(usinfo,HttpStatus.ACCEPTED);
    }
}

   