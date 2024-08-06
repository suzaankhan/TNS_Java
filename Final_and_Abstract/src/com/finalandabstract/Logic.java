package com.finalandabstract;

public class Logic {
    
    final private int salary = 5000; // value to final var must be initialised during declaration

    public final void display(){
        // salary--;  //this gives error since salary is now a constant value because of final
        System.out.println("Printed from a final method");
        System.out.println(salary);
    }

    public int getSalary(){
        return salary;
    }

}
