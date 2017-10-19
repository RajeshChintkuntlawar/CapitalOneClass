package Q5;

public class MySubstringMethod {
	
	public static String getSubstring(String str, int idx) {
		StringBuilder myString = new StringBuilder();
		int counter = 0;
		for (char element: str.toCharArray()) { //loop through each element of the string passed in, as a character array
			if (counter<idx) {                  //while we haven't gotten to the index limit, keep appending to the stringbuilder
				myString.append(element);
			}
			counter++;                          //increment the counter until we get to the index
		}
		return myString.toString();  //cast the stringbuilder object to a string using toString
	}

}
