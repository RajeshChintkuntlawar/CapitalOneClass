package Q18;

public class StringConversion extends Conversion{

	@Override
	boolean checkForUpper(String s) {
		// Check a string to see if any of the characters are upper case and return true if they are, false if not
		String lowerVersionToCompare = s.toLowerCase();  //create a lower case version
		boolean hasUpper = true;
		if (s.equals(lowerVersionToCompare)) {           //if s equals the lower case version, none of the characters were upper case
			hasUpper=false;
		}
		return hasUpper;
	}

	@Override
	String convertToUpper(String s) {
		// convert to upper case	
		return s.toUpperCase();
	}

	@Override
	void convertToIntPlus10(String s) {
		// convert a string to an int and then add 10; print the result to the console so don't need to return
		int convertedStringAsInt;
		try {
			convertedStringAsInt= (Integer.valueOf(s) + 10);
			System.out.println("Your string as an integer + 10 = " + convertedStringAsInt);
		}
		catch (NumberFormatException n) {
			System.out.println("The number you entered as a string can not be converted to an integer.");
		}
		
		
	}

}
