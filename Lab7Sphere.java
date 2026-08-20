package lab7;

import java.awt.Color;
import java.awt.Point;

public class Lab7Sphere extends Lab7Circle {

	public Lab7Sphere(Color colour, Point position, double radius) {
		super(colour, position, radius);
	}

	public double getVolume() {
		return (4/3) * 3.14 * Math.pow(radius, 3);
	}
	
	public String getCharacteristics() {
		return "V: " + this.getVolume();
	}
	
}
