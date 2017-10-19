package Q4;

public class Factorial {
	
	private int longProduct = 1;
	
	public static int computeFactorial(long x) {
		Factorial f = new Factorial();
		for (int i = 1; i<x; i++) {
		f.longProduct *=(i+1);
		//System.out.println("intProduct = " + intProduct + " and i+1 = " + (i+1));
		}
		return f.longProduct;
	}

}
