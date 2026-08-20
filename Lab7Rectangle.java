package lab7;

import java.awt.Color;
import java.awt.Point;

public class Lab7Rectangle extends Lab7Shape {
	
	public int sideA;
	public int sideB;
	
	public Lab7Rectangle(Color colour, Point position, int sideA, int sideB) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	public double getArea() {
		return (sideA * sideB);
	}
	
	public String getCharacteristics() {
		return "Side A is: " + sideA + ", side B is: " + sideB;
	}
	
	public String getCircumference() {
		return "C: " + (2 * (sideA + sideB));
	}
	
}
