package Evacuation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Evacuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> s = new ArrayList<String>();
		s.add("foo");
		s.add("bar");
		Iterator i = s.iterator();
		
		while(i.hasNext())
			System.out.println(i.next().toString());
		
		ArrayList<Building> b = new ArrayList<Building>();
		b.add(new Farm(new Point(1,2)));
		b.add(new Store(new Point(3,4)));
		b.add(new Hospital(new Point(5,6)));
		
		Iterator buildings = b.iterator();
		while(buildings.hasNext())
			System.out.println(buildings.next().toString());
		
		
	}

}
