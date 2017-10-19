package Q1;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		// Bubble Sort Assignment
		// Starting Array = {1,0,5,6,3,2,3,7,9,8,4}
		// Desired Ending Array = {0,1,2,3,3,4,5,6,7,8,9}
		
		int [] intArray = {1,0,5,6,3,2,3,7,9,8,4};
		int [] tempArray = new int[intArray.length];
		int lowInt = 0;
		boolean changeNeeded = false;
		
		// fill the temp array with the original array values
		for (int i = 0; i<intArray.length; i++) {
			tempArray[i]=intArray[i];
			
		}
		System.out.println("Starting intArray = " + Arrays.toString(intArray));
		System.out.println("Populating the tempArray with intArray values we get");
		System.out.println("tempArray = " + Arrays.toString(tempArray));
		System.out.println("");
		
		
		for (int x = 0; x<intArray.length; x++) { //iterate through each element in the array
			// System.out.println("x = " + x);
			for(int y=x; y<intArray.length; y++) {  //for each element, we will also iterate through the remaining elements to find a lower value
				// System.out.println("y = " + y);
				if (tempArray[y]<tempArray[lowInt]) {
					lowInt=y;  // hold the index of the lower value so can swap later, but will update as iterate if continue to find a lower value
					// System.out.println("lowInt = " + lowInt);
					changeNeeded=true; // we found a lower value than the current element evaluated so we will need to swap
				}	
			}
			if (changeNeeded) {  //finished iterating through for current element and if found a lower value, need to make a swap
				// found the int of lowest value so swapping with the current element being evaluated
				int first = tempArray[lowInt];
				int second = tempArray[x];
				tempArray[x]=first;
				tempArray[lowInt]=second;
				System.out.println("tempArray after making a swap = " + Arrays.toString(tempArray));
				changeNeeded=false;
			}
			lowInt = x+1; // set lowInt = to the next element index to be evaluated until we know better
			
		}
		System.out.println("");
		System.out.println("The original array was" + Arrays.toString(intArray));
		System.out.println("After the bubble sort, the array is now " + Arrays.toString(tempArray));
		
		
	}

}
