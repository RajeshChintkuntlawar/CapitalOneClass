package Q18;

import java.util.Scanner;

public class StringConvertApplication {

	public static void main(String[] args) {
		// Prompt user and call my concrete methods
		
		Scanner s = new Scanner(System.in);
		int inputChoice;
		String inputString="";
		StringConversion sc = new StringConversion();
		
		do {
			System.out.println("This program can do a number of things with a string.  Which would you like to do?");
			System.out.println("1) Check if the string has any uppercase characters");
			System.out.println("2) Convert your string to all uppercase characters");
			System.out.println("3) Enter a number as a string and have it converted to an integer + 10");
			System.out.println("4) Quit the program");
			
			inputChoice = s.nextInt();
			if (inputChoice<4) {
				System.out.println("Please input your string:");
				s.nextLine();
				inputString = s.nextLine();
			}
			
			switch (inputChoice) {
			case 1:
				boolean uppersExist = sc.checkForUpper(inputString);
				if (uppersExist) {
					System.out.println("Your string, " + inputString +", contains upper case characters.");
				}
				else {
					System.out.println("Your string, " + inputString + ", does not contain upper case chcaracters.");
				}
				break;
			case 2:
				System.out.println("Your string, " + inputString + ", shown with all upper case characters, is " + sc.convertToUpper(inputString));
				break;
			case 3:
				sc.convertToIntPlus10(inputString);
				break;
			case 4:
				break;
			}

		}while (inputChoice !=4);
		System.out.println("Thanks for playing!");
		s.close();
	}

}
