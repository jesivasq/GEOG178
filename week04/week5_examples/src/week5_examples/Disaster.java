package week5_examples;

public class Disaster extends BoundingBox {
	
	private int duration; // the number of weeks a disaster lasts

	public Disaster(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
		this.setDuration(0);
	}
	
	public Disaster(Point UL, Point LR) {
		super(UL, LR);
		this.setDuration(0);
	}
	
	public String getType() { 
		return "Disaster";
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int d) {
		this.duration = d;
	}
}
