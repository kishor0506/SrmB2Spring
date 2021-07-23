package com.srm.spring.api.Rest;


import java.util.Arrays;
import java.util.List;

import com.srm.spring.api.Service.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi extends BaseRestApi{
    @Autowired
    private Car service;

    @GetMapping(value = "/names",produces = MediaType.APPLICATION_JSON_VALUE)
 public ResponseEntity< List<String>>getNames(){
     return new ResponseEntity<List<String>>(service.getNames(),HttpStatus.OK);
 }
  @PutMapping(value = "")
}
 
    

