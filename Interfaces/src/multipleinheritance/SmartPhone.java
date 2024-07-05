package multipleinheritance;

public class SmartPhone implements Calling, Browsing, Gaming{

	@Override
	public void playGame(String gameName) {
		// TODO Auto-generated method stub
		System.out.println("Now Playing " + gameName);
	}

	@Override
	public void browse(String link) {
		// TODO Auto-generated method stub
		System.out.println("Now browsing " + link);
	}

	@Override
	public void placeCall(String number) {
		// TODO Auto-generated method stub
		System.out.println("Now Calling " + number);
	}
	

}
