package com.genericinterfaceexample;

public class Employee {

    private String name;
    private int salary;
    private String location;

    // Constructor
    public Employee(String name, int salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", salary=" + salary +
               ", location='" + location + '\'' +
               '}';
    }
}

