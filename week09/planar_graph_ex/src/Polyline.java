import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class Polyline {
	// Define a arrayList which stores the point class objects
	private ArrayList<Point> points; 

	// The constructor creates an empty ArrayList of points
	public Polyline() {
		points = new ArrayList<Point>();
	}

	// This method gets the polyline ArrayList
	public ArrayList<Point> getPolyline() {
		return points;
	}
	
	// Adds point to polyline
	public boolean addPoint(Point p) {
		return points.add(p);
	}
	
	public Point get(int i) {
		return points.get(i);
	}
	
	// Returns amount of points in polyline
	public int size() {
		return points.size();
	}
	
	// Returns length of polyline
	public double getLength() {
		Iterator<Point> pointIterator = points.iterator();
		if (pointIterator.hasNext()) {
			Point lastP = pointIterator.next();
			Double distance = 0.0;
			while (pointIterator.hasNext()) {
				Point p = pointIterator.next();
				distance += lastP.distance(p);
				lastP = p;
			}
			return distance;
		} else {
			return 0.0;
		}
	}
	
	// Draws polyline
	public void draw(Graphics g) {
		Iterator<Point> pointIterator = points.iterator();
    	g.setColor(Color.BLUE);
		if (pointIterator.hasNext()) {
			Point lastP = pointIterator.next();
			g.fillOval((int) lastP.getX() - 3, (int) lastP.getY() - 3, 6, 6);
			while (pointIterator.hasNext()) {
				Point p = pointIterator.next();
				g.fillOval((int) p.getX() - 3, (int) p.getY() - 3, 6, 6);
				g.drawLine(
					(int) lastP.getX(), 
					(int) lastP.getY(), 
					(int) p.getX(), 
					(int) p.getY()
				);
				lastP = p;
			}
		}
	}
}
