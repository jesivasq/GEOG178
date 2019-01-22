package Lab2;

public class Point {
	// Attributes
	double x, y;
	
	// Constructors
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	// Getters
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	// Setters
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	// Methods
	public String toWKT() {
		return "POINT (" + x + " " + y + ")";
	}
	
	public double area(double x, double y) {
		return Math.abs(this.x - x) * Math.abs(this.y - y);
	}
	
	public double area(Point p) {
		return Math.abs(this.x - p.x) * (Math.abs(this.y - p.y));
	}
	
	
	
	
}
