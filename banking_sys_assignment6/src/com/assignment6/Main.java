package com.assignment6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int option;
        Bank user_one = new Bank(100, "AA12C", 100, 100);
        Bank user_two = new Bank(600, "KLO90", 412360, 3656);
        Bank user_three = new Bank(145, "HB76Y", 989656, 5486);
        
        System.out.println(Bank.getBankName());
        System.out.println("Total no of accounts: " + Bank.getTotalAcc());
        System.out.println("");
       boolean running = true;
       
       while(running) {
    	   System.out.println("Enter 1 to deposit in saving acc");
    	   System.out.println("Enter 2 to deposit in checking acc");
    	   System.out.println("Enter 3 to withdraw from saving acc");
    	   System.out.println("Enter 4 to withdraw from checking acc");
    	   System.out.println("Enter 5 to check details");
    	   System.out.println("Enter 6 to exit");
    	   
    	   if(sc.hasNextInt()) {
    		   option = sc.nextInt();
    		   if(option == 6 ) {
    			   running = false;
    			   System.out.println("Program Exited");
    		   }
    		   else {
    			   Transaction.performTransaction(user_one, option);
    		   }
    	   }
    	   else {
	    	   System.out.println("Invalid input!");
	    	   sc.next();
    	   }
    }
}
}