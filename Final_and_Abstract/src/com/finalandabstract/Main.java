package com.finalandabstract;

public class Main extends Logic{

    public static void main(String[] args) {
        Logic obj_one = new Logic();
        System.out.println(obj_one.getSalary());
        obj_one.display();
    }

    //This gives error since final method cannot be overriden
    // @Override
    // public final void display(){
    //     // salary--;  //this gives error since salary is now a constant value because of final
    //     System.out.println("Printed from a final method");
    //     System.out.println(salary);
    // }
}
