
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
		elapsedTime += deltaTimeAverage * 0.01;
		float A = (endPosX - startPosX)/2;
		float B = (endPosX + startPosX)/2;
		currentX = (float) (A * Math.sin(elapsedTime) + B);
		A = (endPosY - startPosY)/2;
		B = (endPosY + startPosY)/2;
		currentY = (float) (A * Math.sin(elapsedTime) + B);
		
	}


	public void FireBullet(float playerX, float playerY) {
		this.hasShot = true;
		System.out.println("Guard shot a bullet");
			
		
	}
}