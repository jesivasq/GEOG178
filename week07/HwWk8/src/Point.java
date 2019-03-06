import java.io.Serializable;

public class Point implements Geometry, Serializable {
	// -------------
		// Attributes
		// -------------
		double x;
		double y;
		
		// -------------
		// Constructor
		// -------------	
		public Point( double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		// -------------
		// Getters
		// -------------
		public double getX() {
			return x;
		}
		
		public double getY() {
			return y;
		}
		
		// -------------
		// Setters
		// -------------
		public void setX(double x) {
			this.x = x;
		}
		
		public void setY(double y) {
			this.y = y;
		}
		
		// -------------
		// Additional Methods
		// -------------
		public double distance(Point p) {
			double dist;
			
			// find the Euclidian distance between this point and pointy
			dist = Math.sqrt( Math.pow(x-p.getX(), 2) + Math.pow(y-p.getY(), 2) );
			
			return dist;
		}
		
		// from Geometry interface
		public double getLength() {
			return 0;
		};
		
		public double getArea() {
			return 0;
		};
}
