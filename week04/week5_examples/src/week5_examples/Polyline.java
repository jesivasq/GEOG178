package week5_examples;

// Imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Polyline {
	
	//Member Variables
	
	private ArrayList <Point> points;
	
	//Constructors
	public Polyline() {
		setPoints(new ArrayList<Point>());
	}
	
	public Polyline(ArrayList<Point> points) {
		this.setPoints(points);
	}
	
	// Delegates
	public boolean add(Point e) {
		return getPoints().add(e);
	}
	
	public int size() {
		return getPoints().size();
	}
	
	// Getters 
	
	public String getType() {
		return "POLYLINE";
	}
	
	public ArrayList<Point> getPoints(){
		return points;
	}

	//Setters 
	public void setPoints(ArrayList <Point> points) {
		this.points = points;
	}
	
	//Overrides 
	
	public String toString() {
		return this.getType() + " " +Arrays.toString(getPoints().toArray());
	}
	
	//Methods
	public boolean checkValid() {
		return getPoints().size() >= 2;
	}
	

	
	public double getLength() {
			Iterator<Point> pointIterator = getPoints().iterator();
			Point lastP = pointIterator.next();
			Double distance = 0.0;
			while (pointIterator.hasNext()) {
				Point p = pointIterator.next();
				distance += lastP.distance(p);
				lastP = p;
			}
			return distance;
		}
}

