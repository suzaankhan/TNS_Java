package com.staticprograms;

public class StaticDemo {
    
    public static void main(String[] args) {
        // Employee companyName; // calling static variable
        Employee obj = new Employee("Suma", 22); // calling constructor
        Employee obj2 = new Employee("rama", 45);

        System.out.println("Company Name: " + Employee.companyName);
        System.out.println(obj);
        System.out.println(obj2);
        Employee.companyName = "TATA power";
        System.out.println("Company Name: " + Employee.companyName);
    }

}
