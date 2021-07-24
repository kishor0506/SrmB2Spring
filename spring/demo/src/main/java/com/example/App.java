package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Sample s = (Sample) context.getBean("sample");
        System.out.println(s.getName());
        Car c = (Car) context.getBean("car");
        System.out.println(c.getSamp().getName());
        System.out.println(c.getModel());
        System.out.println(c.getType());
        Collection jc = (Collection) context.getBean("Collection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
      
        Lifecycle lifeobj = (Lifecycle) context.getBean("lf");
        lifeobj.getMessage();
        ((AbstractApplicationContext) context).registerShutdownHook();

        System.out.println("Singleton");
        Mobile mobile =(Mobile) context.getBean("mid");
        mobile.setBrand("oneplus");
        mobile.setModelNo(12);
        System.out.println("\nBrand name: " +mobile.getBrand()+ "\nModeNo"+mobile.getModelNo());
        Mobile mobile1 =(Mobile) context.getBean("mid");
        System.out.println("\nBrand name: " +mobile1.getBrand()+ "\nModeNo"+mobile1.getModelNo());
        System.out.println("\nPrototype");
        Mobile mobile2 =(Mobile) context.getBean("mid1");
        mobile2.setBrand("oppo");
        mobile2.setModelNo(15);
        System.out.println("\nBrand name: " +mobile2.getBrand()+ "\nModeNo"+mobile2.getModelNo());
        Mobile mobile3 =(Mobile) context.getBean("mid1");
        System.out.println("\nBrand name: " +mobile3.getBrand()+ "\nModeNo"+mobile3.getModelNo());
        Mobile mobile4 =(Mobile) context.getBean("mid1");
        mobile4.setBrand("vivo");
        mobile4.setModelNo(18);
        System.out.println("\nBrand name: " +mobile4.getBrand()+ "\nModeNo"+mobile4.getModelNo());
    }


}
