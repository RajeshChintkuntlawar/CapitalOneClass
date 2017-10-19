package Q2;


public class Fibonacci {
	
	
	final private static long FIRST_FIB = 0;  //immutable, only accessible by the class, one version for the whole class
	final private static long SECOND_FIB = 1;
	
	
	public static long ofN( long fibIndex) {
		if (fibIndex == FIRST_FIB || fibIndex == SECOND_FIB) { //stops recursive calling when it gets to 1 or 0
			return fibIndex;
		}
		else return ofN(fibIndex-1) + ofN(fibIndex-2); //iterates recursively calling itself to build up the addition needed to get to the given Fib number of index fibIndex
	}
	


}
