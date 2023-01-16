
public class Guard {

	public int startPosX, startPosY;
	public int endPosX, endPosY;
	public float currentX, currentY;
	public boolean hasShot;
	private double elapsedTime = 0;

	public Guard(int startPositionX, int startPositionY, int endPositionX, int endPositionY) {
		this.startPosX = startPositionX;
		this.startPosY = startPositionY;
		this.endPosX = endPositionX;
		this.endPosY = endPositionY;
		this.currentX = startPositionX;
		this.currentY = startPositionY;
		this.hasShot = false;
	}

	public void UpdatePosition(float deltaTimeAverage) {
		elapsedTime += deltaTimeAverage * 0.002;
		currentX = (float) (((endPosX - startPosX)/2) * Math.sin(elapsedTime) + ((endPosX + startPosX)/2));
		currentY = (float) (((endPosY - startPosY)/2) * Math.sin(elapsedTime) + ((endPosY + startPosY)/2));
		
	}


	public void FireBullet(float playerX, float playerY) {
		this.hasShot = true;
		System.out.println("Guard shot a bullet");
			
		
	}
}