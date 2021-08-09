package com.srm.spring.api.Repo;

import com.srm.spring.api.Entity.College;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College,Integer> {
    
}
