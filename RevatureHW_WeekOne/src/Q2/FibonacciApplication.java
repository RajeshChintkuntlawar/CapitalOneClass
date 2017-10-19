package Q2;

public class FibonacciApplication {

	public static void main(String[] args) {
		// Want to print first 25 Fibonacci numbers beginning at 0
		
		// iterate 25 times calling function to return Nth Fibonacci number
		System.out.println("First 25 Fibonacci Numbers");
		for (long x=0; x < 25; x++) {
			System.out.println((x+1) + ":" +Fibonacci.ofN(x)); //pulling Fibonacci number at given index
		}

	}

}
