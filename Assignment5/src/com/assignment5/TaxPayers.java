package com.assignment5;

public abstract class TaxPayers{

    protected float salary;
    protected String name;

    // abstract methofd
    public abstract  void calTax();

    // constructor in abstract class requires body
    // we will call this constructor using super() since this class is a parent class as well
    public TaxPayers(float salary, String name){
        this.salary = salary;
        this.name = name;
    }

    // normal method
    public void sayHello(){
        System.out.println("This is a normal method in abstract class");
    }

}
