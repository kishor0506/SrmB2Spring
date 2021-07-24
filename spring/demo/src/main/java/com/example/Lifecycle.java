package com.example;

public class Lifecycle {
    private String message;
	 
    public Lifecycle() {
        super();
    }

      public void setMessage(String message){
         this.message = message;
      }
      public void getMessage(){
         System.out.println("Your Message : " + message);
      }
      public void init()
      {
         System.out.println("Bean inside init ");
      }
      public void destroy() {
         System.out.println("Bean in destroy method");
      }
}
