package structure;

public class Test {

	public static void main(String[] args) {
		
		// Test Point
		Point p = new Point( 2, 2);
		System.out.println("Point Area: " + p.getArea());
		System.out.println("Point Length: " + p.getLength());
		System.out.println("");
		
		// Test circle	
		Circle c = new Circle(p, 3);
		System.out.println("Circle Area: " + c.getArea());
		System.out.println("Circle Length: " + c.getLength());
		System.out.println("");
		
		// Test rectangle
		Rectangle r = new Rectangle(p.getX(), p.getY(), 3, 4);
		System.out.println("Rectangle Area: " + r.getArea());
		System.out.println("Rectangle Length: " + r.getLength());
		System.out.println("");
		
		// Test square
		Square s = new Square(p.getX(), p.getY(), 5);
		System.out.println("Square Area: " + s.getArea());
		System.out.println("Square Length: " + s.getLength());
		System.out.println("");
		
		// test polys
		Point p1 = new Point(3, 4);
		Point p2 = new Point(5, 6);
		Point p3 = new Point(7, 8);
		
		// test polyline
		Polyline pl = new Polyline(p1, p2, p3);
		System.out.println("Polyline Area: " + pl.getArea());
		System.out.println("Polyline Length: " + pl.getLength());
		System.out.println("Polyline Point count: " + pl.getPointCount());
		System.out.println("");
		
		// test polygon
		Polygon pg = new Polygon(p1, p2, p3);
		System.out.println("Polygon Area: " + pg.getArea());
		System.out.println("Polygon Length: " + pg.getLength());
		System.out.println("Polygon Point count: " + pg.getPointCount());
		System.out.println("");
		
		// test bounding box
		BoundingBox bb = new BoundingBox(p1.getX(), p1.getY(), 30, 40);
		if( bb.isInside(p2)) {
			System.out.println("Point 2 is inside the bounding box.");
		} else {
			System.out.println("Point 2 is outside the bounding box.");
		}
		Point p4 = new Point(0,0);
		if(bb.isInside(p4)) {
			System.out.println("Point 4 is inside the bounding box.");
		} else {
			System.out.println("Point 4 is outside the bounding box.");
		}
		System.out.println("");
		
		// Test point buffer
		Point p5 = new Point(5, 5);
		PointBuffer pb = new PointBuffer(p5, 5);
		if( pb.isInside(p5)) {
			System.out.println("p5 is inside the point buffer.");
		} else {
			System.out.println("p5 is outside the point buffer.");
		}
		if( pb.isInside(p4)) {
			System.out.println("p4 is inside the point buffer.");
		} else {
			System.out.println("p4 is outside the point buffer.");
		}
	}

}
