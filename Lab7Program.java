package lab7;

import java.awt.Color;
import java.awt.Point;

public class Lab7Program {

	public static void main(String[] args) {
		
		// Create some points
		Point p1 = new Point(0,0);
		Point p2 = new Point(25, 35);
		Point p3 = new Point(100, 10);		
		
		// Create some shapes
		Lab7Rectangle shape1 = new Lab7Rectangle(Color.blue, p1, 10, 20);
		Lab7Circle shape2 = new Lab7Circle(Color.red, p2, 55);
		Lab7Sphere shape3 = new Lab7Sphere(Color.green, p3, 85);
		
		// Get the details
		System.out.println("Shape 1 \t" + shape1.getCharacteristics());
		System.out.println("Shape 2 \t" + shape2.printCharacteristics());
		System.out.println("Shape 3 \t" + shape3.getCharacteristics());
		
	}

}
