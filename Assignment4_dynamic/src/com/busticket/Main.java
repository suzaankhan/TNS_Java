package com.busticket;
import java.util.*;

public class Main {
 
    public static void main(String[] args) {

        ArrayList<BusTicket> objectList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean buyTicket = true;
        int input, age; 
        String name, departureLoc;

        while(buyTicket){
            System.out.println("Do you want to buy a ticket? Enter 1 for Yes, 0 to exit");
            input = sc.nextInt();
            sc.nextLine();
            if(input == 1){
                if(BusTicket.no_of_seats > 0){
                    System.out.println("Enter name, age, departure location: ");
                    name = sc.nextLine();

                    age = sc.nextInt();
                    sc.nextLine();

                    departureLoc = sc.nextLine();
                    BusTicket obj = new BusTicket(name, age, departureLoc);
                    objectList.add(obj);
                }else{
                    System.out.println("Booking is full!");
                    break;
                }
            }
            else{
                buyTicket = false;
                System.out.println("Booking Exited");
            }
        }

        for(BusTicket ticket: objectList){
            System.out.println("-----Passenger Details-----");
            ticket.printPassengerDetails();
        }

        sc.close();
    }

}
