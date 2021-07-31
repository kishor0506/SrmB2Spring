package com.srm.spring.api.Repo;


import com.srm.spring.api.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

    
}
