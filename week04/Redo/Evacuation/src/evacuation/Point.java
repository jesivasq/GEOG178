package evacuation;

public class Point {

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
		// Add a distance method to your Point class
		public double distance(Point pointy) {
			double dist;
			
			// find the Euclidian distance between this point and pointy
			dist = Math.sqrt( Math.pow(x-pointy.getX(), 2) + Math.pow(y-pointy.getY(), 2) );
			
			return dist;
		}
}
