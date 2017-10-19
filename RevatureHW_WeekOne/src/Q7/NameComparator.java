package Q7;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// String compare the name of two employees
		StringBuilder first = new StringBuilder();
		StringBuilder second = new StringBuilder();
		int lengthOne;
		int lengthTwo;
		int longest;
		
		first.append(o1);
		second.append(o2);
		
		lengthOne=first.length();
		lengthTwo=second.length();
		
		longest=(lengthOne>lengthTwo?lengthOne:lengthTwo);
		
		
		for (int i=0; i<longest;i++) {
			if (first.charAt(i)>second.charAt(i)) {
				return 1;
			}
			else if (second.charAt(i)>first.charAt(i)){
				return -1;
			}
			else continue;
		}
		if (lengthOne != lengthTwo) {
			return (lengthOne<lengthTwo?1:-1);
		}
		return 0;
	}

}
