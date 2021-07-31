package com.srm.spring.api.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class College {
    @Id
    private int cid;
    private String name;
    private String location;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Student Std;
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Student getStd() {
        return Std;
    }
    public void setStd(Student std) {
        Std = std;
    }
    @Override
    public String toString() {
        return "College [Std=" + Std + ", cid=" + cid + ", location=" + location + ", name=" + name + "]";
    }

    
    
    
}
