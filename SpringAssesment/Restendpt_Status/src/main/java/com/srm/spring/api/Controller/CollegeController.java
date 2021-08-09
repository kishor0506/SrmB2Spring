package com.srm.spring.api.Controller;

import java.util.List;

import com.srm.spring.api.Entity.College;
import com.srm.spring.api.Service.CollegeService;

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
public class CollegeController {
    
    @Autowired
    CollegeService service;

    @PostMapping(value="/Collegepost")
    public ResponseEntity<College> saveCollege(@RequestBody College coldet) {
        College col = service.save(coldet);
        return new ResponseEntity<College>(col,HttpStatus.OK);
    }
    
    @PutMapping(value="/Collegeupdate")
    public ResponseEntity<College> updateCollege(@RequestBody College coldet) {
        College col = service.getdetails(coldet);
        return new ResponseEntity<College>(col,HttpStatus.OK);
    }
    @GetMapping(value="/College")
    public ResponseEntity<List<College>> fetchcollege()
    {
        service.findAll();
        return new ResponseEntity<List<College>>(service.findAll(),HttpStatus.OK);
    }

   



}
