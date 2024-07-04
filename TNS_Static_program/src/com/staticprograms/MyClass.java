package com.staticprograms;

public class MyClass {

    private int section; //instance variable
    private static int srNo; // static variable
    //  static block
    static{ 
        System.out.println("------Printed from static block------");
        srNo = 1000;
    }
    // default constructor
    MyClass(){
        System.out.println("------Default myclass constructor------");
        srNo++;
        section++;
    }

    static void display(){
        System.out.println("------Printed from static display method------");
        System.out.println("Serial number is " + srNo);
    }

    @Override
    public String toString() {
        return "MyClass [section=" + section + "]";
    }
    
}
