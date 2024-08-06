package multipleinheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Calling call = new SmartPhone();
		Browsing browse = new SmartPhone();
		Gaming game = new SmartPhone();
		
		call.placeCall("Suzaan");
		
		browse.browse("wwww.youtube.com");
		
		game.playGame("Mobile Legends");
		
	}
	
}
