package Q10;

import java.util.Scanner;

public class MinimumNumberApplication {

	public static void main(String[] args) {
		// find the minimum of two numbers using the ternary operator
		
		Scanner s = new Scanner(System.in);
		int firstInput;
		int secondInput;
		
		do {
			System.out.println("We will compare two numbers and tell you the minimum.  Enter two zeroes to quit.");
			System.out.println("Enter the first number:");
			firstInput = s.nextInt();
			System.out.println("Please enter the second number:");
			secondInput = s.nextInt();
			
			// compare with a ternary operator
			System.out.println("The lowest number of the two is " + (firstInput<secondInput?firstInput:secondInput));
		}while (firstInput != 0 && secondInput != 0);
		
		System.out.println("Thanks for playing!");
	}

}
