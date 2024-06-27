package com.assignment5;

public class Main {

    public static void main(String[] args) {

        // this will call constructors
        EmployeeOne emp_one = new EmployeeOne(35000F, "Employee 1");
        EmployeeTwo emp_two = new EmployeeTwo(15000F, "Employee 2");

        // calculating tax
        emp_one.calTax();
        emp_two.calTax();

        // calling a normal method from abstract class Taxpayers
        emp_one.sayHello();

    }
    
}
