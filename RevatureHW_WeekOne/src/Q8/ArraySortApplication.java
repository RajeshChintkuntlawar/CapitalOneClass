package Q8;
import Q3.ReverseString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySortApplication {

	public static void main(String[] args) {
		// Store strings in an ArrayList and save all the Palindromes in a separate ArrayList
		
		List<String> FullList = new ArrayList<String>(Arrays.asList("karan","madam","tom","civic","radar","sexes","jimmy","kayak","john","refer","billy","did"));
		List<String> PalindromeList = new ArrayList<String>();
		
		for (int i=0; i< FullList.size();i++) {
			if (FullList.get(i).equals(ReverseString.Reverse(FullList.get(i)))) {
				PalindromeList.add(FullList.get(i));
			}
		}
		System.out.println("FullList = " + FullList.toString());
		System.out.println("PalindromeList = " + PalindromeList.toString());

	}

}
