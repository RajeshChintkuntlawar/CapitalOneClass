package Q14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchFunctionApplication {

	public static void main(String[] args) {
		// On user input of menu switch/case statement to call methods to execute menu choices
		
		Scanner s = new Scanner(System.in);
		int choice;
		double number;
		double square;
		String inputSentence;
		List<String> parsedSentence = new ArrayList<String>();
		
		do {
			System.out.println("Which of these would you like to do:");
			System.out.println("MENU");
			System.out.println("1) Find the square root of a number.");
			System.out.println("2) Display today's date.");
			System.out.println("3) Split a string into all of it's words, store to an array and print the array.");
			System.out.println("4) QUIT");
			System.out.println("");
			System.out.println("Input a choice (1-3) (or 4 to quit)");
			
			choice = s.nextInt();
			
			if (choice <1 || choice >4) {
				System.out.println("Invalid Selection.  Try again.");
				continue;
			}
			
			
			switch (choice) {
			case 1: 
				System.out.println("Input an number to find the square:");
				number = s.nextDouble();
				square = FunctionClass.findSquare(number);
				System.out.println("The square root of " + number + " = " + square);
				break;
			case 2:
				System.out.println("Today's date is " + FunctionClass.findDate().toString());
				break;
			case 3:
				System.out.println("Input a sentence that we will store as an array of strings and print:");
				s.nextLine();
				inputSentence = s.nextLine();
				parsedSentence = FunctionClass.parseString(inputSentence);
				System.out.println("Your sentence has been placed in the following ArrayList:");
				System.out.println(parsedSentence);
			case 4:
				break;
			
			}
			
		}while (choice!=4);

		System.out.println("Thanks for playing!");
		
		s.close();
	}

}
