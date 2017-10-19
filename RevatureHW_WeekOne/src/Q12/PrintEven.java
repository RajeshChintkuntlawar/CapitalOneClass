package Q12;

import java.util.ArrayList;
import java.util.List;

public class PrintEven {

	public static void main(String[] args) {
		// store numbers 1-100; print even numbers in array with enhance for list (for each)
		
		List<Integer> myIntList = new ArrayList<Integer>();
		
		for (int i=1; i<=100; i++) {		    //fill the full int list from 1-100
			myIntList.add(i);
		}
											// System.out.println(myIntList.toString());
		
		System.out.println("Printing out Even Numbers from 1 to 100 using enhanced for loop.");
		for(int element: myIntList) {        //iterate through the list and check each element
				if (element%2 == 0) {        //dividing with modulus to see if their is NO remainder...if no remainder, the number is even
					System.out.println(element);
				}
		}

	}

}
