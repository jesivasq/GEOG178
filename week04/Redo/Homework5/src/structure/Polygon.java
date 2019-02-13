package structure;

public class Polygon extends Polyline{

	public Polygon(Point ...p) {
		super(p);
		// make sure the polygon is closed
		if(ary.get(0) != ary.get(ary.size()-1)) {
			ary.add(ary.get(0));
		}
	}
}
