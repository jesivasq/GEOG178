package Evacuation;

public class Building {

	// super class for Farm, Hospital, and Store
	Point location;
	String type;
	
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
