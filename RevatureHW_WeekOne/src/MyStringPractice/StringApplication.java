package MyStringPractice;

public class StringApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder one = new StringBuilder();
		
		StringBuilder two = new StringBuilder();
		
		StringBuilder three = new StringBuilder();
		
		one.append("Test");
		two.append("tseT");
		three.append(two.reverse());
		System.out.println(one.toString() + " and " + three.toString());
		
		if(one.toString().equals(three.toString())) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		

	}

}
