package Q7;

import java.util.Arrays;

public class ComparatorApplication {

	public static void main(String[] args) {
		// Build a couple persons and compare them.		
		// Employee(String name, String department, int age) 
		
		//Create two employees
		Employee JoeOne = new Employee("Joe","Pharmaceuticals",36);
		Employee JoeTwo = new Employee("Joey","Management",54);
		
		//Put them in an Employee array
		Employee[] Employees= {JoeOne,JoeTwo};
		
		
		//Call the NameComparator with Arrays.sort() to sort by Name then print them
		NameComparator nc = new NameComparator();
		
		Arrays.sort(Employees,nc);
		System.out.println("Sorted by Name");
		System.out.println(Employees[0]);
		System.out.println(Employees[1]);
		
		//Call the DepartmentComparator with Arrays.sort() to sort by Department then print them
		DepartmentComparator dc = new DepartmentComparator();
		
		Arrays.sort(Employees,dc);
		System.out.println("Sorted by Department");
		System.out.println(Employees[0]);
		System.out.println(Employees[1]);
		
		//Call the AgeComparator with Arrays.sort() to sort by Age then print them
		AgeComparator ac = new AgeComparator();
		
		Arrays.sort(Employees,ac);
		System.out.println("Sorted by Age");
		System.out.println(Employees[0]);
		System.out.println(Employees[1]);
		
		

	}

}
