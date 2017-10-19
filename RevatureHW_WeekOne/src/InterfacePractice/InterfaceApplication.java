package InterfacePractice;

import java.util.ArrayList;
import java.util.List;

public class InterfaceApplication {

	public static void main(String[] args) {
		// Practice creating shape arrays
		
		List<Shape> myShapes = new ArrayList<Shape>();
		
		for (int x=1; x<=4; x++) {      //add four squares to the array
			myShapes.add(new Square(3,4,3,4));
		}
		
		for (int y=1; y<=3; y++) {      //add three triangles to the array
			myShapes.add(new Triangle("acute", 12, 3, 15));
		}
		
		// Print out an overridden toString() for Shapes, Triangle and Square
		
		for(Shape shape: myShapes) {
			System.out.println("SHAPE");
			System.out.println(shape.toString());
			System.out.println("");
		}


	}

}
