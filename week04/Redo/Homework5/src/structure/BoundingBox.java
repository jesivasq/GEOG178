package structure;

public class BoundingBox extends Rectangle implements BoundingArea{

	
	public BoundingBox(double x, double y, double width, double height) {
		super(x, y, width, height);
	}
	
	public boolean isInside(Point p) {
		boolean inside = false;
		
		if(p.getX() >= this.x &&
			p.getX() <= this.x + this.width &&
			p.getY() >= this.y &&
			p.getY() <= this.y + this.height ) {
			inside = true;
		}
		
		return inside;
		
	}
}
