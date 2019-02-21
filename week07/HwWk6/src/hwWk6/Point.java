package hwWk6;

public class Point {

	int x; 
	int y;
	
	// Constructor
	public Point(int x, int y ) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow(this.getX() - p.getX(), 2)+ Math.pow(this.getY() - p.getY(), 2));
	}
	
	
}
