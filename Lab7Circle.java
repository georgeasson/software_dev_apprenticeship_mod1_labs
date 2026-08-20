package lab7;

import java.awt.Color;
import java.awt.Point;

public class Lab7Circle extends Lab7Shape {

	public Lab7Circle(Color colour, Point position, double radius) {
		super(colour, position);
		this.radius = radius;
	}

	public double radius;
	
	public String getArea() {
		return "A: " + (3.14 * (Math.pow(radius, 2)));
	}
	
	public String getCircumference() {
		return "C: " + (3.14 * (2 * radius));
	}
	
	public String getDiameter() {
		return "D: " + (2 * radius);
	}
	
	public String getRadius() {
		return "R: " + radius;
	}
	
	public String printCharacteristics() {
		return this.getRadius() + " " + this.getCircumference() + " " + this.getArea() + " " + this.getDiameter();
	}
	
	public void setRadius(double i) {
		this.radius = i;
	}
	
}
