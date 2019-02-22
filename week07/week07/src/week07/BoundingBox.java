package week07;

public class BoundingBox {

	// Points are used to form the upper left and lower right corners of the bounding box
	private Point ul, lr;
	
	public Point getUl() {
		return ul;
	}

	public void setUl(Point ul) {
		this.ul = ul;
	}

	public Point getLr() {
		return lr;
	}

	public void setLr(Point lr) {
		this.lr = lr;
	}

	public BoundingBox(Point a, Point b){
		ul = a;
		lr = b;
	}
	
	public String toString(){
		return "Point 1 ("+ul.getX()+","+ul.getY()+"); point 2 ("+lr.getX()+","+lr.getY()+")";
	}
	
	//The getX() and getY() methods of Point are used to determine whether the point is inside
	public boolean isInside(Point p){

		if(
		       ul.getX()<p.getX()  
		    && lr.getX()>p.getX()
		    && ul.getY()<p.getY()
		    && lr.getY()>p.getY()){
				return true;
		}
		else{
			return false;
		}
	}
}
