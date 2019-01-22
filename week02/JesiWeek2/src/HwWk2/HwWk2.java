package HwWk2;

public class HwWk2 {

	public static void main(String[] args) {
		
		// Read about methods and classes and describe them in 
		// your own words
		/*
		 * A Class is like a blueprint for an object. It defines
		 * what features an object will have (attributes) and what it will be
		 * able to do (methods). An object is an instantiation of 
		 * a class. (So, if a class is a blueprint for how to design a
		 * chair, an object is the chair itself).
		 * 
		 * A method (also called a subroutine, a function, or a
		 * procedure) is a definition of something an object can
		 * do; an action it can take. 
		 * 
		 */
		
		
		// Define a Point and a Bounding Box class
		/*
		 *  See JPoint.java and JBoundingBox.java
		 *  for class definition and methods
		 */
			
		// Define a test class, some points, and a bounding
		// box. Test whether the points are inside the 
		// bounding box and compute the distance between 
		// the points.
		
		// bounding box
		JPoint p1 = new JPoint(1.0, 6.0 );
		JPoint p2 = new JPoint(7.0, 3.0 );
		JBoundingBox b = new JBoundingBox(p1, p2);
		
		// test points
		JPoint p3 = new JPoint(5.0, 4.0); // inside
		JPoint p4 = new JPoint(0,0); // outside
		
		// boolean for testing
		boolean test = false;
		
		// test the points' position relative to the box
		test = b.isInside(p3);
		System.out.println("(Result was " + test + ")\n");
		
		test = b.isInside(p4);
		System.out.println("(Result was " + test + ")\n");
		
		// calculate the distance
		System.out.println("The distance between the points in the bounding box is:");
		System.out.println( p1.distance(p2) + " units.\n" );
		
		// test the getters a bit
		System.out.println("The upper left of the box is at");
		System.out.println(b.getTopLeft().getX() + ", " + b.getTopLeft().getY() + "\n");

		// test the setters a bit
		p4.setX(p1.getX());
		p4.setY(p1.getY());
		System.out.println("The distance between two identical points is:");
		System.out.println(p1.distance(p4) + " units.");
		
		
		
	}

}

