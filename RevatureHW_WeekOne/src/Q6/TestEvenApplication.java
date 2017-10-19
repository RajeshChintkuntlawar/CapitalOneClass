package Q6;

import java.util.Scanner;

public class TestEvenApplication {

	public static void main(String[] args) {
		// Determine if number is even without modulus
		Scanner s = new Scanner(System.in);
		Double input;
		
		do{
			System.out.println("Please input a number.  I will tell you if it is even or odd (enter 99 to quit):");
			input = s.nextDouble();
			Double divided;
			
			if (input !=0) {
				divided = input/2;
			}
			else {
				divided = 0D;
			}
			
			String text = Double.toString(Math.abs(divided));
			int integerPlaces = text.indexOf('.');
			int decimalPlaces = text.length() - integerPlaces - 1;
			int decimalValue = Integer.valueOf(text.substring(integerPlaces+1,text.length()));
			
			
			if(decimalValue==0) {
				System.out.println("Your number is even.");
			}
			else {
				System.out.println("Your number is odd.");
			}
		}while (input!=99);
		System.out.println("Thanks for playing!");

	}

}
