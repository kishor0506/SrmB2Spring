package com.srm.spring.api.Service;

import java.util.List;

import com.srm.spring.api.Entity.Department;
import com.srm.spring.api.Repo.DepartmentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepo repo;
    @Override
    public List<Department> findAll() {
        
        return repo.findAll();
    }

    @Override
    public Department save(Department dep) {
       
        return repo.save(dep);
    }

    // @Override
    // public Department getdetails(integer ) {
       
    //     return repo.findById(id);
    // }
    
}
