import java.awt.geom.Point2D;

//import BSPTree;

public class Bullet {

	public float currentX;
	public float currentY;
	public double dX, dY;
	public final double speed = 3.5;
	// private double elapsedTime = 0;

	public Bullet(Line moveDirection) {
		// WE NEED TO CALCULATE DX AND DY (with direction)
		currentX = moveDirection.start.x;
		currentY = moveDirection.start.y;
		double sizeOfMoveDirection = Math.sqrt(Math.pow((moveDirection.finish.x - moveDirection.start.x), 2)
				+ Math.pow((moveDirection.finish.y - moveDirection.start.y), 2));

		dX = (moveDirection.finish.x - moveDirection.start.x) / sizeOfMoveDirection;
		dY = (moveDirection.finish.y - moveDirection.start.y) / sizeOfMoveDirection;
	}

	public boolean UpdatePosition(BSPNode root) {
		// elapsedTime += deltaTimeAverage * 0.008;
		float newX = (float) (currentX + (dX * speed));
		float newY = (float) (currentY + (dY * speed));
		if (BSPTree.ThereIsLineOfSight(new Line(new Point2D.Float(currentX, currentY), new Point2D.Float(newX, newY)),
				root)) {
			currentX = newX;
			currentY = newY;
			return true;
		} else {
			return false;
		}

	}

}
