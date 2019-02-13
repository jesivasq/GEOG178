package structure;

public class Rectangle implements Geometry{
	double x;
	double y;
	double width;
	double height;
	
	public Rectangle ( double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	
	// from Geometry
	public double getLength() {
		return 2 * (width + height);
	};
	public double getArea() {
		return width * height;
	};
}
