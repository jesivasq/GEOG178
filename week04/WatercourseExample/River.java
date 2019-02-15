package edu.geog.ucsb.week5;

// All rivers are watercourses and have a spring in addition to the length
public class River extends Watercourse{
	
	private Spring origin;
	
	public River(int length, Spring origin){
		super(length);
		this.origin = origin;
	}
	
	public Spring getOrigin() {
		return origin;
	}

	public void setOrigin(Spring origin) {
		this.origin = origin;
	}
	
}