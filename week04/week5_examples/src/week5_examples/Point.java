package week5_examples;

public class Point {
	
	//Member variables
	private double x, y;
	
	// Constructors 
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0,0);
	}
	
	//Getters & Setters
	public double getX() { return x; }

	public void setX(double x) { this.x = x; }

	public double getY() { return y; }
    
	public void setY(double y) { this.y = y; }
	
	public String getType(){ return "POINT"; }
	
	// Overrides
	public String toString() {
		return this.getType() + " ("+x+", "+y+")";
	}
	
	// Methods
	public double getLength() { return 0.0; }
	
	// Distance by double coordinate
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
	}
	
	// Distance by point
	public double distance(Point p) {
		return Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2));
	}
}

