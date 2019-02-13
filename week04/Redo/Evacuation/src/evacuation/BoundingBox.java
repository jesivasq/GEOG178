package evacuation;

public class BoundingBox extends Polyline{

	public BoundingBox(Point upLeft, Point lowRight) {
		Point ul = upLeft;
		Point ur = new Point(lowRight.getX(), upLeft.getY());
		Point lr = lowRight;
		Point ll = new Point(upLeft.getX(), lowRight.getY());
		
		super(ul, ur, lr, ll);
	}
}
