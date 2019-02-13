package structure;

import java.util.*;

public class Polyline implements Polypoints {
	ArrayList<Point> ary = new ArrayList<Point>();
	
	public Polyline(Point ...p) {
		for(Point i:p) {
			ary.add(i);
		}
	}
	
	public ArrayList<Point> getPoints(){
		return ary;
	}
	
	public void setPoints(Point ...p) {
		for(Point i:p) {
			ary.add(i);
		}
	}
	
	public int getPointCount() {
		return ary.size();
	}
	
	public double getLength() {
		double dist = 0;
		
		for (int i = 1 ; i < ary.size(); i++) {
			dist += ary.get(i).distance(ary.get(i-1));
		}
		return dist;
	}
	
	public double getArea() {
		return 0;
	}
	
	
}
