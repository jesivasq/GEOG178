package structure;

public class PointBuffer implements BoundingArea{

	Circle c;
	
	public PointBuffer(Point p, double r) {
		c = new Circle(p, r);
	}
	
	public Point getCenter() {
		return c.center;
	}
	
	public double getRadius() {
		return c.radius;
	}
	
	public boolean isInside(Point p) {
		boolean inside = false;
		
		if(p.distance(c.center) <= c.radius) {
			inside = true;
		}
		
		return inside;
	}
	
	public double getLength() {
		return Math.PI * c.radius * 2;
	}
	
	public double getArea() {
		return Math.PI * c.radius * c.radius;
	}
}
