package structure;

import java.util.*;

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
		
		
		// Test point buffer

	}

}
