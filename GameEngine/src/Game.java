import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Game extends JFrame {

	static final int WIDTH = 1108;
	static final int HEIGHT = 808;

	GameStateMachine stateMachine;

	public Game() {

		setIgnoreRepaint(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Canvas canvas = new Canvas();
		canvas.setIgnoreRepaint(true);
		canvas.setSize(WIDTH, HEIGHT);

		add(canvas);
		pack();

		canvas.createBufferStrategy(2);

		GameFrameBuffer aGameFrameBuffer = new GameFrameBuffer(canvas);

		stateMachine = new GameStateMachine(aGameFrameBuffer);

		// Hookup keyboard polling

		addKeyListener(GameInput.instance());
		canvas.addKeyListener(GameInput.instance());

	}

	public void run() {
		stateMachine.gameLoop();
	}

	public static void main(String[] args) {
		Game app = new Game();
		app.setTitle("A Simple Game");
		app.setVisible(true);
		app.run();
		System.exit(0);
	}
}