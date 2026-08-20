package lab7;

import java.awt.Point;
import java.awt.Color;

public class Lab7Shape {
	
	private Color colour;
	private Point position;
	
	public Lab7Shape(Color colour, Point position) {
		this.colour = colour;
		this.position = position;
	}
	
	public Color getColour() {
		return colour;
	}

	public Point getPosition() {
		return position;
	}
	
	public void setColour(Color c) {
		this.colour = c;
	}
	
	public void setPositionint (Point x) {
		position = x;
	}
	
}
