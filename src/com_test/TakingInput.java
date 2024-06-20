package com_test;
import java.util.Scanner;

public class TakingInput {

    private int age, salary;
    private String name;

    public static void main(String[] args) {
        //creating objects
        Scanner sc = new Scanner(System.in);
        TakingInput tk = new TakingInput();

        System.out.print("Enter your name: ");
        if(sc.hasNext()){
            tk.name = sc.nextLine();
        }

        System.out.print("Enter your age: ");
        if(sc.hasNextInt()){
            tk.age = sc.nextInt();
        }
    
        System.out.print("Enter your salary: ");
        if(sc.hasNextInt()){
            tk.salary = sc.nextInt();
        }

        System.out.println(tk);

        sc.close();
    }

    @Override
    public String toString() {
        return "TakingInput [age=" + age + ", salary=" + salary + ", name=" + name + "]";
    }
    
}