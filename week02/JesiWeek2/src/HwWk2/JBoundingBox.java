package HwWk2;

public class JBoundingBox {
	double topLeftX;
	double topLeftY;
	double botRightX;
	double botRightY;
	
	public JBoundingBox(double topLeftX, double topLeftY, double botRightX, double botRightY) {
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		this.botRightX = botRightX;
		this.botRightY = botRightY;
	}
	
	public double getTopLeftX() {
		return topLeftX;
	}

	public double getTopLeftY() {
		return topLeftY;
	}

	public double getBotRightX() {
		return botRightX;
	}

	public double getBotRightY() {
		return botRightY;
	}
	
	public boolean isInside(JPoint pointy) {
		
		if( 	   pointy.getX() >= topLeftX 
				&& pointy.getX() <= botRightX
				&& pointy.getY() <= topLeftY
				&& pointy.getY() >= botRightY	) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	
	
	
}
