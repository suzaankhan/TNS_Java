package com.suzaan.assignment.utilities;
import com.suzaan.assignment.employees.*;

public class EmployeeUtilities {
    
    public void showEmpDetails(Employee obj){
        System.out.println("Employee name: "+ obj.getName());
        System.out.println("Employee Salary: "+ obj.getSalary());
        System.out.println("Employee Id: "+ obj.getEmpId());
    }

    public void showManDetails(Manager obj){
        System.out.println("Manager name: "+ obj.getManagerName());
        System.out.println("Manager Salary: "+ obj.getManagerSalary());
    }

    public void showDevDetails(Developer obj){
        System.out.println("developer name:" + obj.getDeveloperName());
        System.out.println("developer salary: "+ obj.getDeveloperSalary());
    }
}
