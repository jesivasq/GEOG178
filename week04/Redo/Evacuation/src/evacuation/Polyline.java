package evacuation;

import java.util.*;

public class Polyline {

	ArrayList<Point> a = new ArrayList<Point>();
	
	public Polyline(Point ...p) {
		for(Point i:p) {
			a.add(i);
		}
		
		if( a.size() == 1) {
			System.out.println("this is a point");
		} else if ( a.size() == 0) {
			System.out.println("invalid");
		} else {
			System.out.println("This line has " + a.size() + " points");
		}
	}
	
}
