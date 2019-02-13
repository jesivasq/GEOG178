package structure;

public interface BoundingArea extends Geometry {
	public boolean isInside(Point p);
}
