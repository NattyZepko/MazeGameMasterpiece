import java.awt.geom.Point2D;

public class Guard {

	public int startPosX, startPosY;
	public int endPosX, endPosY;
	public float currentX, currentY;
	private double elapsedTime = 0;

	public Guard(int startPositionX, int startPositionY, int endPositionX, int endPositionY) {
		this.startPosX = startPositionX;
		this.startPosY = startPositionY;
		this.endPosX = endPositionX;
		this.endPosY = endPositionY;
		this.currentX = startPositionX;
		this.currentY = startPositionY;

	}

	public void UpdatePosition(float deltaTimeAverage) {
		elapsedTime += deltaTimeAverage * 0.002;
		currentX = (float) (((endPosX - startPosX) / 2) * Math.sin(elapsedTime) + ((endPosX + startPosX) / 2));
		currentY = (float) (((endPosY - startPosY) / 2) * Math.sin(elapsedTime) + ((endPosY + startPosY) / 2));

	}

	public Bullet FireBullet(float playerX, float playerY) {
		return new Bullet(new Line(new Point2D.Float(currentX, currentY), new Point2D.Float(playerX, playerY)));
	}
}