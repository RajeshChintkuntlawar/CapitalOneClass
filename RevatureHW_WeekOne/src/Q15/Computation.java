package Q15;

public class Computation implements Operational{

	@Override
	public double divide(double a, double b) {
		// divide operation
		return a/b;
	}

	@Override
	public double multiply(double a, double b, double... n) {
		// multiply operation
		double result = 1;
		if (n.length !=0) {
			for(double element:n) {
				result*=element;
			}
		}
		result=result*a*b;
		
		return result;
	}

	@Override
	public int add(int a, int b, int... n) {
		// addition operation
		
		int result = 0;
		if (n.length != 0) {
			for (int element:n) {
				result+=element;
			}
		}
		result=result+a+b;
		return result;
	}

	@Override
	public int subtract(int a, int b, int... n) {
		// subtraction operation
		
		int result = a-b;
		
		if (n.length !=0) {
			for (int element:n) {
				result-=element;
			}
		}
		
		return result;
	}
	

}
