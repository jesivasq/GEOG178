

public class PointBuffer {
	private Point p;
	private double r;
	
	public PointBuffer(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public boolean isInside(Point p) {
		return this.p.distance(p) <= r;
	}
	
	public void setCenter(Point p) {
		this.p = p;
	}
	
	public Point getCenter() {
		return p;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
	
	public double getLength() {
		return Math.PI * r * 2;
	}
	
	public double getRadius() {
		return r;
	}
	
	public void setRadius(double r) {
		this.r = r;
	}
}
