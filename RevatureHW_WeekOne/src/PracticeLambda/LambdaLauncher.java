package PracticeLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> li = new ArrayList<String>();
		li.add("Hello");
		li.add("longer string");
		li.add("s");
		li.add("goodbye");
		
		System.out.println(li);
		
		// THIS....
		Collections.sort(li, (a,b)->{return a.length()-b.length();});  //lambda function gives the anonymous function needed to take the place of the needed method of the Comparator interface
		System.out.println(li);										  //implementation expected here.
		// IS THE SAME AS THIS....
		Collections.sort(li, (a,b)->a.length()-b.length());  //shorthand for the lambda anonymous function when you only have one line...assumes an expression that gives the return
		System.out.println(li);
		// IS THE SAME AS THIS....
		StringComparator myStComp = new StringComparator();  //Collections.sort will have to go look for the compare(o1,o2) method that returns o1.length()-o2.length();
		//Collections.sort(li, myStComp); //not working yet
		System.out.println(li);

	}

}
