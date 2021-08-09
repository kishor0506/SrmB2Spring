package com.srm.spring.api.Service;

import java.util.List;

import com.srm.spring.api.Entity.Department;

public interface DepartmentService {
    List<Department> findAll();
     
    Department save(Department dep);
//    public Department getdetails(Department depdet);





}
