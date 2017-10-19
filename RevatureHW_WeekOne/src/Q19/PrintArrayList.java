package Q19;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayList {

	public void printEven(List<Integer> myList) {
		System.out.println("Printing out Even Numbers using enhanced for loop.");
		for(int element: myList) {        //iterate through the list and check each element
				if (element%2 == 0) {        //dividing with modulus to see if their is NO remainder...if no remainder, the number is even
					System.out.println(element);
				}
		}
	}
	
	public void printOdd(List<Integer> myList) {
		System.out.println("Printing out Odd Numbers using enhanced for loop.");
		for(int element: myList) {        //iterate through the list and check each element
				if (element%2 != 0) {        //dividing with modulus to see if their is NO remainder...if no remainder, the number is even
					System.out.println(element);
				}
		}
	}
	
	public List<Integer> removePrime(List<Integer>myList){
		
		boolean divisible;
		List<Integer> newList = new ArrayList<Integer>();
		
		for(int element: myList) {        //iterate through the list and check each element
			divisible=false;
			for (int x=2; x<element; x++) {  //we know they are divisible by 1 and themselves, leaving those out and checking other numbers from 2 - element
				if (element%x == 0) {        //dividing with modulus to see if their is NO remainder...if so, it is divisible by another number
					divisible = true;
				}
			}
			if (divisible==true) {
											// was not prime
				newList.add(element);
			}
		}
		return newList;
	}
	
}
