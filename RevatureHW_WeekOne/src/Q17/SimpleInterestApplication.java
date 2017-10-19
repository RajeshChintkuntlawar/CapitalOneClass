package Q17;

import java.util.Scanner;

public class SimpleInterestApplication {

	public static void main(String[] args) {
		// Gather Principal, Rate, and Time from user and Calculate Simple Interest (using Scanner Class)
		
		Scanner s = new Scanner(System.in);
		
		double principal;
		int percentRate;
		double rate;
		int timeYears;
		
		while (true) {
			System.out.println("Let's calculate simple interest.");
			System.out.println("What is your starting PRINCIPAL (money) (Enter 0 to quit):");
			principal = s.nextDouble();
			if (principal==0D) {
				break;
			}
			System.out.println("What is your percent RATE (ex. enter '6' for 6%):");
			percentRate = s.nextInt();
			rate = ((double)percentRate)/100;
			System.out.println("How much TIME in years will we calculate interest for:");
			timeYears = s.nextInt();
			
			System.out.println("");
			System.out.println("Your amount of interest is Principal(" + principal + ") * Rate(" +rate+ ") * Time(" + timeYears + ") = " + (principal*rate*timeYears));
			System.out.println("");
			
		}
		
		System.out.println("Thanks for playing!");
		s.close();

	}

}
