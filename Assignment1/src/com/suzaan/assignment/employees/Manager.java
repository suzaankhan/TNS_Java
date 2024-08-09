package com.suzaan.assignment.employees;

public class Manager extends Employee
{
    private String managerName;
    private int managerSalary;
    
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    public int getManagerSalary() {
        return managerSalary;
    }
    public void setManagerSalary(int managerSalary) {
        this.managerSalary = managerSalary;
    }

}
