package com.srm.spring.api.Rest;


import java.util.Arrays;
import java.util.List;

import com.srm.spring.api.Service.Car;
import com.srm.spring.api.vo.Mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi extends BaseRestApi{
    @Autowired
    private Car service;

    @GetMapping(value = "/names",produces = MediaType.APPLICATION_JSON_VALUE)
 public ResponseEntity< List<String>>getNames(){
     return new ResponseEntity<List<String>>(service.getNames(),HttpStatus.OK);
 }
 @PutMapping(value = "/mobile",produces = MediaType.APPLICATION_JSON_VALUE)
 public void addMobile(@RequestBody Mobile mob)
 {
     System.out.println(mob);
     service.persitMObile(mob);
 }
 @PostMapping(value = "/mobile",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Mobile>> updateMObile(@RequestBody Mobile mob)
    {
        System.out.println(mob);
        service.persitMObile(mob);
        return  new ResponseEntity<List<Mobile>>(service.fetchAllmob(),HttpStatus.OK);
    }
 
}
 
    

