package Q14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FunctionClass {
	
	public static double findSquare(double num) {
		double square = Math.sqrt(num);
		return square;
	}
	
	public static LocalDate findDate() {
		LocalDate dt;
		dt = LocalDate.now();
		return dt;
	}
	
	public static List<String> parseString(String inputString) {
		List<String> newParsedString = new ArrayList<>();
		String tempString;
		int firstIndex = 0;
		int nextSpaceIndex = inputString.indexOf(" ");
		
		
		do {
			System.out.println("firstIndex="+firstIndex + " and nextSpaceIndex="+nextSpaceIndex);
		tempString = inputString.substring(firstIndex,nextSpaceIndex);
			if (tempString != null) {
				newParsedString.add(tempString);
			}
			firstIndex = nextSpaceIndex+1;
			nextSpaceIndex=inputString.indexOf(" ", firstIndex);
			if (nextSpaceIndex==-1) {
				nextSpaceIndex=inputString.length();
			}
		} while (firstIndex<nextSpaceIndex);
		return newParsedString;
	}

}
