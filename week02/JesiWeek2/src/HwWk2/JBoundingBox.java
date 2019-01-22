package HwWk2;

public class JBoundingBox {
	// -------------
	// Attributes
	// -------------	
	JPoint topLeft;
	JPoint botRight;
	
	// -------------
	// Constructors
	// -------------
	
	// using JPoint values
	public JBoundingBox (JPoint topLeft, JPoint botRight) {
		this.topLeft = new JPoint(topLeft.getX(), topLeft.getY());
		this.botRight = new JPoint(botRight.getX(), botRight.getY());
	}
	
	// using x and y values
	public JBoundingBox(double topLeftX, double topLeftY, double botRightX, double botRightY) {
		this.topLeft = new JPoint(topLeftX, topLeftY);
		this.botRight = new JPoint(botRightX, botRightY);
	}
	
	// -------------
	// Getters
	// -------------
	
	public JPoint getTopLeft() {
		return topLeft;
	}
	
	public JPoint getBotRight() {
		return botRight;
	}
	
	// -------------
	// Setters
	// -------------
	public void setTopLeft(JPoint p) {
		topLeft.setX(p.getX());
		topLeft.setY(p.getY());
	}
	
	public void setBotRight(JPoint p) {
		botRight.setX(p.getX());
		botRight.setY(p.getY());
	}

	
	
	// -------------
	// Additional Methods
	// -------------
	// test to see if the given point is inside the boundaries
	// of this box
	public boolean isInside(JPoint pointy) {
		if( 	   pointy.getX() >= topLeft.getX() 
				&& pointy.getX() <= botRight.getX()
				&& pointy.getY() <= topLeft.getY()
				&& pointy.getY() >= botRight.getY()	) {
			System.out.println("The point is inside the box.");
			return true;
		} else {
			System.out.println("The point is not inside the box.");
			return false;
		}		
	}
	
	
}
