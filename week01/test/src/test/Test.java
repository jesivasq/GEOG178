package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ASSIGNMENT 1
		// DUE 01/16/2019 EOD
		// ----------------------------------------------
		// JESI VASQUEZ
		// 01/14/2018
		// ----------------------------------------------
		// Describe what a for loop and if statement is 
		// in your own words
		
		/*
		 * A for loop is a way to get a program to execute
		 * a series of commands over and over again for a 
		 * fixed number of times.
		 * 
		 * An if statement is a way to allow different commands
		 * to be executed by your program depending on what
		 * different conditions are met.
		 */
		
		
		// ----------------------------------------------
		// Compute the Euclidean distance between two points
		// in a 2D Cartesian coordinate system using
		// Math.sqrt() and Math.pow().
		
		// Point 1 is located at (x1, y1)
		double x1 = 2;
		double y1 = 3;
		
		// Point 2 is located at (x2, y2)
		double x2 = 5;
		double y2 = 7;
		
		// The distance from Point 1 to Point 2 is the square
		// root of the sum of the squares of the change in x
		// plus the change in y; that is, if 
		// a^2 + b^2 = c^2
		// then c = sqrt( a^2 + b^2 )
		double dist = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
		System.out.println("The distance is " + dist + " units");
		
		// ----------------------------------------------
		// Define a polyline and a polygon and compute the
		// distance between both.
		// Optional: check whether the polygon is closed
		
		// set coordinates for a polyline
		double lineX1 = x1;
		double lineY1 = y1;
		double lineX2 = x2;
		double lineY2 = y2;
		double lineX3 = 3;
		double lineY3 = 4;
		
		// set coordinates for a polygon
		double polygonX1 = 10;
		double polygonY1 = 3;
		double polygonX2 = 10;
		double polygonY2 = 9;
		double polygonX3 = 8;
		double polygonY3 = 6;
		double polygonX4 = 10;
		double polygonY4 = 3;
		
		// create three vars for testing the distance
		double dist1, dist2, distMin;

		
		// test to see which set of points is closest to each other
		// first, look at polyline's point 1 and compare the distance to each point in the polygon
		dist1 = Math.sqrt( Math.pow(lineX1 - polygonX1, 2) + Math.pow(lineY1 - polygonY1, 2) );
		dist2 = Math.sqrt( Math.pow(lineX1 - polygonX2, 2) + Math.pow(lineY1 - polygonY2, 2) );
		distMin = Math.min(dist1, dist2);

		dist1 = Math.sqrt( Math.pow(lineX1 - polygonX3, 2) + Math.pow(lineY1 - polygonY3, 2) );
		dist2 = Math.sqrt( Math.pow(lineX1 - polygonX4, 2) + Math.pow(lineY1 - polygonY4, 2) );
		distMin = Math.min(dist1, dist2);
		
		// next, look at polyline's point 2 and compare the distance to each point in the polygon
		dist1 = Math.sqrt( Math.pow(lineX2 - polygonX1, 2) + Math.pow(lineY2 - polygonY1, 2) );
		dist2 = Math.sqrt( Math.pow(lineX2 - polygonX2, 2) + Math.pow(lineY2 - polygonY2, 2) );
		distMin = Math.min(dist1, dist2);

		dist1 = Math.sqrt( Math.pow(lineX2 - polygonX3, 2) + Math.pow(lineY2 - polygonY3, 2) );
		dist2 = Math.sqrt( Math.pow(lineX2 - polygonX4, 2) + Math.pow(lineY2 - polygonY4, 2) );
		distMin = Math.min(dist1, dist2);
		

		// finally, look at polyline's point 3 and compare the distance to each point in the polygon
		dist1 = Math.sqrt( Math.pow(lineX3 - polygonX1, 2) + Math.pow(lineY3 - polygonY1, 2) );
		dist2 = Math.sqrt( Math.pow(lineX3 - polygonX2, 2) + Math.pow(lineY3 - polygonY2, 2) );
		distMin = Math.min(dist1, dist2);

		dist1 = Math.sqrt( Math.pow(lineX3 - polygonX3, 2) + Math.pow(lineY3 - polygonY3, 2) );
		dist2 = Math.sqrt( Math.pow(lineX3 - polygonX4, 2) + Math.pow(lineY3 - polygonY4, 2) );
		distMin = Math.min(dist1, dist2);
		
		// Print out the results
		System.out.println("The shortest distance is " + distMin + " units");
		
		// test to see if the polygon is closed
		if(polygonX1 == polygonX4 && polygonY1 == polygonY4) {
			System.out.println("The polygon is closed.");
		} else {
			System.out.println("The polygon is a polyline.");
		}
				
		
	}

}
