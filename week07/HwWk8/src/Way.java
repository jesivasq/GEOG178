import java.io.Serializable;

public class Way implements Serializable{
	private Point p1, p2;
	
	// Constructor
	public Way(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
	// Getters and Setters
	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	

	
	
	
	
}
