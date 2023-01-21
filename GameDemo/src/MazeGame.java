
@SuppressWarnings("serial")
public class MazeGame extends Game {

	public MazeGame() {
		GameState welcome = new WelcomeState();
		GameState youLose = new GameLostState();
		GameState youWin = new GameWonState();
		GameState level1 = new Level1State();
		GameState level2 = new Level2State();
		// stateMachine.installState("Play", play);

		stateMachine.installState("Welcome", welcome);
		stateMachine.installState("GameLost", youLose);
		stateMachine.installState("GameWon", youWin);
		stateMachine.installState("Level1", level1);
		stateMachine.installState("Level2", level2);

		stateMachine.setStartState(welcome);
	}

	public static void main(String[] args) {
		Game app = new MazeGame();
		app.setTitle("~Maze Game!~");
		app.setVisible(true);
		app.run();
		System.exit(0);
	}
}
