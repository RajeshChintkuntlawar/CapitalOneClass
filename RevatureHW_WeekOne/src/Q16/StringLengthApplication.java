package Q16;

public class StringLengthApplication {

	public static void main(String[] args) {
		// use args on command line to take in a string and let user know the number of characters.
		
		try {
			System.out.println("Your string, " + args[0] + " is of length " + args[0].length());
		}
		catch (Exception e) {
			System.out.println("You were supposed to start this program with a string parameter.");
		}
		


	}

}
