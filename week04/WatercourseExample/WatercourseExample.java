package edu.geog.ucsb.week5;

import java.util.ArrayList;
import java.util.Iterator;

public class WatercourseExample {

	public static void main(String[] args) {
		
		// A list of watercourses (that can only store watercourses)
		ArrayList<Watercourse> watercourses = new ArrayList<Watercourse>();
		
		// Adding watercourses and their length
		watercourses.add(new Watercourse(1246));
		watercourses.add(new Watercourse(541));
		watercourses.add(new Watercourse(1496));
		watercourses.add(new Watercourse(996));
		
		// Adding a river; we can do so as all rivers are watercourses
		watercourses.add(new River(766, new Spring("Rheinquelle")));
		
		// We will use this to iterate through the list of watercourses
		Iterator<Watercourse> wciterator = watercourses.iterator();
		
		// Just to temporarily store the next watercourse
		Watercourse tmp = new Watercourse(0);
		
		// Loop through the watercourses as long as there is a next one
		while(wciterator.hasNext()){
			tmp = wciterator.next(); // take the next one
			
			// All watercourses have a length, including rivers
			System.out.println("length: "+tmp.getLength()); 
			
			// Rivers also have a spring but not all watercourses do.
			if(tmp instanceof River){
				//Cast the watercourse into a river object
				System.out.println("Spring name: "+((River)tmp).getOrigin().getName());
			}
		}
	}

}
