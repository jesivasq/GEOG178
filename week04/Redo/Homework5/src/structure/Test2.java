package structure;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		
		ArrayList<Geometry> ary = new ArrayList<Geometry>();
		
		Point p = new Point(3,4);
		
		Rectangle r = new Rectangle(p.getX(), p.getY(), 10, 5 );
		ary.add(r);
		
		Circle c = new Circle(p, 10);
		ary.add(c);
		
		Square s = new Square(p.getX(), p.getY(), 10);
		ary.add(s);
		
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		Point p3 = new Point(0,0);
		Point p4 = new Point(0,0);
		Polyline pl = new Polyline(p1, p2, p3, p4 );
		ary.add(pl);
		
		System.out.println("=========================");
		for(Geometry i:ary) {
			System.out.println(i.getClass());
			System.out.println("-------------------------");
			System.out.println("Area: " + i.getArea());
			System.out.println("Length: " + i.getLength());
			System.out.println("=========================");
		}
		
		
		
		
		
		
	}
}
