package com.srm.spring.api.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     public Long id;
     @NotBlank(message = "username field req***")
    @Size(min=3,message = "username must have Minimum characters-->3")
    public String name;
	@Email(message = "Invalid Email ")
	public String mail;

    
}
