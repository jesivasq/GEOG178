package structure;

public class Square implements Geometry {
	double x;
	double y;
	double side;
	
	public Square(double x, double y, double side) {
		this.x = x;
		this.y = y;
		this.side = side;
	}
	
	
	public double getLength() {
		return side * 4;
	}
	public double getArea() {
		return side * side;
	}

}
