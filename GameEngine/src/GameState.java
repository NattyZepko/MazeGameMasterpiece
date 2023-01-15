import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class GameState extends GameInputEventProcessor {

	private String missingStateName;

	public void input() {
		GameInput.instance().processInput(this);
	}
	
	public void processKeyReleased(int aKeyCode) {
		if (aKeyCode == KeyEvent.VK_ESCAPE)
			System.exit(0);
	}
	
	public void update(long deltaTime) {}
	
	public String tick(Object memento, GameFrameBuffer aGameFrameBuffer) {
		
		long start = System.currentTimeMillis();
		
		enter(memento);
		
		while (isActive()) {
			input();
			update(System.currentTimeMillis() - start);
			start = System.currentTimeMillis();
			Graphics2D g = aGameFrameBuffer.graphics();
			aGameFrameBuffer.clear(g);
			render(aGameFrameBuffer);
			aGameFrameBuffer.show();
		    try {
		          Thread.sleep(10);
		        } catch (InterruptedException e) {}
		}
		
		exit();
		return next();
	}
	
	public void render(GameFrameBuffer aGameFrameBuffer) {
		Graphics2D g = aGameFrameBuffer.graphics();
		
		String text = "DO SOMETHING";
		
		if (missingStateName != null) 
			text = "YOU ARE HERE BECAUSE THERE IS NO STATE NAMED " + missingStateName;
		
		int textWidth = g.getFontMetrics().stringWidth(text);
		g.setColor(Color.white);
		g.drawString(text, (aGameFrameBuffer.getWidth()-textWidth)/2, aGameFrameBuffer.getHeight()/2);
	}
	
	public boolean isActive() { return true; }

	public void enter(Object anObject) {
		missingStateName = (String)anObject;
	}

	public void exit() {}

	public Object memento() { return null; }
	
	public String next() { return "Skip"; }

}
