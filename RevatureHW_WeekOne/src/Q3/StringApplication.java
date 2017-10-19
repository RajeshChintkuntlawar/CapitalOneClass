package Q3;

import java.util.Scanner;

public class StringApplication {

	public static void main(String[] args) {
		// reverse a string without using a temporary variable or specialized Reverse() methods
		
		// get a string from the user input
		Scanner s = new Scanner(System.in);
		System.out.println("Please input a string:");
		String stringToReverse = s.nextLine();
		
		stringToReverse = ReverseString.Reverse(stringToReverse);

		System.out.println("The reverse of your string is " + stringToReverse);

	}


}
