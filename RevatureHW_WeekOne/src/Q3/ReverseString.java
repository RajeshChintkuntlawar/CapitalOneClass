package Q3;

public class ReverseString {

	public static String Reverse(String stringToReverse) {
	
		// note the strings starting length, since we will be adding the reverse string to it and need to shorten it later
		int stringLength = stringToReverse.length();
		
		// iterate in reverse adding the character at the end first and working backwards
		for (int i= stringToReverse.length()-1; i>=0; i--) {   
			//NOTE: the evaluation of stringToReverse.length()-1 happens at the initialization, so even though length changes later it doesn't break
			stringToReverse=stringToReverse + stringToReverse.charAt(i);
			// System.out.println(stringToReverse);
		}
		stringToReverse=stringToReverse.substring(stringLength, stringToReverse.length());  
		// we have added the reverse version on the end of the original string, so cut it down to just the reverse
		
		return stringToReverse;
	}
}
