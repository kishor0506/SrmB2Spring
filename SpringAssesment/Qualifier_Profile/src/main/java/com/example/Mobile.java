package com.example;

public class Mobile {
    String Brand;
    Integer modelNo;


    public Mobile(){
           super();
          System.out.println("constructor invoked");
    }
    
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }
    public Integer getModelNo() {
        return modelNo;
    }
    public void setModelNo(Integer modelNo) {
        this.modelNo = modelNo;
    }
    @Override
    public String toString() {
        return "Mobile [Brand=" + Brand + ", modelNo=" + modelNo + "]";
    }
}
