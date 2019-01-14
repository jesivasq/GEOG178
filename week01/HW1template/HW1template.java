package edu.ucsb.geog.w1;

public class HW1template {

	/* Do not use any materials not discussed in class so 
	 * far, e.g., Java classes, arrays, self-defined methods. Just
	 * variables, control structures, and the Math-methods.
	 */
	public static void main(String[] args) {
		
		//Define some points in a Cartesian coordinate system
			double x1 = 2;
			double y1 = 3;
			//...
		//Some points are part of a polyline others part of a polygon
			
		// Print out the coordinates of those points
			//System.out.println("The point p1 is at....
				
		//Compute the Euclidean distance between p1 and p2
				double distance_p1_p2;
				//distance = ... Math.sqrt(Match.pow(...)...);
				System.out.println(Math.sqrt(4));
				System.out.println("The distance between p1 and p2 is "+distance_p1_p2);

		/*The distance between the polyline and polygon should be the
		 * shortest distance (Math.min()) between the points that form
		 * the polyline and the points that form the polygon.
		 */

			//First point equal last point?
				if(...) {
					System.out.println("A polygon!");
				}
				else{
					//...
				}
	}

}