package com.srm.spring.api.Rest;


import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import com.srm.spring.api.Service.Car;
import com.srm.spring.api.vo.Mobile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
 
 @PostMapping(value = "/mobile",produces = MediaType.APPLICATION_JSON_VALUE)
 public void addMobile(@Valid @RequestBody Mobile mob)
 {
    //  int a=5/0;
     System.out.println(mob);
     service.persitMObile(mob);
 }
 @PutMapping(value = "/mobile",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Mobile>> updateMObile(@RequestBody Mobile mob)
    {
        System.out.println(mob);
        service.persitMObile(mob);
        return  new ResponseEntity<List<Mobile>>(service.fetchAllmob(),HttpStatus.OK);
    }
    
    @DeleteMapping(value = "/deleteData/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Mobile>> deleteByCustId(@PathVariable Integer cid)
    {
       return new ResponseEntity<List<Mobile>>(service.deleteById(cid),HttpStatus.OK);
    }


 
 
}
 
    

