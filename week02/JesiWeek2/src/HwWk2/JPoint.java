package HwWk2;

public class JPoint {
	
	double x;
	double y;
	
	public JPoint( double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(JPoint pointy) {
		double dist;
		
		// find the Euclidian distance between this point and pointy
		dist = Math.sqrt( Math.pow(x-pointy.getX(), 2) + Math.pow(y-pointy.getY(), 2) );
		
		return dist;
	}
	
}
