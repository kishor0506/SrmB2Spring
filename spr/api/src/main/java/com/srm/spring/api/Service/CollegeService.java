package com.srm.spring.api.Service;

import java.util.List;

import com.srm.spring.api.Entity.College;

public interface CollegeService {
    List<College> findAll();
     
    College save(College cp);
    
   public College getdetails(College cg);
}
