package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {

	public static void main(String[] args) {
		
		new Game();

	}
	
	
	ArrayList<Shape> shapes;
	
	Game() {
		
		shapes = new ArrayList<>();
		shapes.add(new Shape(50, 50, 50, 50, 1, 1, ShapeType.Oval));
		shapes.add(new Shape(30, 150, 50, 100, 3, 6, ShapeType.Arc));
		shapes.add(new Shape(20, 60, 45, 72, 15, 100, ShapeType.RoundRectangle));
		
		JFrame frame = new JFrame();
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		
		Shape.setWorld(300, 300);
				
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			
			@Override
			public void run() {
			
				draw();
		
			}
		
		};

		t.schedule(tt, 0, 50);
				
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
				frame.dispose();
			}
		});
	}

		public void draw() {
		// call the move() method of each shape
		// Tip: use an enhanced for loop to pick 
		// each shape in the shapes array.
			
			for (Shape shape : shapes) {
				shape.move();
			}
			
			this.repaint();
		}
		

		public void paint(Graphics g) {
		
			g.fillRect(0, 0, Shape.worldW, Shape.worldH);
			g.drawRect(0, 0, Shape.worldW, Shape.worldH);
			
			// draw each shape in shapes array
			// Tip: See these examples of using the Graphics object
			
			g.setColor(Color.lightGray);
			
			for (Shape s : shapes) {
				if (s.getShapeType() == ShapeType.RoundRectangle) {
					g.drawRoundRect(s.x, s.y, s.w, s.h, s.dirX, s.dirY);
					g.fillRoundRect(s.x, s.y, s.w, s.h, s.dirX, s.dirY);
				} else if (s.getShapeType() == ShapeType.Rectangle) {
					g.drawRect(s.x, s.y, s.dirX, s.dirY);
					g.fillRect(s.x, s.y, s.dirX, s.dirY);
				} else if (s.getShapeType() == ShapeType.ThreeDRectangle) {
					g.draw3DRect(s.x, s.y, s.dirX, s.dirY, getFocusTraversalKeysEnabled());
					g.fill3DRect(s.x, s.y, s.dirX, s.dirY, getFocusTraversalKeysEnabled());
				} else if (s.getShapeType() == ShapeType.Oval) {
					g.drawOval(s.x, s.y, s.dirX, s.dirY);
					g.fillOval(s.x, s.y, s.w, s.h);
				} else if (s.getShapeType() == ShapeType.Arc) {
					g.drawArc(s.x, s.y, s.w, s.h, 0, 70);
					g.fillArc(s.x, s.y, s.w, s.h, 0, 70);
				} else {
					return;
				}
			}
			
			
			
		}
	}
