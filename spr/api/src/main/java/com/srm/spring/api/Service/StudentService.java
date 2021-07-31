package com.srm.spring.api.Service;
import java.util.List;


import com.srm.spring.api.Entity.Student;


public interface StudentService {

    List<Student> findAll();
     
     Student save(Student o);
    public Student getdetails(Student sd);

    public void deleteStudent(int Id);


}
