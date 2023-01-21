import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GameWonState extends GameState {

	boolean active;

	public boolean isActive() {
		return active;
	}

	public void enter(Object memento) {
		active = true;
	}

	public void processKeyReleased(int aKeyCode) {
		if (aKeyCode == KeyEvent.VK_ESCAPE)
			System.exit(0);

		if (aKeyCode == KeyEvent.VK_ENTER || aKeyCode == KeyEvent.VK_SPACE)
			active = false;
	}

	public String next() {
		return "Welcome";
	}

	public void render(GameFrameBuffer aGameFrameBuffer) {
		Graphics g = aGameFrameBuffer.graphics();

		g.setColor(Color.green);
		String text = "YOU WIN";
		int textWidth = g.getFontMetrics().stringWidth(text);
		g.drawString(text, (aGameFrameBuffer.getWidth() - textWidth) / 2, aGameFrameBuffer.getHeight() / 2);
		g.setColor(Color.white);
		text = "SCORE: " + (Level2State.lives * 100);
		g.drawString(text, (aGameFrameBuffer.getWidth() - textWidth) / 2, aGameFrameBuffer.getHeight() / 2 + 25);

		text = "PRESS ENTER / SPACE TO GO BACK";
		textWidth = g.getFontMetrics().stringWidth(text);
		g.drawString(text, (aGameFrameBuffer.getWidth() - textWidth) / 2, aGameFrameBuffer.getHeight() / 2 + 50);
	}
}
