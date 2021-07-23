package com.example;
public class Car {
    private Sample samp;
    private String model;
    public Sample getSamp() {
        return samp;
    }
    public void setSamp(Sample samp) {
        this.samp = samp;
    }
    private String type;
    private int year;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return type;
    }
   
    
    public Car(String model, String type,int year) {
        this.model = model;
        this.type = type;
        this.year=year;
        System.out.println(model);
        System.out.println(type);
        System.out.println(year);
        
    }
    public void setType(String type) {
        this.type = type;
    }
    public Car()
    {

    }
    
}
