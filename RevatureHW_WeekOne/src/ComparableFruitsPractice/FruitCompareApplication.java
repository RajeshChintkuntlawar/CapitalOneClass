package ComparableFruitsPractice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FruitCompareApplication {

	public static void main(String[] args) {
		// Application that builds a list of Fruit and sorts them according to rating
		
		// Fruit(String name, String color, float ounces, String flavor, int rating)
		
		Fruit apple = new Fruit("Apple", "red", 10.2f, "sweet", 5);
		Fruit orange = new Fruit("Orange", "orange", 8.1f, "tart", 8);
		Fruit tangerine = new Fruit("Tangerine", "orange", 6.15f, "sweet",9);
		
		List<Fruit> myFruit = new LinkedList<Fruit>();
		myFruit.add(apple);
		myFruit.add(orange);
		myFruit.add(tangerine);
		
		Collections.sort(myFruit);
		
		System.out.println(myFruit);

	}

}
