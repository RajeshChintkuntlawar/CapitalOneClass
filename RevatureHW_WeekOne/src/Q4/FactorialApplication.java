package Q4;

import java.util.Scanner;

public class FactorialApplication {

	public static void main(String[] args) {
		// What to compute N!
		
		Scanner s = new Scanner(System.in);
		long longInput=0L;
		
		do {
		System.out.println("Please input a number from 0-12 to compute the factorial (99 to quit):");
		try {
			longInput = Long.valueOf(s.nextLine());
			}
			catch (Exception e) {
				System.out.println("Invalid input.  Try again.");
				//longInput = 0L;
				//break;
				continue;
			}
		if (longInput == 99) {
			break;
		}
		
		if (longInput>=0 && longInput<=12) {
			System.out.println(longInput + "! or " + longInput + " Factorial is equal to " + Factorial.computeFactorial(longInput));
		}
		else {
			System.out.println("That number was not in range");
		}
		}while (longInput != 99);
		System.out.println("Thanks for playing!");

	}

}
