package com.srm.spring.api.Service;

import java.util.List;

import com.srm.spring.api.Entity.College;
import com.srm.spring.api.Entity.Student;
import com.srm.spring.api.Repo.CollegeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CollegeServImpl implements CollegeService {

    @Autowired
    CollegeRepo colrepo;


    @Override
    public List<College> findAll() {
        return colrepo.findAll();
    }

    @Override
    public College save(College cp) {
    
        Student stdobj = new Student();
        stdobj.setMail("kishore10456@gmail.com");
        stdobj.setName("kishore");
        stdobj.setAge(23);
        
        
        cp.setStd(stdobj);

       
    

        return colrepo.save(cp);
    }

    @Override
    public College getdetails(College cg) {
        return colrepo.save(cg);

  
    }
    
    
}
