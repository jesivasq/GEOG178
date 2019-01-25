
public class Rect {

	private double width, height;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	private int numberOfEdges;
	private boolean isSquare;
	
	public Rect(double width, double height){
		this.width = width;
		this.height = height;
		numberOfEdges = 4;
	}
	
	public int getNumberOfEdges() {
		return numberOfEdges;
	}
	
	public double computeArea() {
		return Math.abs(width * height);
	}
	
	public boolean isSquare(){
		
		return isSquare;
	}
	
	//...
}
