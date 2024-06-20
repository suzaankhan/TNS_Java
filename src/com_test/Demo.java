
// MAIN FILE------------------------------------

package com_test;

public class Demo {

    private int age;
    public static void main(String[] args) {
        // default explicit constructor
        Constructor_demo cnd = new Constructor_demo();
        Constructor_demo cndTwo = new Constructor_demo("Rony", 20, 45000);

        System.out.println("Name: "+ cndTwo.getName());
        System.out.println("Age: "+ cndTwo.getAge());
        System.out.println("Salary: "+ cndTwo.getSalary());
        System.out.println("No of Holidays: "+ cnd.getNo_of_holidays());

    }
    
}
