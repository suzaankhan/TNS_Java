package com.assignment9;

public class Main {

	public static void main(String[] args) {
		
		try {
			UserForm form_one = new UserForm("Suzaan", -20, "458726587", 60);
		}
		catch(NameException | AgeException | WeightException | PhnNoException e) {
			System.out.println("Exception occured: "+ e.getMessage());
		}
		
		try {
			UserForm form_two = new UserForm("", 15, "4521369874", 45);
		}
		catch(NameException | AgeException | WeightException | PhnNoException e) {
			System.out.println("Exception occured: "+ e.getMessage());
		}
		
		try {
			UserForm form_three = new UserForm("Mike", 15, "452135469874", 45);
		}
		catch(NameException | AgeException | WeightException | PhnNoException e) {
			System.out.println("Exception occured: "+ e.getMessage());
		}
		
		try {
			UserForm form_four = new UserForm("Jake", 15, "1234567890", -87);
		}
		catch(NameException | AgeException | WeightException | PhnNoException e) {
			System.out.println("Exception occured: "+ e.getMessage());
		}
		
	}
	
}
