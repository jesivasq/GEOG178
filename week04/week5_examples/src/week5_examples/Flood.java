package week5_examples;

public class Flood extends Disaster {
	
	public Flood(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
		this.setDuration(3);
	}
	
	public Flood(Point UL, Point LR) {
		super(UL, LR);
		this.setDuration(3);
	}
	
	public String getType() { 
		return "Flood";
	}

}
