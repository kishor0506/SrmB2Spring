package com.srm.spring.api.Repo;

import com.srm.spring.api.Entity.Department;
import com.srm.spring.api.Entity.DepartmentPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,DepartmentPk> {

   

}
