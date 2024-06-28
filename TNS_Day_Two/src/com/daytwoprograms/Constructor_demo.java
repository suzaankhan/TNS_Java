package com.daytwoprograms;

public class Constructor_demo {

    private String name;
    private int age;
    private int salary;
    private int no_of_holidays;

    //default explicit constructor
    Constructor_demo(){
        no_of_holidays = 25;
        System.out.println("No of holidays set to "+ no_of_holidays);
    }

    Constructor_demo(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("Age, name, salary was also set");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getNo_of_holidays() {
        return no_of_holidays;
    }
       
}
