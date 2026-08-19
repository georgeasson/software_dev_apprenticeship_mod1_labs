package oo2;

public class Shape {

	public int x, y, w, h;
	public int dirX, dirY;
	static int worldW;
	static int worldH;
	private ShapeType shapeType;
	
	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType) {
			
			this.x = x;
			this.y = y;			
			this.w = w;			
			this.h = h;			
			this.dirX = dirX;			
			this.dirY = dirY;
			this.shapeType = shapeType;
			
			}
	
	
	public Shape(int x, int y, int w, int h, ShapeType shapeType) {
			this(x, y, w, h, 1, 1, shapeType);
	}
	
	
	public void move() {
		x += dirX;
		y += dirY;
		
		if (x < 0) {
			x = 0;
			dirX = -dirX;
		}
		
		if (y < 0) {
			y = 0;
			dirY = -dirY;
		}
		
		if (x > (Shape.worldW - w)) {
			x = (worldW - w);
			dirX = -dirX;
		}
		
		if (y > (worldH - h)) {
			y = (worldH - h);
			dirY = -dirY;
		}
	}
	
	
	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
	}
	
	public ShapeType getShapeType() {
		return shapeType;
	}
}


