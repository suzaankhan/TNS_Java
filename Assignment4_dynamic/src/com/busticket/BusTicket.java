package com.busticket;

public class BusTicket {
    
    static public int no_of_seats;
    private String name;
    private int age;
    private String departureLoc;

    static{
        no_of_seats = 5;
        System.out.println("Number of Tickets set to " + no_of_seats);
    }

    public BusTicket(String name, int age, String departureLoc){
        this.name = name;
        this.age = age;
        this.departureLoc = departureLoc;
        no_of_seats--;
    }

    public void printPassengerDetails(){
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nDeparture Location: " + this.departureLoc + "\n");
    }
}
