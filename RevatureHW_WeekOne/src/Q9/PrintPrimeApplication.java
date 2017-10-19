package Q9;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeApplication {

	public static void main(String[] args) {
		// Store numbers 1-100 in ArrayList and then print all prime numbers to the console
		List<Integer> myIntList = new ArrayList<Integer>();
		boolean divisible;
		
		for (int i=1; i<=100; i++) {		    //fill the full int list from 1-100
			myIntList.add(i);
		}
											// System.out.println(myIntList.toString());
		for(int element: myIntList) {        //iterate through the list and check each element
			divisible=false;
			for (int x=2; x<element; x++) {  //we know they are divisible by 1 and themselves, leaving those out and checking other numbers from 2 - element
				if (element%x == 0) {        //dividing with modulus to see if their is NO remainder...if so, it is divisible by another number
					divisible = true;
				}
			}
			if (divisible==false) {
											// was only divisible by 1 and itself, so should be prime
				System.out.println(element);
			}
		}

	}

}
