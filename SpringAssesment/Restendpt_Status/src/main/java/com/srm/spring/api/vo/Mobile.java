package com.srm.spring.api.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Mobile {
    @NotNull
    private Integer id;

    @NotNull
    @Size(min=5,message = "minimum 5 characters")
    private String name;
    private String brand;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", name=" + name + "]";
    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
