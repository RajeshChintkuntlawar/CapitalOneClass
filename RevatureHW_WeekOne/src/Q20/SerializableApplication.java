package Q20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SerializableApplication {

	public static void main(String[] args) {
		// Create 4 people with first name, last name, age, and State
		// Add them to a file in format Fname:Lname:Age:State
		// Read from file and output then in format Name: [Fname] [Lname]
		//										   Age: [Age] years
		//										   State: [State] State
		
		// Person(String Fname, String Lname, int age, String state)
		
//		Person mickey = new Person("Mickey","Mouse",35,"Arizona");
//		Person hulk = new Person("Hulk","Hogan",50,"Virginia");
//		Person roger = new Person("Roger","Rabbit",22,"California");
//		Person wonder = new Person("Wonder","Woman",18,"Montana");
//		
//		Set <Person> heroSet = new HashSet<Person>();
//		
//		heroSet.add(mickey);
//		heroSet.add(hulk);
//		heroSet.add(roger);
//		heroSet.add(wonder);
//		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter("heroSet.txt"));){
//			for(Person hero: heroSet) {
//				bw.write(hero.getFname()+":"+hero.getLname()+":"+hero.getAge()+":"+hero.getState());
//				bw.newLine();
//			}
//			bw.flush();
//			bw.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
		// Finished creating the file (commented above); now need to read the file to the screen
		List<String> heroStrings = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("heroSet.txt"));){
			
			
			for (int i=1; i <= 4;i++) {
				heroStrings.add(br.readLine());
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String heroString: heroStrings) {
			int nextColon;
			String tempString="";
			for (int x=1; x<=3; x++)
			switch (x) {
			case 1:
				System.out.print("Name:" + heroString.substring(0, nextColon = heroString.indexOf(":")));
				tempString=heroString.substring((nextColon+1),heroString.length());
				System.out.println(" " + tempString.substring(0,nextColon = tempString.indexOf(":")));
				tempString=tempString.substring((nextColon+1),tempString.length());
				break;
			case 2:
				System.out.println("Age:" + tempString.substring(0,nextColon = tempString.indexOf(":")) + " years");
				tempString=tempString.substring((nextColon+1),tempString.length());
				break;
			case 3:
				System.out.println("State:" + tempString.substring(0,tempString.length()));
				break;
			}
			System.out.println("");
		}

	}

}
