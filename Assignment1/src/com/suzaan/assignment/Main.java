package com.suzaan.assignment;
import com.suzaan.assignment.employees.*;
import com.suzaan.assignment.utilities.*;

public class Main {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.setManagerName("Joe");
        man.setManagerSalary(450000);

        Developer dev = new Developer();
        dev.setDeveloperName("Vikas");
        dev.setDeveloperSalary(35000);
        
        Employee emp = new Employee();
        emp.setEmpId(10);
        emp.setName("Bill Gates");
        emp.setSalary(95000);
        
        EmployeeUtilities empu = new EmployeeUtilities();
        empu.showManDetails(man);
        empu.showDevDetails(dev);
        empu.showEmpDetails(emp);
        
        System.out.println("Program executed");
    }
}
