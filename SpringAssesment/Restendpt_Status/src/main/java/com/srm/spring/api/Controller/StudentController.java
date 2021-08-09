package com.srm.spring.api.Controller;

import java.util.List;

import com.srm.spring.api.Entity.Student;
import com.srm.spring.api.Service.StudentService;

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
public class StudentController {  
    @Autowired
    StudentService service;

    @PostMapping(value="/Studentpost")
    public ResponseEntity<Student> saveStudent(@RequestBody Student u) {
        Student stud = service.save(u);
        return new ResponseEntity<Student>(stud,HttpStatus.OK);
    }
    
    @PutMapping(value="/Studentupdate")
    public ResponseEntity<Student> updateStudent(@RequestBody Student u) {
        Student stud = service.getdetails(u);
        return new ResponseEntity<Student>(stud,HttpStatus.OK);
    }
    @GetMapping(value="/Student")
    public ResponseEntity<List<Student>> fetchUser()
    {
        service.findAll();
        return new ResponseEntity<List<Student>>(service.findAll(),HttpStatus.OK);
    }

    @DeleteMapping(value="/Student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) 
    {
         service.deleteStudent(id);
         return new ResponseEntity<String>("Record deleted ",HttpStatus.OK);
    }


    
}
