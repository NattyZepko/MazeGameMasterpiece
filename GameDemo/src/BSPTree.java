import java.awt.geom.Point2D;

public class BSPTree {

	public static boolean ThereIsLineOfSight(Line segment, BSPNode root) {
		// root is an Area
		if (root.isArea()) {
			if (!root.isIn()) {// if we are out of bounds
				return false;
			}
			return true;
		}

		// root is a LINE
		Line[] segments = splitSegment(root.getLine(), segment);
		boolean a = true, b = true;
		if (segments[0] != null)
			a = ThereIsLineOfSight(segments[0], root.getLeftChild());
		if (segments[1] != null)
			b = ThereIsLineOfSight(segments[1], root.getRightChild());
		return (a && b);
	}

	public static Line[] splitSegment(Line vector, Line segment) {
		Line[] result = new Line[2];
		Point2D.Float intersection = getIntersection(vector, segment);
		if (intersection == null) {
			// THE LINES ARE PARALLEL AND DO NOT INTERSECT
			if (isOnLeft(vector, segment))
				result[0] = segment;
			else
				result[1] = segment;
			return result;
		}
		if (pointIsOnSegment(intersection, segment)) {
			if (isOnLeft(vector, segment)) {
				result[0] = new Line(segment.start, intersection);
				result[1] = new Line(intersection, segment.finish);
			} else {
				result[0] = new Line(segment.finish, intersection);
				result[1] = new Line(intersection, segment.start);
			}
			return result;
		} else // The intersection is outside the line segment
		if (isOnLeft(vector, segment))
			result[0] = segment;
		else
			result[1] = segment;
		return result;
	}

	// returns a point where 2 lines intersect (mathematically, REGARDLESS OF
	// LENGTH).
	private static Point2D.Float getIntersection(Line line1, Line line2) {
		float A1 = line1.finish.y - line1.start.y;
		float B1 = line1.start.x - line1.finish.x;
		float C1 = A1 * line1.start.x + B1 * line1.start.y;

		float A2 = line2.finish.y - line2.start.y;
		float B2 = line2.start.x - line2.finish.x;
		float C2 = A2 * line2.start.x + B2 * line2.start.y;

		float determinant = A1 * B2 - A2 * B1;

		if (determinant == 0) {
			// The lines are parallel
			return null;
		} else {
			float x = (B2 * C1 - B1 * C2) / determinant;
			float y = (A1 * C2 - A2 * C1) / determinant;
			return new Point2D.Float(x, y);
		}
	}

	// Check if point is on the line segment formed by line.start and line.finish
	private static boolean pointIsOnSegment(Point2D.Float point, Line line) {
		return point.x <= Math.max(line.start.x, line.finish.x) && point.x >= Math.min(line.start.x, line.finish.x)
				&& point.y <= Math.max(line.start.y, line.finish.y) && point.y >= Math.min(line.start.y, line.finish.y);
	}

	/*
	 * Check if the point is on the left side of the line This uses vector cross
	 * product multiplication.
	 */
	public static boolean isOnLeft(Line vector, Point2D.Float point) {
		return ((vector.finish.x - vector.start.x) * (point.y - vector.start.y))
				- ((vector.finish.y - vector.start.y) * (point.x - vector.start.x)) < 0;

	}

	// Check if a segment is on the left side of the line
	public static boolean isOnLeft(Line vector, Line segment) {
		return !isOnRight(vector, segment);
	}

	// Check if a segment is on the right side of the line
	public static boolean isOnRight(Line vector, Line segment) {
		return !isOnLeft(vector, segment.start);
	}
	
	/*public static Polygon getFinishNode(BSPNode root)
	{
		if (root == null)
			return null;
		if(root.isFinishArea())
			return root.getArea();
		if(root.getLeftChild() != null)
			return getFinishNode(root.getLeftChild());
		if(root.getRightChild() != null)
			return getFinishNode(root.getRightChild());
		return null;
		
	}*/

}
