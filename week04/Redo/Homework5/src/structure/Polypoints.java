package structure;

import java.util.*;

public interface Polypoints extends Geometry {
	
	public ArrayList<Point> getPoints();
	public void setPoints(Point ...p);
	public int getPointCount();
	
}
