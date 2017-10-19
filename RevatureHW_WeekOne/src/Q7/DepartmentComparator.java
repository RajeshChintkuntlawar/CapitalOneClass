package Q7;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// Compare to determine the department of highest value
		// Management is highest
		// Pharmaceuticals is second highest
		// Sales is third highest
		// Service is lowest
		int departmentEmp1;
		int departmentEmp2;
		
		switch (o1.getDepartment()) {
		case "Management":
			departmentEmp1=1;
			break;
		case "Pharmaceuticals":
			departmentEmp1=2;
			break;
		case "Sales":
			departmentEmp1=3;
			break;
		case "Service":
			departmentEmp1=4;
			break;	
		default:
			departmentEmp1=10;
		}
		
		switch (o2.getDepartment()) {
		case "Management":
			departmentEmp2=1;
			break;
		case "Pharmaceuticals":
			departmentEmp2=2;
			break;
		case "Sales":
			departmentEmp2=3;
			break;
		case "Service":
			departmentEmp2=4;
			break;	
		default:
			departmentEmp2=10;
		}
		
		return (departmentEmp1-departmentEmp2); 
	}

}
