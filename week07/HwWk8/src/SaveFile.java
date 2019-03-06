

import java.io.Serializable;
import java.util.ArrayList;

public class SaveFile implements Serializable{
	private ArrayList<POI> poi = new ArrayList<POI>();
	private ArrayList<Point> waypoint = new ArrayList<Point>();
	
	public SaveFile(ArrayList<POI> poi, ArrayList<Point> waypoint) {
		this.poi = poi;
		this.waypoint = waypoint;
	}

	public ArrayList<POI> getPoi() {
		return poi;
	}

	public void setPoi(ArrayList<POI> poi) {
		this.poi = poi;
	}

	public ArrayList<Point> getWaypoint() {
		return waypoint;
	}

	public void setWaypoint(ArrayList<Point> waypoint) {
		this.waypoint = waypoint;
	}
	
	
	
}
