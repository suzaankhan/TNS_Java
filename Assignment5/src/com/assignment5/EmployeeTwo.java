package com.assignment5;

public class EmployeeTwo extends TaxPayers{

    public EmployeeTwo(float salary, String name){
        super(salary, name);
    }

    @Override
    public void calTax() {
        if(salary <= 10000){
            // 7% tax
            System.out.println("Tax is 7%");
            System.out.println("Tax for "+ this.name + " is " + (this.salary*0.07) + " Rs");
        }
        if(salary <= 20000){
            // 14% tax
            System.out.println("Tax is 14%");
            System.out.println("Tax for "+ this.name + " is " + (this.salary*0.14) + " Rs");
        }
        else{
            // 18% tax
            System.out.println("Tax is 18%");
            System.out.println("Tax for "+ this.name + " is " + (this.salary*0.18) + " Rs");
        }
    }
    
}
