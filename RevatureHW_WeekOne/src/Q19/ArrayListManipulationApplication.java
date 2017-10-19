package Q19;

import java.util.ArrayList;
import java.util.List;

public class ArrayListManipulationApplication {

	public static void main(String[] args) {
		// Create an ArrayList and insert integers 1-10.  Display the ArrayList.  Add even and display.  Add odd and display.  Remove Prime and print new ArrayList.
		
		List<Integer> myIntList = new ArrayList<Integer>();
		
		for (int x=1; x<=10;x++) {
			myIntList.add(x);
		}
		
		System.out.println("Starting myIntList ArrayList after populated with integers:");
		System.out.println(myIntList);
		
		PrintArrayList pal = new PrintArrayList();
		
		System.out.println("Here are the even numbers");
		pal.printEven(myIntList);
		
		System.out.println("Here are the odd numnbers");
		pal.printOdd(myIntList);
		
		//Removing Primes
		myIntList = pal.removePrime(myIntList);
		
		System.out.println("Ending myIntList ArrayList now that I have removed prime nunbers:");
		System.out.println(myIntList);
		

	}

}
