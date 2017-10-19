package InClassSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationApplication {

	public static void main(String[] args) {
		// Create a Candybar object and Serialize it to a File
		
//		List<String> Ingredients = new ArrayList<String>();
//		
//		Ingredients.add("chocolate");
//		Ingredients.add("peanuts");
//		Ingredients.add("caramel");
//		
//		// Candybar(int cal, String type, double wt, List<String> ing)
//		
//		Candybar Snickers = new Candybar(350,"chocolate",20.3,Ingredients);
//		
//		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Snickers.txt"));){
//			
//			
//			os.writeObject(Snickers);
//	
//			
//			
//		} 
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("Snickers.txt"));){
			
			try {
				Candybar bar = (Candybar) is.readObject();
				
				System.out.println(bar.toString());
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
