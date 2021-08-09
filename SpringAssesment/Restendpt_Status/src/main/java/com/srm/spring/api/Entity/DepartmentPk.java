package com.srm.spring.api.Entity;

import java.io.Serializable;

public class DepartmentPk implements Serializable{
    private int deptid;
    private int subid;
    public int getDeptid() {
        return deptid;
    }
    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
    public int getSubid() {
        return subid;
    }
    public void setSubid(int subid) {
        this.subid = subid;
    }

     
}