package Q11;

import Q11b.FloatClass;

public class FloatApplication {

	public static void main(String[] args) {
		// Access float variables in package Q11b from package Q11
		
		//Can access a static variable simply by referencing the class
		System.out.println("The value of pi is " + FloatClass.pi);
		
		//Can access a instance variable by first creating an object of the class and then referencing.
		FloatClass myFloat = new FloatClass();
		System.out.println("The value of MyInstanceVariable is " + myFloat.myInstanceVariable);
		
		// Can access the instance variable without using a getter because I made the variable public.
		
		

	}

}
