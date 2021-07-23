package com.example;

public class Bank {
 String Bname;
 Integer code;

 public Bank(){
     super();
     System.out.println("constructor invoked");
 }
public String getBname() {
	return Bname;
}
public void setBname(String bname) {
	Bname = bname;
}
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
 
}
