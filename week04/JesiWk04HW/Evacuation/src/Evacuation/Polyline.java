package Evacuation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Polyline {
	ArrayList <Point> points;
	
	public Polyline() {
		points = new ArrayList<Point>();
	}
		
	public Polyline(ArrayList<Point> points) {
		this.points = points;
	}
	
	public ArrayList<Point> getPoints() {
		return points;
	}
	
	
	
	
	public boolean add(Point e) {
		return getPoints().add(e);
	}
}
