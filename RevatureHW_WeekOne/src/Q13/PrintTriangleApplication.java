package Q13;

import java.util.ArrayList;
import java.util.List;

public class PrintTriangleApplication {

	public static void main(String[] args) {
		// Using any loop without a group of print statements, print out the following triangle to the screen
		//	0
		//	1	0
		//	1	0	1
		//	0	1	0	1
		
		// need algorithm - one that should work: if first is 0, next ensure 1 before and a 1 after, else add 0 to beginning
		
		List<Integer> MyChangingArray = new ArrayList<Integer>();
		
		for (int i=0; i<4;i++){																// iterate 4 times for four rows
			if(MyChangingArray.isEmpty()) {													// if the array is empty, I want to start with a 0
				MyChangingArray.add(0);
				PrintString.Print(MyChangingArray);											// call my print method in my print class to print the first row
			}
			else {																			// Otherwise...
				if (MyChangingArray.indexOf(0)==0) {              							// if the first occurrence of 0 is at position 0
					    MyChangingArray.add(0,1);           	     							// add 1 to the beginning, or
					    																		// add 1 to position 0, pushing everything over to the right one place
				}
				else if (MyChangingArray.lastIndexOf(1)==MyChangingArray.size()-1) {          // else if 1 is at the end add 0 to the beginning pushing everything else over, or
						MyChangingArray.add(0,0);                 							// add 0 to position 0, pushing everything over to the right one place
				}
				else {
					MyChangingArray.add(1);													// else add 1 to the end of the array
				}
				PrintString.Print(MyChangingArray);											// iteratively call my print method to create each successive row in the triangle
				
			}
		}
		
		

	}

}
