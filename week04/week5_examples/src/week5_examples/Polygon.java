package week5_examples;

import java.util.ArrayList;

// Polygon extends Polyline
public class Polygon extends Polyline {
	
	public Polygon() {
		setPoints(new ArrayList<Point>());
	}
		
	public Polygon(ArrayList<Point> points) {
		super(points);
	}
	
	// Override check valid with new values
	public boolean checkValid() {
		return getPoints().size() >= 3;
	}
	
	public String getType() {
		return "POLYGON";
	}
	
	// Make valid geometries

	public boolean makeValid(){
		
		if(!checkValid()) return false;
		
	    Point first = getPoints().get(0);
		Point last = getPoints().get(getPoints().size() - 1);
		
		if(first.getX() != last.getX() || first.getY() != last.getY()) { 
			return getPoints().add(first); 
		}
		
		return true;
	}
	
}
