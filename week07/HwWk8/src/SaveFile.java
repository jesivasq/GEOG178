

import java.io.Serializable;
import java.util.ArrayList;

public class SaveFile implements Serializable{
	private ArrayList<POI> poi = new ArrayList<POI>();
	private ArrayList<Way> way = new ArrayList<Way>();
	private ArrayList<PointBuffer> node = new ArrayList<PointBuffer>();
	
	// Constructor
	public SaveFile(ArrayList<POI> poi, ArrayList<Way> way, ArrayList<PointBuffer> node) {
		super();
		this.poi = poi;
		this.way = way;
		this.node = node;
	}

	// Getters and Setters
	public ArrayList<POI> getPoi() {
		return poi;
	}

	public void setPoi(ArrayList<POI> poi) {
		this.poi = poi;
	}

	public ArrayList<Way> getWay() {
		return way;
	}

	public void setWay(ArrayList<Way> way) {
		this.way = way;
	}

	public ArrayList<PointBuffer> getNode() {
		return node;
	}

	public void setNode(ArrayList<PointBuffer> node) {
		this.node = node;
	}
	
	


	
	
	
}
