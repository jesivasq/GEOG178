package structure;

public class Circle implements Geometry {
	Point center;
	double radius;
	
	public Circle(Point p, double r) {
		center = p;
		radius = r;
	}
	
	// from Geometry interface
	public double getLength() {
		return radius * 2 * Math.PI;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
