package Q20;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {
	
	private static String Fname="";
	private static String Lname="";
	private static int age=0;
	private static String state = "Virginia";
	private static List<Person> personList = new ArrayList<Person>();

	@BeforeClass
	public static void setup() {
		File file = new File("PersonList.txt");
		Scanner s;
		try {
			s = new Scanner(file);
			
			s.useDelimiter(",|\\n");
			
			
			while (s.hasNext()) {
				Person X = new Person();
				for (int x=1; x<=4; x++) {
					switch (x) {
					case 1:
						X.setFname(s.next());
						break;
					case 2:
						X.setLname(s.next());
						break;
					case 3:
						X.setAge(Integer.parseInt((s.next())));
						break;
					case 4:
						X.setState(s.next());
						break;
					}
				}
				
				personList.add(X);
			
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	
	}
	
	@Test
	public void test() {
		int X = 2;
		int Y = 2;
		assertEquals(X, Y);
		
		System.out.println(personList);
		
	}

}
