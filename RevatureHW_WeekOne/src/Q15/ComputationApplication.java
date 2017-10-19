package Q15;

public class ComputationApplication {

	public static void main(String[] args) {
		// Call methods of Computation class to execute operations on two or more operands
		
		int a = 36;
		int b = 95;
		int c = 3;
		int d = 41;
		int e = 2;
		
		Computation numbers = new Computation();
		
		// Perform operations on two operands
		System.out.println(a + " added to " + b + " = " + numbers.add(a, b));
		System.out.println(a + " minus " + b + " = " + numbers.subtract(a, b));
		System.out.println(a + " divided by " + b + " = " + numbers.divide(a, b));
		System.out.println(a + " multiplied by " + b + " = " + numbers.multiply(a,b));
		
		System.out.println("");
		System.out.println("");
		
		//Perform addition, subtraction, and multiplication on multiple operands using var args (not doing division)
		System.out.println(a + " added to " + b + " added to " + c + " added to " + d + " added to " + e + " = " + numbers.add(a, b, c, d, e));
		System.out.println(a + " minus " + b + " minus " + c + " minus " + d + " minus " + e + " = " + numbers.subtract(a, b, c, d, e));
		System.out.println(a + " multiplied by " + b + " multiplied by " + c + " multiplied by " + d + " multiplied by " + e + " = " + numbers.multiply(a, b, c, d, e));
		
		

	}

}
