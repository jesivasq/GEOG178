import java.io.Serializable;

public class POI extends PointBuffer implements Serializable {

	private String name;
	private boolean visited;
	
	public POI(Point p, double r, String name, boolean visited) {
		super(p,r);
		this.name = name;
		this.visited = visited;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
}
