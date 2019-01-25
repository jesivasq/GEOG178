package edu.ucsb.geog;

// Your task: find the modeling errors.

public class Rectangle {

	double a,b;
	private int numberOfEdges;
	private boolean isSquare;
	
	public Rectangle(double a, double b){
		this.a = a;
		this.b = b;
		if(a==b)
			this.isSquare = true;
		else
			isSquare = false;
		numberOfEdges = 4;
	}
	
	public int getNumberOfEdges() {
		return numberOfEdges;
	}
	
	public double computeArea() {
		return a*b;
	}
	
	public boolean isSquare(){
		return isSquare;
	}
	
	//...
}