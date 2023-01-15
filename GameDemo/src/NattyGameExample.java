
@SuppressWarnings("serial")
public class NattyGameExample extends Game {

	public NattyGameExample() {
		GameState welcome = new WelcomeState();
		GameState youLose = new GameLostState();
		GameState youWin = new GameWonState();
		GameState level1 = new Level1State(3);
		GameState level2 = new Level2State(3);
		//stateMachine.installState("Play", play);
		
		stateMachine.installState("Welcome", welcome);
		stateMachine.installState("GameLost", youLose);
		stateMachine.installState("GameWon", youWin);
		stateMachine.installState("Welcome", welcome);
		stateMachine.installState("Level1", level1);
		stateMachine.installState("Level2", level2);

		stateMachine.setStartState(welcome);
	}

	public static void main(String[] args) {
		Game app = new NattyGameExample();
		app.setTitle("Natty Game Example");
		app.setVisible(true);
		app.run();
		System.exit(0);
	}
}
