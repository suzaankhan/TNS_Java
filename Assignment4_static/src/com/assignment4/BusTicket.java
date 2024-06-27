package com.assignment4;

public class BusTicket {

    private String name;
    private int age;
    private String departureLoc;
    static private int no_of_seats;

    static{
        no_of_seats = 5;
    }

    public BusTicket(String name, int age, String departureLoc) {
        if(no_of_seats > 0){
            this.name = name;
            this.age = age;
            this.departureLoc = departureLoc;
            no_of_seats--;
            System.out.println(this);
        }else{
            System.out.println("No seats left!");
        }
    }

    @Override
    public String toString() {
        return "BusTicket [name=" + name + ", age=" + age + ", departureLoc=" + departureLoc + "]";
    }

    
}
