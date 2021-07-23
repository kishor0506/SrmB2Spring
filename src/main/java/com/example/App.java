package com.example;

import org.springframework.context.ApplicationContext;
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
        System.out.println("Singleton");

        Bank bank = (Bank) context.getBean("bid");
        bank.setBname("ICICI");
        bank.setCode(01);
        System.out.println("\nBank name: " + bank.getBname() + "\nCode: " + bank.getCode());
        Bank bank1 = (Bank) context.getBean("bid");
        System.out.println("\nBank name: " + bank1.getBname() + "\nCode: " + bank1.getCode());
        System.out.println("\nPrototype");
        Bank bank2 = (Bank) context.getBean("bid1");
        bank2.setBname("IOB");
        bank2.setCode(03);
        System.out.println("Bank name: " + bank2.getBname() + "\nCode: " + bank2.getCode());
        Bank bank3 = (Bank) context.getBean("bid1");
        System.out.println("Bank name: " + bank3.getBname() + "\nCode: " + bank3.getCode());
        Bank bank4 = (Bank) context.getBean("bid1");
        bank4.setBname("State Bank of India");
        bank4.setCode(2);
        System.out.println("Bank name: " + bank4.getBname() + "\nCode: " + bank4.getCode());
    }
}
