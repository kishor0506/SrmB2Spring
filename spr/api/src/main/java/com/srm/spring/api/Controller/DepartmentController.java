package com.srm.spring.api.Controller;

import java.util.List;

import com.srm.spring.api.Entity.Department;
import com.srm.spring.api.Service.DepartmentService;
import com.srm.spring.api.Service.DepartmentServiceImpl;

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
public class DepartmentController {
    
    @Autowired
    DepartmentServiceImpl service;

    @PostMapping(value="/departmentpost")
    public ResponseEntity<Department> savedepartment(@RequestBody Department deptdet) {
        Department dept = service.save(deptdet);
        return new ResponseEntity<Department>(dept,HttpStatus.OK);
    }
    
    // @PutMapping(value="/departmentupdate")
    // public ResponseEntity<Department> updatedepartment(@RequestBody Department deptdet) {
    //     Department dept = service.getdetails(deptdet);
    //     return new ResponseEntity<Department>(dept,HttpStatus.OK);
    // }
    @GetMapping(value="/department")
    public ResponseEntity<List<Department>> fetchcdept()
    {
        service.findAll();
        return new ResponseEntity<List<Department>>(service.findAll(),HttpStatus.OK);
    }
}

   