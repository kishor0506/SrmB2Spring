package com.srm.spring.api.Service;

import java.util.List;
import java.util.Optional;



import com.srm.spring.api.Entity.Student;
import com.srm.spring.api.Repo.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo repo;

	@Override
	public List<Student> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Student save(Student o) {
		
		return repo.save(o);
	}

	@Override
	public void deleteStudent(int Id) {
		repo.deleteById((long) Id);
		
	}

	@Override
	public Student getdetails(Student sd) {
		return repo.save(sd);
		
	}
    
}
