package com.srm.spring.api.Entity;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
	@NotBlank(message = "Studentname field req***")
    @Size(min=3,message = "Studentname must have Minimum characters-->3")
    public String name;
	@Email(message = "Invalid Email ")
	public String mail;
	
	@Temporal(value=TemporalType.DATE)
    @Column(name="CREATED_TIME")
    private Date dt=new Date(System.currentTimeMillis());

    @Column(name="Age")
    @Transient
    private int age;

	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


    
    
}
