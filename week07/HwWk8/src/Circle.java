import java.io.Serializable;

public class Circle implements Geometry, Serializable {
	Point center;
	double radius;
	
	public Circle(Point p, double r) {
		center = p;
		radius = r;
	}
	
	
	
	
	public Point getCenter() {
		return center;
	}




	public void setCenter(Point center) {
		this.center = center;
	}




	public double getRadius() {
		return radius;
	}




	public void setRadius(double radius) {
		this.radius = radius;
	}




	// from Geometry interface
	public double getLength() {
		return radius * 2 * Math.PI;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	
}
